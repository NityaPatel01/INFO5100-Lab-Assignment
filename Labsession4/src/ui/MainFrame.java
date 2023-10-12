/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;

/**
 *
 * @author admin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        SplitPane = new javax.swing.JSplitPane();
        TopPanel = new javax.swing.JPanel();
        formbuttonTopPanel = new javax.swing.JButton();
        ViewbuttonTopPanel = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setDividerLocation(120);
        SplitPane.setDividerSize(1);
        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        formbuttonTopPanel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        formbuttonTopPanel.setText("Form");
        formbuttonTopPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formbuttonTopPanelActionPerformed(evt);
            }
        });

        ViewbuttonTopPanel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ViewbuttonTopPanel.setText("View");
        ViewbuttonTopPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbuttonTopPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(formbuttonTopPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(ViewbuttonTopPanel)
                .addGap(131, 131, 131))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formbuttonTopPanel)
                    .addComponent(ViewbuttonTopPanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SplitPane.setTopComponent(TopPanel);

        BottomPanel.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(BottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formbuttonTopPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formbuttonTopPanelActionPerformed
        // TODO add your handling code here:
        FormPanel newformpanel = new FormPanel(BottomPanel);
        BottomPanel.add(newformpanel);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
    }//GEN-LAST:event_formbuttonTopPanelActionPerformed

    private void ViewbuttonTopPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbuttonTopPanelActionPerformed
        // TODO add your handling code here:
        ViewPanel newviewpanel = new ViewPanel();
        BottomPanel.add(newviewpanel);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
        
    }//GEN-LAST:event_ViewbuttonTopPanelActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton ViewbuttonTopPanel;
    private javax.swing.JButton formbuttonTopPanel;
    // End of variables declaration//GEN-END:variables
}
