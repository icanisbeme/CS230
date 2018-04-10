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

/**
 *
 * @author icani
 */
public class StudentFrame extends javax.swing.JFrame {

    Socket socket;
    PrintWriter outWriter;
    StudentFrame.ClientListener cl;
    ArrayList<JComponent> inputs = new ArrayList();
    Boolean valid;
    int qNum = 0;
    
    public StudentFrame() {
        initComponents();
        valid = false;
        
        try{
            socket = new Socket("localhost",32345);
            outWriter = new PrintWriter(socket.getOutputStream());
            cl = new StudentFrame.ClientListener();
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
        studentPanel = new javax.swing.JPanel();
        studentWelcomeTxtLabel = new javax.swing.JLabel();
        classSelectComboBox = new javax.swing.JComboBox<>();
        selectClassLabel = new javax.swing.JLabel();
        selectClassBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentWelcomeTxtLabel.setText("College of Monongalia County SEI System - Student View");

        classSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CS230", "CS410", "CS450" }));

        selectClassLabel.setText("Select Class to Take SEI");

        selectClassBtn.setText("Select");

        javax.swing.GroupLayout studentPanelLayout = new javax.swing.GroupLayout(studentPanel);
        studentPanel.setLayout(studentPanelLayout);
        studentPanelLayout.setHorizontalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentWelcomeTxtLabel))
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(studentPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectClassBtn)
                                    .addComponent(classSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(497, Short.MAX_VALUE))
        );
        studentPanelLayout.setVerticalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentWelcomeTxtLabel)
                .addGap(18, 18, 18)
                .addComponent(selectClassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectClassBtn)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
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
        
        private void processCommand(String inString){
            String[] stringarr = inString.split(",");
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classSelectComboBox;
    private javax.swing.ButtonGroup qTypeGroup;
    private javax.swing.JButton selectClassBtn;
    private javax.swing.JLabel selectClassLabel;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JLabel studentWelcomeTxtLabel;
    // End of variables declaration//GEN-END:variables
}
