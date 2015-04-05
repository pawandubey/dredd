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
public class Submission {
    private final Integer submissionID;
    private final User user;
    private final Question question;
    private final LanguageType language;
    private final String submissionTime;
    private final Judgement judgement;

    Submission(Integer sID, User u, Question q, LanguageType l, String sTime, Judgement j) {
        this.submissionID = sID;
        this.user = u;
        this.question = q;
        this.language = l;
        this.submissionTime = sTime;
        this.judgement = j;
    }

    /**
     * @return the submissionID
     */
    public Integer getSubmissionID() {
        return submissionID;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @return the question
     */
    public Question getQuestion() {
        return question;
    }

    /**
     * @return the language
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * @return the submissionTime
     */
    public String getSubmissionTime() {
        return submissionTime;
    }

    /**
     * @return the judgement
     */
    public Judgement getJudgement() {
        return judgement;
    }

}
