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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        //Class.forName("com.mysql.jdbc.Driver");
        Connection dbConnection = null;
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", DB_USERNAME);
        connectionProperties.put("password", DB_PASSWORD);
        String url = "jdbc:" + DBMS + "://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        try {
            dbConnection = DriverManager.getConnection(url, connectionProperties);
            System.out.println(dbConnection.getClientInfo());
        }
        catch (SQLException ex) {
            Logger.getLogger(Dredd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
