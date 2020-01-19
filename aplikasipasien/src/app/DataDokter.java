
package app;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ilham
 */
public class DataDokter extends javax.swing.JPanel {
    DefaultTableModel model;
    
    public DataDokter() {
        initComponents();
        
        
        Object[] header = {"No.","","Nama DOkter"};
        model = new DefaultTableModel(header,0 );
        tblDokter.setModel(model);
        tblDokter.getModel();
        tblDokter.setRowHeight(30);
        tblDokter.getColumnModel().getColumn(0).setMinWidth(100);
        tblDokter.getColumnModel().getColumn(0).setMaxWidth(100);
        tblDokter.getColumnModel().getColumn(1).setMinWidth(0);
        tblDokter.getColumnModel().getColumn(1).setMaxWidth(0);
        
        loadData("");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTambahData = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDokter = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        btnTambahData.setText("Tambah Data");
        btnTambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah Data");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambahData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUbah)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahData)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDokter);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataActionPerformed
      halamanUtama.addComp(new TambahDokter());
      
    }//GEN-LAST:event_btnTambahDataActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         int r = tblDokter.getSelectedRow();
        if (r != -1) {
            int id = Integer.parseInt(tblDokter.getValueAt(r, 1).toString());
            int pilih = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ?", "konfirmasi", JOptionPane.YES_NO_OPTION);
            if (pilih == 0) {
                try {
                    Connection c = koneksi.MySQL();
                    Statement st = c.createStatement();
                    String q = "DELETE FROM dokter WHERE dokter_id="+id+"";
                    st.executeUpdate(q);
                    loadData("");
                    JOptionPane.showMessageDialog(this, "data telah dihapus");
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
       String key = txtCari.getText();
        if (key.isEmpty()) {
            loadData("");
        }else {
            loadData(key);
        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        int baris = tblDokter.getSelectedRow();
        if (baris !=-1) {
            int id = Integer.parseInt(tblDokter.getValueAt(baris, 1).toString());
            String nama = tblDokter.getValueAt(baris, 2).toString();
            Data d = new  Data();
           
            d.setId(id);
            d.setNama(nama);
            halamanUtama.addComp(new UbahDokter(d));
            
        }
    }//GEN-LAST:event_btnUbahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambahData;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDokter;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    private void loadData(String key) {
        try {
            model.setRowCount(0);
            Connection c = koneksi.MySQL();
            Statement st = c.createStatement();
            String where = key.isEmpty()? "":" WHERE nama LIKE '%"+key+"%'";
           
            
            ResultSet rs = st.executeQuery("SELECT * FROM dokter"+where);
            int no=0;
            while (rs.next()) { 
                no++;
                int id = rs.getInt("dokter_id");
                String nama = rs.getString("nama");
                Object[]  data = {no, id, nama};
                model.addRow(data);
                
            }
            
        } catch (Exception e) {
        }
 
    }
}
