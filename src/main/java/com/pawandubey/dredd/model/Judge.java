/*
 * Copyright 2015 shubheksha.
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
package com.pawandubey.dredd.model;

import com.pawandubey.dredd.model.language.Language;
import static com.pawandubey.dredd.model.language.Language.BASE_DIR;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shubheksha
 */
public class Judge {
    private final Language language;
    private final String FILE_EXTENSION;
    private final String PATH_SEPARATOR = System.getProperty("file.separator");
    private final String stagingPath = BASE_DIR + PATH_SEPARATOR + "questions";
    private final String executionDirectory;
    private final String submissionID;
    private final String name;
    private final String fileName;
    private final Integer timeout;

    public Judge(Language lang, String ePath, String sID, Integer time) {
        this.language = lang;
        this.executionDirectory = ePath;
        this.submissionID = sID;
        this.name = lang.getName();
        this.timeout = time;
        this.fileName = language.getFile().getFileName().toString().substring(0, language.getFile().getFileName().toString().lastIndexOf("."));
        if (this.name.equals(LanguageType.JAVA.name)) {
            this.FILE_EXTENSION = ".java";
        }
        else if (this.name.equals(LanguageType.CPP.name)) {
            this.FILE_EXTENSION = ".cpp";
        }
        else{
            this.FILE_EXTENSION = ".c";
        }
    }

    public void evaluate() {
        try {
            createStagingArea(language);
            makeScriptsExecutable();
            language.compile();
            language.execute();
            //cleanStagingArea();

        }
        catch (IOException | InterruptedException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void createStagingArea(Language language) throws IOException {
        Path stagingDir = Paths.get(this.stagingPath, this.executionDirectory);
        Path testFile = Paths.get(stagingDir.toString());
        Files.createDirectories(testFile);
        String subFile = this.fileName + FILE_EXTENSION;
        Files.copy(language.getFile(), Paths.get(testFile.toString(), subFile), StandardCopyOption.REPLACE_EXISTING);
        String changeDir = "cd " + stagingDir.toString();
        Path compileScript = Paths.get(testFile.toString(), "compile.sh");
        Files.createFile(compileScript);
        try (final BufferedWriter bw = Files.newBufferedWriter(compileScript, StandardOpenOption.CREATE)) {
            String script = changeDir + "\n" + language.getCompileScript() + fileName + FILE_EXTENSION;
            bw.write(script);
        }
        Path executeScript = Paths.get(testFile.toString(), "execute.sh");
        Files.createFile(executeScript);
        try (final BufferedWriter bw = Files.newBufferedWriter(executeScript, StandardOpenOption.CREATE)) {
            String script = changeDir + "\n" + language.getExecuteScript() + fileName;
            bw.write(script);
        }
    }

    private void cleanStagingArea() throws IOException {
        Path stagingDir = Paths.get(stagingPath, executionDirectory);
        Path testFile = Paths.get(stagingDir.toString());
        Files.deleteIfExists(Paths.get(testFile.toString(), name + FILE_EXTENSION));
        Files.deleteIfExists(Paths.get(testFile.toString(), name + ".class"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "a.out"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "compile.sh"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "execute.sh"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "output.txt"));
        Files.deleteIfExists(Paths.get(testFile.toString(), "error.txt"));
    }

    private void makeScriptsExecutable() throws IOException, InterruptedException {
        Path stagingDir = Paths.get(stagingPath, executionDirectory);
        Set<PosixFilePermission> perms = new HashSet<>();
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);
        Files.setPosixFilePermissions(Paths.get(stagingDir + PATH_SEPARATOR + "compile.sh"), perms);
        Files.setPosixFilePermissions(Paths.get(stagingDir + PATH_SEPARATOR + "execute.sh"), perms);
    }

    
    
}
