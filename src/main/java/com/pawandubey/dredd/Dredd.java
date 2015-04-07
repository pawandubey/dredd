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
package com.pawandubey.dredd;

import com.pawandubey.dredd.model.ConnectionProvider;
import com.pawandubey.dredd.model.language.JavaLanguage;
import com.pawandubey.dredd.model.language.Language;
import java.nio.file.Paths;

/**
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public class Dredd {

    private static final String DB_PASSWORD = "root";
    private static final String DB_USERNAME = "root";
    private static final String DBMS = "mysql";
    private static final String DB_SERVER = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "dredd";

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        ConnectionProvider.connect(DB_USERNAME, DB_PASSWORD, DBMS, DB_SERVER, DB_PORT, DB_NAME);
        Language language = new JavaLanguage(Paths.get("/home/pawandubey/dredd/tada.java"), "one", 0, "1234");
        language.compile();
        language.execute();
    }

}
