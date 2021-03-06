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
package com.pawandubey.dredd.model;

/**
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public enum LanguageType {

    /**
     * Java language
     */
    JAVA("Java"),
    /**
     * C++ language
     */
    CPP("C++"),
    /**
     * C language
     */
    C("C");

    public final String name;

    LanguageType(String name) {
        this.name = name;
    }
}
