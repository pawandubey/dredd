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
 * Represents a question
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public class Question {

    private final Integer questionID;
    private final String questionName;
    private final String questionPath;
    private final String testFile;
    private final String outputFile;
    private Integer totalSubmissions;
    private Integer correctSubmissions;
    private final String dateAdded;

    Question(Integer qID, String qName, String qPath, String tFile, String oFile, Integer tSub, Integer cSub, String date) {
        this.questionID = qID;
        this.questionName = qName;
        this.questionPath = qPath;
        this.testFile = tFile;
        this.outputFile = oFile;
        this.totalSubmissions = tSub;
        this.correctSubmissions = cSub;
        this.dateAdded = date;
    }

    /**
     * @return the questionID
     */
    public Integer getQuestionID() {
        return questionID;
    }

    /**
     * @return the questionName
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * @return the questionPath
     */
    public String getQuestionPath() {
        return questionPath;
    }

    /**
     * @return the testFile
     */
    public String getTestFile() {
        return testFile;
    }

    /**
     * @return the outputFile
     */
    public String getOutputFile() {
        return outputFile;
    }

    /**
     * @return the totalSubmissions
     */
    public Integer getTotalSubmissions() {
        return totalSubmissions;
    }

    /**
     * @return the correctSubmissions
     */
    public Integer getCorrectSubmissions() {
        return correctSubmissions;
    }

    /**
     * @return the dateAdded
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * Increments the total submissions for the particular question
     */
    public void incrementTotalSubmissions() {
        this.totalSubmissions++;
    }

    /**
     * Increments the number of correct submissions for the particular question
     */
    public void incrementCorrectSubmissions() {
        this.correctSubmissions++;
    }
}
