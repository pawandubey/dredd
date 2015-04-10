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
package com.pawandubey.dredd.controller;

/**
 *
 * @author shubheksha
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileWindowPanel = new javax.swing.JPanel();
        profileWindowUsernameButton = new javax.swing.JButton();
        profileWindowLogoutButton = new javax.swing.JButton();
        submissionsScrollPane = new javax.swing.JScrollPane();
        submissionsTable = new javax.swing.JTable();
        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        fillUsernameLabel = new javax.swing.JLabel();
        fillEmailLabel = new javax.swing.JLabel();
        previousSubmissionsLabel = new javax.swing.JLabel();
        mainWindowPanel = new javax.swing.JPanel();
        questionListScrollPane = new javax.swing.JScrollPane();
        questionList = new javax.swing.JList();
        searchBox = new javax.swing.JLabel();
        mainWindowUsernameButton = new javax.swing.JButton();
        mainWindowLogoutButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        languageComboBox = new javax.swing.JComboBox();
        statusLabel = new javax.swing.JLabel();
        questionNameLabel = new javax.swing.JLabel();
        questionTextScrollPane = new javax.swing.JScrollPane();
        questionTextArea = new javax.swing.JTextArea();
        chooseFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profileWindowUsernameButton.setText("username");

        profileWindowLogoutButton.setText("logout");

        submissionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Time", "Question ID", "Submission ID", "Language", "Judgement"
            }
        ));
        submissionsScrollPane.setViewportView(submissionsTable);

        usernameLabel.setText("Username:");

        emailLabel.setText("e-mail:");

        previousSubmissionsLabel.setText("Previous Submissions");

        javax.swing.GroupLayout profileWindowPanelLayout = new javax.swing.GroupLayout(profileWindowPanel);
        profileWindowPanel.setLayout(profileWindowPanelLayout);
        profileWindowPanelLayout.setHorizontalGroup(
            profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileWindowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousSubmissionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(profileWindowPanelLayout.createSequentialGroup()
                .addGroup(profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileWindowPanelLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileWindowPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(profileWindowUsernameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(profileWindowLogoutButton))
                            .addGroup(profileWindowPanelLayout.createSequentialGroup()
                                .addGroup(profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fillUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fillEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(profileWindowPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submissionsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)))
                .addContainerGap())
        );
        profileWindowPanelLayout.setVerticalGroup(
            profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileWindowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileWindowUsernameButton)
                    .addComponent(profileWindowLogoutButton))
                .addGap(13, 13, 13)
                .addGroup(profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fillUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fillEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(previousSubmissionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submissionsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        questionList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        questionListScrollPane.setViewportView(questionList);

        searchBox.setText("Search");

        mainWindowUsernameButton.setText("username");

        mainWindowLogoutButton.setText("logout");

        submitButton.setText("Submit");

        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Java", "C++", "C" }));

        statusLabel.setText("Status:");
        statusLabel.setToolTipText("");

        questionNameLabel.setText("Question:");

        questionTextArea.setColumns(20);
        questionTextArea.setRows(5);
        questionTextScrollPane.setViewportView(questionTextArea);

        chooseFileButton.setText("Choose File");
        chooseFileButton.setActionCommand("");

        javax.swing.GroupLayout mainWindowPanelLayout = new javax.swing.GroupLayout(mainWindowPanel);
        mainWindowPanel.setLayout(mainWindowPanelLayout);
        mainWindowPanelLayout.setHorizontalGroup(
            mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWindowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(searchBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWindowPanelLayout.createSequentialGroup()
                        .addGap(0, 254, Short.MAX_VALUE)
                        .addComponent(mainWindowUsernameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mainWindowLogoutButton))
                    .addComponent(questionNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainWindowPanelLayout.createSequentialGroup()
                        .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chooseFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(questionTextScrollPane))
                .addContainerGap())
        );
        mainWindowPanelLayout.setVerticalGroup(
            mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowPanelLayout.createSequentialGroup()
                .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainWindowPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainWindowUsernameButton)
                            .addComponent(mainWindowLogoutButton)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionListScrollPane))
                    .addGroup(mainWindowPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(questionNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionTextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseFileButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(profileWindowPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(profileWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
// Variables declaration - do not modify                     
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fillEmailLabel;
    private javax.swing.JLabel fillUsernameLabel;
    private javax.swing.JComboBox languageComboBox;
    private javax.swing.JButton mainWindowLogoutButton;
    private javax.swing.JPanel mainWindowPanel;
    private javax.swing.JButton mainWindowUsernameButton;
    private javax.swing.JLabel previousSubmissionsLabel;
    private javax.swing.JButton profileWindowLogoutButton;
    private javax.swing.JPanel profileWindowPanel;
    private javax.swing.JButton profileWindowUsernameButton;
    private javax.swing.JList questionList;
    private javax.swing.JScrollPane questionListScrollPane;
    private javax.swing.JLabel questionNameLabel;
    private javax.swing.JTextArea questionTextArea;
    private javax.swing.JScrollPane questionTextScrollPane;
    private javax.swing.JLabel searchBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JScrollPane submissionsScrollPane;
    private javax.swing.JTable submissionsTable;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration                   
}

  
