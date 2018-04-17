/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1.landingFrames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author icani
 */
public class FacultyFrame extends javax.swing.JFrame {

    Socket socket;
    PrintWriter outWriter;
    FacultyFrame.ClientListener cl;
    ArrayList<JComponent> inputs = new ArrayList();
    Boolean valid;
    int qNum = 0;
    int timesCreated = 0;
    boolean noMore = false;
    
    public FacultyFrame() {
        initComponents();
        valid = false;
        successLabel.setVisible(false);
        successSubQLabel.setVisible(false);
        QPoolPanel.setVisible(false);
        
        try{
            socket = new Socket("localhost",32345);
            outWriter = new PrintWriter(socket.getOutputStream());
            cl = new FacultyFrame.ClientListener();
            cl.start();
        }catch(IOException e){
            //JOptionPane.showMessageDialog(jPanel1, "Error connecting to Server.");
        }
    }
/**
 *
 * @author alexm
 */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        qTypeGroup = new javax.swing.ButtonGroup();
        adminPanel = new javax.swing.JPanel();
        adminWelcomeTxtLabel = new javax.swing.JLabel();
        createQBtn = new javax.swing.JButton();
        viewResultsPanel = new javax.swing.JButton();
        QPoolPanel = new javax.swing.JPanel();
        qPoolListPanel = new javax.swing.JPanel();
        submitSelectedQBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        qPoolList = new javax.swing.JList<>();
        successSubQLabel = new javax.swing.JLabel();
        createQPanel = new javax.swing.JPanel();
        qTxtLabel = new javax.swing.JLabel();
        qTextField = new javax.swing.JTextField();
        qTypeLabel = new javax.swing.JLabel();
        scaledRespRadioBtn = new javax.swing.JRadioButton();
        freeRespRadioBtn = new javax.swing.JRadioButton();
        submitQBtn = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();
        selQBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminWelcomeTxtLabel.setText("College of Monongalia County SEI System - Faculty View");

        createQBtn.setText("Create Question");
        createQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createQBtnActionPerformed(evt);
            }
        });

        viewResultsPanel.setText("View Results");

        submitSelectedQBtn.setText("Submit Question Choices");
        submitSelectedQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitSelectedQBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(qPoolList);

        successSubQLabel.setText("Success!");

        javax.swing.GroupLayout qPoolListPanelLayout = new javax.swing.GroupLayout(qPoolListPanel);
        qPoolListPanel.setLayout(qPoolListPanelLayout);
        qPoolListPanelLayout.setHorizontalGroup(
            qPoolListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPoolListPanelLayout.createSequentialGroup()
                .addGroup(qPoolListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qPoolListPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(successSubQLabel)
                        .addGap(18, 18, 18)
                        .addComponent(submitSelectedQBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
        );
        qPoolListPanelLayout.setVerticalGroup(
            qPoolListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPoolListPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(qPoolListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitSelectedQBtn)
                    .addComponent(successSubQLabel)))
        );

        qTxtLabel.setText("Question Text");

        qTypeLabel.setText("Question Type");

        qTypeGroup.add(scaledRespRadioBtn);
        scaledRespRadioBtn.setText("Scaled Response");

        qTypeGroup.add(freeRespRadioBtn);
        freeRespRadioBtn.setText("Free Response");

        submitQBtn.setText("Submit");
        submitQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitQBtnActionPerformed(evt);
            }
        });

        successLabel.setText("Success!");

        javax.swing.GroupLayout createQPanelLayout = new javax.swing.GroupLayout(createQPanel);
        createQPanel.setLayout(createQPanelLayout);
        createQPanelLayout.setHorizontalGroup(
            createQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(createQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(createQPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(createQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(qTextField)
                        .addGroup(createQPanelLayout.createSequentialGroup()
                            .addGroup(createQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submitQBtn)
                                .addComponent(scaledRespRadioBtn)
                                .addComponent(qTypeLabel)
                                .addComponent(qTxtLabel)
                                .addGroup(createQPanelLayout.createSequentialGroup()
                                    .addComponent(freeRespRadioBtn)
                                    .addGap(52, 52, 52)
                                    .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 89, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        createQPanelLayout.setVerticalGroup(
            createQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
            .addGroup(createQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(createQPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(qTxtLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(qTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(qTypeLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scaledRespRadioBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(createQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(freeRespRadioBtn)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createQPanelLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(submitQBtn)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout QPoolPanelLayout = new javax.swing.GroupLayout(QPoolPanel);
        QPoolPanel.setLayout(QPoolPanelLayout);
        QPoolPanelLayout.setHorizontalGroup(
            QPoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QPoolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qPoolListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        QPoolPanelLayout.setVerticalGroup(
            QPoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(qPoolListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        selQBtn.setText("Select Questions for SEI");
        selQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selQBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminWelcomeTxtLabel)
                    .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(selQBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewResultsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createQBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(QPoolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminWelcomeTxtLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createQBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selQBtn)
                .addGap(14, 14, 14)
                .addComponent(viewResultsPanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addComponent(QPoolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createQBtnActionPerformed
        qPoolListPanel.setVisible(false);
        QPoolPanel.setVisible(true);
        if(timesCreated == 0) createQPanel.setVisible(true);
        else createQPanel.setVisible(false);
    }//GEN-LAST:event_createQBtnActionPerformed

    private void submitQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitQBtnActionPerformed
        String qType;
        timesCreated++;
        successLabel.setVisible(false);

        if(qTextField.getText() != null) {
            if(freeRespRadioBtn.isSelected()) qType = "free";
            else qType = "scaled";

            outWriter.println("/addq," + qTextField.getText() + "," + qType + "," + qNum);
            outWriter.flush();
            qNum++;
        }
    }//GEN-LAST:event_submitQBtnActionPerformed

    private void selQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selQBtnActionPerformed
        // TODO add your handling code here:
        if(!noMore) qPoolListPanel.setVisible(true);
        QPoolPanel.setVisible(true);
        createQPanel.setVisible(false);
        
        outWriter.println("/getq,");
        outWriter.flush();
    }//GEN-LAST:event_selQBtnActionPerformed

    private void submitSelectedQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitSelectedQBtnActionPerformed
        // TODO add your handling code here:
        String out = "";
        if(qPoolList.getSelectedValuesList().size() <= 5 && qPoolList.getSelectedValuesList().size() > 0) {
            for(String s : qPoolList.getSelectedValuesList()) {
                out += s + ";";
            }
            outWriter.println("/addSEI;" + out);
            outWriter.flush();
        }
    }//GEN-LAST:event_submitSelectedQBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyFrame().setVisible(true);
            }
        });
    }
    
    class ClientListener extends Thread{
        
        public void run(){
            try {
                System.out.println("Listener Started");
                BufferedReader inReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String inString;
                while((inString = inReader.readLine()) != null){
                    System.err.println("processing command: " + inString);
                    System.out.println(inString);
                    processCommand(inString);

                }   
            } 
            catch(IOException e){
                System.out.println("Error in Client Listener");
            }
        }
        
        public void addToList(String[] str){
            DefaultListModel listmodel = new DefaultListModel();

            try{
                for(int i=1; i<str.length; i++){
                    listmodel.addElement(str[i]);
                }
                qPoolList.setModel(listmodel);
                qPoolList.setVisible(true);
            }catch(ArrayIndexOutOfBoundsException e){} 
        }
        
        private void processCommand(String inString){
            if(inString.startsWith("/addq")) {
                String[] stringarr = inString.split(",");
            
                if(stringarr[4].equals("true")) successLabel.setText("SUCCESS");
                else successLabel.setText("FAILURE - TRY AGAIN");
                successLabel.setVisible(true);
            } 
            else if(inString.startsWith("/returnQList")) {
                addToList(inString.split(";"));
            }
            else if(inString.startsWith("/addSEI")) {
                successSubQLabel.setVisible(true);
                try {
                    TimeUnit.SECONDS.sleep(5); //wait before hiding panel.
                } catch(InterruptedException e) {}
                qPoolList.setVisible(false);
                submitSelectedQBtn.setVisible(false);
                successSubQLabel.setVisible(false);
                jScrollPane1.setVisible(false);
                noMore = true;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QPoolPanel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel adminWelcomeTxtLabel;
    private javax.swing.JButton createQBtn;
    private javax.swing.JPanel createQPanel;
    private javax.swing.JRadioButton freeRespRadioBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> qPoolList;
    private javax.swing.JPanel qPoolListPanel;
    private javax.swing.JTextField qTextField;
    private javax.swing.JLabel qTxtLabel;
    private javax.swing.ButtonGroup qTypeGroup;
    private javax.swing.JLabel qTypeLabel;
    private javax.swing.JRadioButton scaledRespRadioBtn;
    private javax.swing.JButton selQBtn;
    private javax.swing.JButton submitQBtn;
    private javax.swing.JButton submitSelectedQBtn;
    private javax.swing.JLabel successLabel;
    private javax.swing.JLabel successSubQLabel;
    private javax.swing.JButton viewResultsPanel;
    // End of variables declaration//GEN-END:variables
}
