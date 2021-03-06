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

import java.nio.file.Path;

/**
 * Defines an interface for a language
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public interface Language {

    public static final String BASE_DIR = System.getProperty("user.home") + "/dredd";
    /**
     * Defines an interface for the compilation process
     */
    public void compile();

    /**
     * Defines an interface for the execution of the compiled code
     */
    public void execute();

    /**
     *
     * @return the name for the language file
     */
    public String getName();

    public Path getFile();

    public String getCompileScript();

    public String getExecuteScript();
}
