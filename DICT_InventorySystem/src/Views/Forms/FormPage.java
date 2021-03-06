/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Forms;

import Forms.Property_Card;
import Views.Slider.AnimationSection;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

/**
 *
 * @author Eunar B. Dayangco
 */
public class FormPage extends javax.swing.JFrame {

    /**
     * Creates new form FormsUI
     */
    
 
    
    public FormPage() {
        initComponents();
         init();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pcbtn = new javax.swing.JButton();
        scbtn = new javax.swing.JButton();
        rpcibtn = new javax.swing.JButton();
        rlsddpbtn = new javax.swing.JButton();
        rosamibtn = new javax.swing.JButton();
        parbtn = new javax.swing.JButton();
        icsbtn = new javax.swing.JButton();
        wmrbtn = new javax.swing.JButton();
        iirupbtn = new javax.swing.JButton();
        raisbtn = new javax.swing.JButton();
        slcbtn = new javax.swing.JButton();
        rpcppebtn = new javax.swing.JButton();
        ppelcbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        pcbtn.setBackground(new java.awt.Color(102, 0, 0));
        pcbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pcbtn.setForeground(new java.awt.Color(255, 255, 255));
        pcbtn.setText("PROPERTY CARD");
        pcbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pcbtn.setFocusPainted(false);
        pcbtn.setFocusable(false);
        pcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcbtnActionPerformed(evt);
            }
        });

        scbtn.setBackground(new java.awt.Color(102, 0, 0));
        scbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        scbtn.setForeground(new java.awt.Color(255, 255, 255));
        scbtn.setText("STOCK CARD");
        scbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scbtn.setFocusPainted(false);
        scbtn.setFocusable(false);

        rpcibtn.setBackground(new java.awt.Color(102, 0, 0));
        rpcibtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rpcibtn.setForeground(new java.awt.Color(255, 255, 255));
        rpcibtn.setText("REPORT ON THE PHYSICAL COUNT OF INVENTORIES");
        rpcibtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rpcibtn.setFocusPainted(false);
        rpcibtn.setFocusable(false);

        rlsddpbtn.setBackground(new java.awt.Color(102, 0, 0));
        rlsddpbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rlsddpbtn.setForeground(new java.awt.Color(255, 255, 255));
        rlsddpbtn.setText("REPORT OF LOST, STOLEN, DAMAGED OR DESTROYED PROPERTY");
        rlsddpbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rlsddpbtn.setFocusPainted(false);
        rlsddpbtn.setFocusable(false);

        rosamibtn.setBackground(new java.awt.Color(102, 0, 0));
        rosamibtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rosamibtn.setForeground(new java.awt.Color(255, 255, 255));
        rosamibtn.setText("REPORT OF SUPPLIES AND MATERIALS ISSUED");
        rosamibtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rosamibtn.setFocusPainted(false);
        rosamibtn.setFocusable(false);

        parbtn.setBackground(new java.awt.Color(102, 0, 0));
        parbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        parbtn.setForeground(new java.awt.Color(255, 255, 255));
        parbtn.setText("PROPERTY ACKNOWLEDGEMENT RECEIPT");
        parbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        parbtn.setFocusPainted(false);
        parbtn.setFocusable(false);

        icsbtn.setBackground(new java.awt.Color(102, 0, 0));
        icsbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        icsbtn.setForeground(new java.awt.Color(255, 255, 255));
        icsbtn.setText("INVENTORY CUSTODIAN SLIP");
        icsbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        icsbtn.setFocusPainted(false);
        icsbtn.setFocusable(false);

        wmrbtn.setBackground(new java.awt.Color(102, 0, 0));
        wmrbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wmrbtn.setForeground(new java.awt.Color(255, 255, 255));
        wmrbtn.setText("WASTE MATERIALS REPORT");
        wmrbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wmrbtn.setFocusPainted(false);
        wmrbtn.setFocusable(false);

        iirupbtn.setBackground(new java.awt.Color(102, 0, 0));
        iirupbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iirupbtn.setForeground(new java.awt.Color(255, 255, 255));
        iirupbtn.setText("INVENTORY AND INSPECTION REPORT OF UNSERVICEABLE PROPERTY");
        iirupbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iirupbtn.setFocusPainted(false);
        iirupbtn.setFocusable(false);

        raisbtn.setBackground(new java.awt.Color(102, 0, 0));
        raisbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        raisbtn.setForeground(new java.awt.Color(255, 255, 255));
        raisbtn.setText("REQUISITION AND ISSUE SLIP");
        raisbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raisbtn.setFocusPainted(false);
        raisbtn.setFocusable(false);

        slcbtn.setBackground(new java.awt.Color(102, 0, 0));
        slcbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        slcbtn.setForeground(new java.awt.Color(255, 255, 255));
        slcbtn.setText("SUPPLIER LEDGER CARD");
        slcbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        slcbtn.setFocusPainted(false);
        slcbtn.setFocusable(false);

        rpcppebtn.setBackground(new java.awt.Color(102, 0, 0));
        rpcppebtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rpcppebtn.setForeground(new java.awt.Color(255, 255, 255));
        rpcppebtn.setText("REPORT ON THE PHYSICAL COUNT OF PROPERTY, PLANT AND EQUIPMENT");
        rpcppebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rpcppebtn.setFocusPainted(false);
        rpcppebtn.setFocusable(false);

        ppelcbtn.setBackground(new java.awt.Color(102, 0, 0));
        ppelcbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ppelcbtn.setForeground(new java.awt.Color(255, 255, 255));
        ppelcbtn.setText("PROPERTY, PLANT AND EQUIPMENT LEDGER CARD");
        ppelcbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ppelcbtn.setFocusPainted(false);
        ppelcbtn.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rosamibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(parbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wmrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(icsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(slcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(raisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iirupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rpcppebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rpcibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppelcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rlsddpbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rosamibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wmrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(iirupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rpcppebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rpcibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ppelcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rlsddpbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcbtnActionPerformed
        
        FormViewUI view = new FormViewUI(new Property_Card());
        new AnimationSection().framesMovetoBottom( view, 70, 35);
    }//GEN-LAST:event_pcbtnActionPerformed

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
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton icsbtn;
    private javax.swing.JButton iirupbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton parbtn;
    private javax.swing.JButton pcbtn;
    private javax.swing.JButton ppelcbtn;
    private javax.swing.JButton raisbtn;
    private javax.swing.JButton rlsddpbtn;
    private javax.swing.JButton rosamibtn;
    private javax.swing.JButton rpcibtn;
    private javax.swing.JButton rpcppebtn;
    private javax.swing.JButton scbtn;
    private javax.swing.JButton slcbtn;
    private javax.swing.JButton wmrbtn;
    // End of variables declaration//GEN-END:variables

    public void init(){
        mousebtn(pcbtn);
        mousebtn(rosamibtn);
        mousebtn(scbtn);
        mousebtn(parbtn);
        mousebtn(wmrbtn);
        mousebtn(icsbtn);
        mousebtn(slcbtn);
        mousebtn(raisbtn);
        mousebtn(iirupbtn);
        mousebtn(rpcppebtn);
        mousebtn(rpcibtn);
        mousebtn(ppelcbtn);
        mousebtn(rlsddpbtn);
    }
    public void mousebtn(JButton button){
        
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(0,204,51));
                button.setForeground(Color.black);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(102,0,0));
                 button.setForeground(Color.white);
            }
        });
    }

}
