/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPasword;

import com.alee.laf.WebLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author ilham
 */
public class utama extends javax.swing.JFrame {
    
    /**
     * Creates new form utama
     */
    public utama() {
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

        jPanel1 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_about = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_socialMedia = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_email = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_other = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelView = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Axsanis");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(56, 50, 50));

        panelMenu.setBackground(new java.awt.Color(56, 50, 50));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(70, 68, 68));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/icons8_Home_25px_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, -1));

        btn_about.setBackground(new java.awt.Color(56, 50, 50));
        btn_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_aboutMousePressed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/icons8_About_25px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("About");

        javax.swing.GroupLayout btn_aboutLayout = new javax.swing.GroupLayout(btn_about);
        btn_about.setLayout(btn_aboutLayout);
        btn_aboutLayout.setHorizontalGroup(
            btn_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        btn_aboutLayout.setVerticalGroup(
            btn_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_aboutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu.add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, -1));

        btn_socialMedia.setBackground(new java.awt.Color(56, 50, 50));
        btn_socialMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_socialMediaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_socialMediaMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/icons8_Share_25px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Social Media");

        javax.swing.GroupLayout btn_socialMediaLayout = new javax.swing.GroupLayout(btn_socialMedia);
        btn_socialMedia.setLayout(btn_socialMediaLayout);
        btn_socialMediaLayout.setHorizontalGroup(
            btn_socialMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_socialMediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        btn_socialMediaLayout.setVerticalGroup(
            btn_socialMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_socialMediaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_socialMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu.add(btn_socialMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, -1));

        btn_email.setBackground(new java.awt.Color(56, 50, 50));
        btn_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_emailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_emailMousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/icons8_Gmail_25px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-Mail");

        javax.swing.GroupLayout btn_emailLayout = new javax.swing.GroupLayout(btn_email);
        btn_email.setLayout(btn_emailLayout);
        btn_emailLayout.setHorizontalGroup(
            btn_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_emailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        btn_emailLayout.setVerticalGroup(
            btn_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_emailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu.add(btn_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 260, -1));

        btn_other.setBackground(new java.awt.Color(56, 50, 50));
        btn_other.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_otherMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_otherMousePressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/icons8_Document_25px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Other");

        javax.swing.GroupLayout btn_otherLayout = new javax.swing.GroupLayout(btn_other);
        btn_other.setLayout(btn_otherLayout);
        btn_otherLayout.setHorizontalGroup(
            btn_otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_otherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        btn_otherLayout.setVerticalGroup(
            btn_otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_otherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu.add(btn_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/logoAxanis4.png"))); // NOI18N
        panelMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 80));
        panelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 10));

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelView.setLayout(new java.awt.BorderLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/home_1.png"))); // NOI18N
        panelView.add(jLabel12, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelView, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed
        addComp(new Home());
        setColor(btn_home);
        resetColor(btn_socialMedia);
        resetColor(btn_email);
        resetColor(btn_other);
        resetColor(btn_about);
    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_socialMediaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_socialMediaMousePressed
       addComp(new socialMedia());
        setColor(btn_socialMedia);
        resetColor(btn_home);
        resetColor(btn_email);
        resetColor(btn_other);
        resetColor(btn_about);
    }//GEN-LAST:event_btn_socialMediaMousePressed

    private void btn_socialMediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_socialMediaMouseClicked
        
    }//GEN-LAST:event_btn_socialMediaMouseClicked

    private void btn_emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emailMousePressed
          addComp(new email());
        setColor(btn_email);
        resetColor(btn_home);
        resetColor(btn_socialMedia);
        resetColor(btn_other);
        resetColor(btn_about);
    }//GEN-LAST:event_btn_emailMousePressed

    private void btn_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_emailMouseClicked

    private void btn_otherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otherMousePressed
          addComp(new other());
        setColor(btn_other);
        resetColor(btn_home);
        resetColor(btn_socialMedia);
        resetColor(btn_email);
        resetColor(btn_about);
    }//GEN-LAST:event_btn_otherMousePressed

    private void btn_otherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otherMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_otherMouseClicked

    private void btn_aboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aboutMousePressed
          addComp(new about());
        setColor(btn_about);
        resetColor(btn_home);
        resetColor(btn_socialMedia);
        resetColor(btn_email);
        resetColor(btn_other);
    }//GEN-LAST:event_btn_aboutMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new  Color(70,68,68));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new  Color(56,50,50));
        
    }
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
            UIManager.setLookAndFeel(new WebLookAndFeel());
        
        } catch (Exception e) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new utama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_about;
    private javax.swing.JPanel btn_email;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_other;
    private javax.swing.JPanel btn_socialMedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelMenu;
    private static javax.swing.JPanel panelView;
    // End of variables declaration//GEN-END:variables

public static void addComp(JPanel panel){
    if (panelView.getComponentCount() > 0) {
            panelView.removeAll();
        }
        panelView.add(panel, BorderLayout.CENTER);
        panelView.revalidate();
        panelView.repaint();
    }
}
