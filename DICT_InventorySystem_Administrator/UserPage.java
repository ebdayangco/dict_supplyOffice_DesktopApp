/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Sections.CreateSection;
import Sections.SetSection;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Eunar B. Dayangco
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form UserPages
     */
   
    private Container newUser,viewUser;
    
    public UserPage() {
       
        initComponents();
        initContainer();
        designPanelButton();
      
    }
    public void initContainer(){
        
        
        this.newUser = new NewUser().getContentPane();
        this.viewUser = new ViewUser().getContentPane();
        newUser.setSize(new Dimension(rollPanel.getWidth(),rollPanel.getHeight()));
       
        
        CreateSection.displayComponents(rollPanel, newUser);
        
        newUserPanel.setBackground(new Color(153,0,0));
         newUserPanel.setBorder(javax.swing.BorderFactory.createBevelBorder
                    (javax.swing.border.BevelBorder.LOWERED));
    }
    public void designPanelButton(){
        Color colorIn = new Color(153,0,0);
        Color colorOut = new Color(51,0,0);
        
        setClickablePanel(newUserPanel, colorIn, colorOut,otherPanel(newUserPanel));
     
        setClickablePanel(viewUserPanel, colorIn, colorOut,otherPanel(viewUserPanel));
    
       
    }
    
    public ArrayList<JPanel> otherPanel(JPanel panel){
       ArrayList<JPanel> panelbtns = new ArrayList <JPanel>(){};
       panelbtns.add(newUserPanel);
       panelbtns.add(viewUserPanel);
       panelbtns.remove(panel);
        
        return panelbtns;
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
        newUserPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewUserPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rollPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(null);

        newUserPanel.setBackground(new java.awt.Color(51, 0, 0));
        newUserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        newUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newUserPanelMousePressed(evt);
            }
        });
        newUserPanel.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/MainComponents/new-user.png"))); // NOI18N
        newUserPanel.add(jLabel3);
        jLabel3.setBounds(0, 10, 100, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New");
        newUserPanel.add(jLabel4);
        jLabel4.setBounds(20, 80, 60, 14);

        jPanel1.add(newUserPanel);
        newUserPanel.setBounds(550, 20, 100, 110);

        viewUserPanel.setBackground(new java.awt.Color(51, 0, 0));
        viewUserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        viewUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewUserPanelMousePressed(evt);
            }
        });
        viewUserPanel.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/MainComponents/Search.png"))); // NOI18N
        viewUserPanel.add(jLabel7);
        jLabel7.setBounds(10, 10, 80, 64);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("View");
        viewUserPanel.add(jLabel8);
        jLabel8.setBounds(20, 80, 60, 14);

        jPanel1.add(viewUserPanel);
        viewUserPanel.setBounds(660, 20, 100, 110);

        rollPanel.setOpaque(false);

        javax.swing.GroupLayout rollPanelLayout = new javax.swing.GroupLayout(rollPanel);
        rollPanel.setLayout(rollPanelLayout);
        rollPanelLayout.setHorizontalGroup(
            rollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        rollPanelLayout.setVerticalGroup(
            rollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(rollPanel);
        rollPanel.setBounds(30, 130, 770, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewUserPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewUserPanelMousePressed
        viewUser = new ViewUser().getContentPane();
        CreateSection.displayComponents(rollPanel, viewUser);  
    }//GEN-LAST:event_viewUserPanelMousePressed

    private void newUserPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserPanelMousePressed
       CreateSection.displayComponents(rollPanel, newUser);
    }//GEN-LAST:event_newUserPanelMousePressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel newUserPanel;
    private javax.swing.JPanel rollPanel;
    private javax.swing.JPanel viewUserPanel;
    // End of variables declaration//GEN-END:variables

    public void setClickablePanel(JPanel panel,Color colorEntered,Color colorExited,ArrayList <JPanel> otherPanels){
      
          panel.addMouseListener(new MouseListener() {
              @Override
              public void mouseClicked(MouseEvent e) {
                 
              }

              @Override
              public void mousePressed(MouseEvent e) {
                  

                  panel.setBorder(javax.swing.BorderFactory.createBevelBorder
                    (javax.swing.border.BevelBorder.LOWERED)); 
                    
                  for(JPanel panel:otherPanels){
                      
                    panel.setBorder(javax.swing.BorderFactory.
                          createLineBorder(Color.white));
                    panel.setBackground(colorExited);
                    panel = panel;
                  }

                  
              }

              @Override
              public void mouseReleased(MouseEvent e) {
                  
              }

              @Override
              public void mouseEntered(MouseEvent e) {
                  panel.setBackground(colorEntered);
                
                 
              }

              @Override
              public void mouseExited(MouseEvent e) {
                  
                  String borderClass = panel.getBorder().getClass().getSimpleName();
                
                  if(borderClass.equals("BevelBorder")){
                       panel.setBackground(colorEntered);
                  }else{
                    panel.setBackground(colorExited);
                  }
              }
          });
      }
    
  
   

}
