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

import com.pawandubey.dredd.Dredd;
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
public class ConnectionProvider {

    /**
     * Static method to get a connection to the database.
     *
     * @param dbUserName The username of the database user
     * @param dbPassword The database password
     * @param dbms The database management system in use
     * @param dbServer The database server (e.g. localhost)
     * @param dbPort The port on which the db is running on the server
     * @param dbName The name of a specific database in the dbms
     * @return
     */
    public static Connection connect(String dbUserName, String dbPassword, String dbms, String dbServer, String dbPort, String dbName) {
        Connection dbConnection = null;
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", dbUserName);
        connectionProperties.put("password", dbPassword);
        String url = "jdbc:" + dbms + "://" + dbServer + ":" + dbPort + "/" + dbName;
        try {
            dbConnection = DriverManager.getConnection(url, connectionProperties);
            if (dbConnection.isValid(0)) {
                System.out.println("A connection has been established.");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Dredd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbConnection;
    }

}
