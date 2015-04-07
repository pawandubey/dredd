/*
 * Copyright 2015 Pawan Dubey pawandubey@outlook.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pawandubey.dredd.model.language;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardOpenOption.CREATE;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public class JavaLanguage implements Language {

    private final String PATH_SEPARATOR = System.getProperty("file.separator");
    private final String stagingPath = BASE_DIR + PATH_SEPARATOR + "questions";
    private final Path file;
    private final Integer timeout;
    private final String executionDirectory;
    private final String submissionID;
    private final String name;

    public JavaLanguage(Path f, String dir, Integer time, String sID) {
        this.file = f;
        this.executionDirectory = dir;
        this.timeout = time;
        this.submissionID = sID;
        this.name = file.getFileName().toString().substring(0, file.getFileName().toString().lastIndexOf("."));
    }

    @Override
    public void compile() {
        try {
            createStagingArea();
            makeScriptsExecutable();

            Path stagingDir = Paths.get(stagingPath, executionDirectory);
            ProcessBuilder pb = new ProcessBuilder(stagingDir.toString() + PATH_SEPARATOR + "compile.sh");
            File errFile = new File(stagingDir.toString() + PATH_SEPARATOR + "error.txt");
            pb.redirectError(errFile);
            Process p = pb.start();
            p.waitFor();
            System.out.println("Compilation completed");
        }
        catch (IOException | InterruptedException ex) {
            Logger.getLogger(JavaLanguage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void execute() {
        try {
            makeScriptsExecutable();
            Path stagingDir = Paths.get(stagingPath, executionDirectory);
            ProcessBuilder pb = new ProcessBuilder(stagingDir.toString() + PATH_SEPARATOR + "execute.sh");
            File oFile = new File(stagingDir.toString() + PATH_SEPARATOR + "output.txt");
            File errFile = new File(stagingDir.toString() + PATH_SEPARATOR + "error.txt");
            File inFile = new File(stagingDir.toString() + PATH_SEPARATOR + "assets/testcase.txt");
            pb.redirectOutput(oFile);
            pb.redirectError(errFile);
            pb.redirectInput(inFile);
            Process p = pb.start();
            p.waitFor();
            System.out.println("Execution completed");
            cleanStagingArea();
        }
        catch (IOException | InterruptedException ex) {
            Logger.getLogger(JavaLanguage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void createStagingArea() throws IOException {
        Path stagingDir = Paths.get(stagingPath, executionDirectory);
        Path testFile = Paths.get(stagingDir.toString());
        //TODO: Remove hardcoded testFile location. Dynamically load the location from the questionid.
        Files.createDirectories(testFile);
        String subFile = name + ".java";
        Files.copy(file, Paths.get(testFile.toString(), subFile), StandardCopyOption.REPLACE_EXISTING
        );

        String changeDir = "cd " + stagingDir.toString();
        Path compileScript = Paths.get(testFile.toString(), "compile.sh");
        Files.createFile(compileScript);

        try (BufferedWriter bw = Files.newBufferedWriter(compileScript, CREATE)) {
            String script = changeDir + "\n" + "javac " + name + ".java";
            bw.write(script);
        }

        Path executeScript = Paths.get(testFile.toString(), "execute.sh");
        Files.createFile(executeScript);

        try (BufferedWriter bw = Files.newBufferedWriter(executeScript, CREATE)) {
            String script = changeDir + "\n" + "java " + name;
            bw.write(script);
        }      
    }

    private void cleanStagingArea() throws IOException {
        Path stagingDir = Paths.get(stagingPath, executionDirectory);
        Path testFile = Paths.get(stagingDir.toString());
        Files.deleteIfExists(Paths.get(testFile.toString(), name + ".java"));
        Files.deleteIfExists(Paths.get(testFile.toString(), name + ".class"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "compile.sh"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "execute.sh"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "output.txt"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "error.txt"));
    }

    private void makeScriptsExecutable() throws IOException, InterruptedException {
        Path stagingDir = Paths.get(stagingPath, executionDirectory);
        Set<PosixFilePermission> perms = new HashSet<>();
        //add owners permission
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        //add group permissions
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        //add others permissions
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);
        Files.setPosixFilePermissions(Paths.get(stagingDir + PATH_SEPARATOR + "compile.sh"), perms);
        Files.setPosixFilePermissions(Paths.get(stagingDir + PATH_SEPARATOR + "execute.sh"), perms);
        
    }
}
