/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ilham
 */
public class TambahDokter extends javax.swing.JPanel {

    /**
     * Creates new form TambahDokter
     */
    public TambahDokter() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        SimpanData = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Dokter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 16, -1, -1));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 20, 105, -1));

        SimpanData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SimpanData.setText("Simpan Data");
        SimpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanDataActionPerformed(evt);
            }
        });
        jPanel1.add(SimpanData, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 97, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 52, 99, 79);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanDataActionPerformed
        String nama = txtNama.getText();
        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "nama harus diisi");
            txtNama.requestFocus();
            
        }
        try {
            Connection c = koneksi.MySQL();
            Statement st = c.createStatement();
            String query = "INSERT INTO dokter (nama) VALUES ('"+nama+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Data telah disimpan ");
            halamanUtama.addComp(new DataDokter());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_SimpanDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SimpanData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
