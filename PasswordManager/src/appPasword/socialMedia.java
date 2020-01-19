
package appPasword;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class socialMedia extends javax.swing.JPanel {

    DefaultTableModel model;
    public socialMedia() {
        
        initComponents();
        Object[] header = {"No.","","Nama akun","Nomor HP","E-mail","Password"};
        model = new DefaultTableModel(header,0 );
        tbl_socialMedia.setModel(model);
        tbl_socialMedia.getModel();
        tbl_socialMedia.setRowHeight(30);
        tbl_socialMedia.getColumnModel().getColumn(0).setMinWidth(100);
        tbl_socialMedia.getColumnModel().getColumn(0).setMaxWidth(100);
        tbl_socialMedia.getColumnModel().getColumn(1).setMinWidth(0);
        tbl_socialMedia.getColumnModel().getColumn(1).setMaxWidth(0);
        loadData("");
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
        jPanel2 = new javax.swing.JPanel();
        txtcari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_tambahData = new javax.swing.JButton();
        btn_edit_data = new javax.swing.JButton();
        btn_hapusData = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_socialMedia = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPasword/images/icons8_Google_Web_Search_25px.png"))); // NOI18N

        btn_tambahData.setText("Tambah ");
        btn_tambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahDataActionPerformed(evt);
            }
        });

        btn_edit_data.setText("Edit");
        btn_edit_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_dataActionPerformed(evt);
            }
        });

        btn_hapusData.setText("Hapus");
        btn_hapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_tambahData, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_edit_data, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_hapusData, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_tambahData, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_edit_data, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_hapusData, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcari)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_socialMedia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_socialMedia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
       String key = txtcari.getText();
        if (key.isEmpty()) {
            loadData("");
        }else {
            loadData(key);
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void btn_hapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusDataActionPerformed
        int r = tbl_socialMedia.getSelectedRow();
            if (r != -1) {
                int id = Integer.parseInt(tbl_socialMedia.getValueAt(r, 1).toString());
                int pilih = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ?", "konfirmasi", JOptionPane.YES_NO_OPTION);
                if (pilih == 0) {
                    try {
                        Connection c = koneksiPasswd.MySQL();
                        Statement st = c.createStatement();
                        String q = "DELETE FROM tb_socialmedia WHERE user_id="+id+"";
                        st.executeUpdate(q);
                        loadData("");
                        JOptionPane.showMessageDialog(this, "data telah dihapus");
                        
                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                    
                }
                
               
        }
    }//GEN-LAST:event_btn_hapusDataActionPerformed

    private void btn_edit_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_dataActionPerformed
       int baris = tbl_socialMedia.getSelectedRow();
            if (baris !=-1) {
            int id = Integer.parseInt(tbl_socialMedia.getValueAt(baris, 1).toString());
            String nama = tbl_socialMedia.getValueAt(baris, 1).toString();
             Data d = new  Data();
           
            d.setId(id);
            d.setNama(nama);
            utama.addComp(new ubahSosmed(d));
        }
    }//GEN-LAST:event_btn_edit_dataActionPerformed

    private void btn_tambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahDataActionPerformed
        utama.addComp(new tambahSosmed());
    }//GEN-LAST:event_btn_tambahDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit_data;
    private javax.swing.JButton btn_hapusData;
    private javax.swing.JButton btn_tambahData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbl_socialMedia;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
private void loadData(String key){
    try {
        model.setRowCount(0);
        Connection c = koneksiPasswd.MySQL();
        Statement st = c.createStatement();
        String where = key.isEmpty()? "":" WHERE nama_akun LIKE '%"+key+"%'";
        
        
        ResultSet rs = st.executeQuery("SELECT * FROM tb_socialmedia"+where);
        int no = 0;
        while (rs.next()) {            
            no++;
            int id = rs.getInt("user_id");
                String nama = rs.getString("nama_akun");
                String no_hp = rs.getString("no_hp");
                String e_mail = rs.getString("e_mail");
                String Password = rs.getString("password");
                Object[]  data = {no, id, nama, no_hp, e_mail, Password};
                model.addRow(data);
        }
        
    } catch (SQLException e) {
    }
}

}

