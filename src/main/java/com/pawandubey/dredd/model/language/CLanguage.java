/**
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
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

import static com.pawandubey.dredd.model.language.Language.BASE_DIR;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public class CLanguage implements Language {

    private final String LANGUAGE_NAME = "C";
    private final String PATH_SEPARATOR = System.getProperty("file.separator");
    private final String stagingPath = BASE_DIR + PATH_SEPARATOR + "questions";
    private final Path file;
    private final String executionDirectory;
    private final String compileScript = "gcc -o ";
    private final String executeScript = "./";

    public CLanguage(Path f, String dir) {
        this.file = f;
        this.executionDirectory = dir;

    }

    @Override
    public void compile() {
        try {

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

        }
        catch (IOException | InterruptedException ex) {
            Logger.getLogger(JavaLanguage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getName() {
        return this.LANGUAGE_NAME;
    }

    @Override
    public Path getFile() {
        return this.file;
    }

    @Override
    public String getCompileScript() {
        return this.compileScript;
    }

    @Override
    public String getExecuteScript() {
        return this.executeScript;
    }

}
