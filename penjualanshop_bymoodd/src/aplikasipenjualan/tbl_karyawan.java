package aplikasipenjualan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */


public class tbl_karyawan extends javax.swing.JFrame {

    /**
     * Creates new form tabel_karyawan
     */
    public tbl_karyawan() {
        initComponents();
        table();
    }

    public void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id_Karyawan");
        tbl.addColumn("Nama_Karyawan");
        tbl.addColumn("Jenis_kelamin");
        tbl.addColumn("No_Hp");
        tbl.addColumn("Alamat");
        tbl.addColumn("Bidang");
        tbl.addColumn("Waktu_Kerja");
        
        try {
            Statement st = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_karyawan");
            
            while(rs.next()) {
                tbl.addRow(new Object[] {
                    rs.getString("id_karyawan"),
                    rs.getString("nama_karyawan"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("no_hp"),
                    rs.getString("alamat"),
                    rs.getString("bidang"),
                    rs.getString("waktu_kerja")       
                });
                jTable3.setModel(tbl);
        }
            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Id_Karyawan = new javax.swing.JLabel();
        Nama_Karyawan = new javax.swing.JLabel();
        Jenis_Kelamin = new javax.swing.JLabel();
        No_hp = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();
        Bidang = new javax.swing.JLabel();
        Waktu_Kerja = new javax.swing.JLabel();
        txtid_karyawan = new javax.swing.JTextField();
        txtnama_karyawan = new javax.swing.JTextField();
        txtno_hp = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtbidang = new javax.swing.JTextField();
        txtgaji = new javax.swing.JTextField();
        txtedit = new javax.swing.JButton();
        txtsimpan = new javax.swing.JButton();
        txthapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        rLaki = new javax.swing.JRadioButton();
        rPerempuan = new javax.swing.JRadioButton();
        gaji = new javax.swing.JLabel();
        txtwaktu_kerja1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 0, 36)); // NOI18N
        jLabel1.setText("Karyawan");
        jLabel1.setMaximumSize(new java.awt.Dimension(48, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(48, 15));
        jLabel1.setPreferredSize(new java.awt.Dimension(48, 15));

        Id_Karyawan.setText("Id_Karyawan");

        Nama_Karyawan.setText("Nama_Karyawan");

        Jenis_Kelamin.setText("Jenis_Kelamin");

        No_hp.setText("No_hp");

        Alamat.setText("Alamat");

        Bidang.setText("Bidang");

        Waktu_Kerja.setText("Waktu_Kerja");

        txtid_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_karyawanActionPerformed(evt);
            }
        });

        txtedit.setText("edit");
        txtedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txteditMouseClicked(evt);
            }
        });
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });

        txtsimpan.setText("simpan");
        txtsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsimpanMouseClicked(evt);
            }
        });
        txtsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsimpanActionPerformed(evt);
            }
        });

        txthapus.setText("hapus");
        txthapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthapusMouseClicked(evt);
            }
        });
        txthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthapusActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Karyawan", "Nama_Karyawan", "Jenis_Kelamin", "No_Hp", "Alamat", "Bidang", "Waktu_Kerja"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        rLaki.setText("LAKI-LAKI");

        rPerempuan.setText("PEREMPUAN");

        gaji.setText("Gaji");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Id_Karyawan)
                            .addComponent(Nama_Karyawan)
                            .addComponent(Jenis_Kelamin)
                            .addComponent(No_hp)
                            .addComponent(Alamat)
                            .addComponent(Bidang)
                            .addComponent(Waktu_Kerja)
                            .addComponent(gaji))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbidang, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtno_hp, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rLaki)
                                .addGap(18, 18, 18)
                                .addComponent(rPerempuan))
                            .addComponent(txtwaktu_kerja1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgaji, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(txtedit)
                        .addGap(90, 90, 90)
                        .addComponent(txthapus)
                        .addGap(101, 101, 101)
                        .addComponent(txtsimpan)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_Karyawan)
                    .addComponent(txtid_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama_Karyawan)
                    .addComponent(txtnama_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jenis_Kelamin)
                    .addComponent(rLaki)
                    .addComponent(rPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No_hp)
                    .addComponent(txtno_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alamat)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bidang)
                    .addComponent(txtbidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Waktu_Kerja)
                    .addComponent(txtwaktu_kerja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gaji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthapus)
                    .addComponent(txtedit)
                    .addComponent(txtsimpan))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtid_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_karyawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_karyawanActionPerformed

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteditActionPerformed

    private void txtsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsimpanActionPerformed

    private void txtsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsimpanMouseClicked
        // TODO add your handling code here:
        
        String jk = null;
        
        if(rLaki.isSelected()){  
            jk = "Laki-Laki";
        }else if (rPerempuan.isSelected()){
            jk = "Perempuan";
        }
        try {
            String sql = "INSERT INTO tbl_karyawan VALUES ('" + txtid_karyawan.getText() + "', '"
                    + txtnama_karyawan.getText() + "', '" + jk + "', '" + txtno_hp.getText()+ "', '" 
                    + txtalamat.getText()+ "', '" + txtbidang.getText()+ "', '" + txtgaji.getText()+ "')";
                System.out.println(sql);
                Connection con = (Connection) koneksi.getKoneksi();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
                
        update();
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_txtsimpanMouseClicked

    private void txthapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthapusMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM tbl_karyawan WHERE id_karyawan='"+ txtid_karyawan.getText() + "'";
            Connection con = (Connection) koneksi.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Hapus");
            update();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txthapusMouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        
        int baris = jTable3.rowAtPoint(evt.getPoint());
        String id_karyawan = jTable3.getValueAt(baris, 0) .toString();
        txtid_karyawan.setText(id_karyawan);
        String nama_karyawan = jTable3.getValueAt(baris, 1) .toString();
        txtnama_karyawan.setText(nama_karyawan);
        String NO_HP = jTable3.getValueAt(baris, 3) .toString();
        txtno_hp.setText(NO_HP);
        String alamat = jTable3.getValueAt(baris, 4) .toString();
        txtalamat.setText(alamat);
        String bidang = jTable3.getValueAt(baris, 5) .toString();
        txtbidang.setText(bidang);
        String waktu_kerja = jTable3.getValueAt(baris, 6) .toString();
        txtgaji.setText(bidang);
    }//GEN-LAST:event_jTable3MouseClicked

    private void txteditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txteditMouseClicked
        // TODO add your handling code here:
        
        String jk = null;
        
        if(rLaki.isSelected()){  
            jk = "Laki-Laki";
        }else if (rPerempuan.isSelected()){
            jk = "Perempuan";
            
            try {
                String sql = "UPDATE tbl_karyawan SET id_karyawan='" + txtid_karyawan.getText()
                    + ",nama_karyawan='" + txtnama_karyawan.getText() + "',jenis_kelamin='" + jk + "',no_hp='" + txtno_hp.getText() 
                    + "',alamat='" + txtalamat.getText()+ "',bidang='" + txtbidang.getText() + "',waktu_kerja='"
                    + txtgaji.getText()+"'WHERE id_karyawan='"+ txtid_karyawan.getText() +"'";
                Connection con = (Connection) koneksi.getKoneksi();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Edit");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal Mengedit" + e.getMessage());
            }
            }
    }//GEN-LAST:event_txteditMouseClicked

    private void txthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthapusActionPerformed

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
            java.util.logging.Logger.getLogger(tbl_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tbl_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tbl_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tbl_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tbl_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JLabel Bidang;
    private javax.swing.JLabel Id_Karyawan;
    private javax.swing.JLabel Jenis_Kelamin;
    private javax.swing.JLabel Nama_Karyawan;
    private javax.swing.JLabel No_hp;
    private javax.swing.JLabel Waktu_Kerja;
    private javax.swing.JLabel gaji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JRadioButton rLaki;
    private javax.swing.JRadioButton rPerempuan;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtbidang;
    private javax.swing.JButton txtedit;
    private javax.swing.JTextField txtgaji;
    private javax.swing.JButton txthapus;
    private javax.swing.JTextField txtid_karyawan;
    private javax.swing.JTextField txtnama_karyawan;
    private javax.swing.JTextField txtno_hp;
    private javax.swing.JButton txtsimpan;
    private javax.swing.JTextField txtwaktu_kerja1;
    // End of variables declaration//GEN-END:variables

    private void update() throws Exception {
        DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("Id_Karyawan");
        tbl.addColumn("Nama_Karyawan");
        tbl.addColumn("Jenis_kelamin");
        tbl.addColumn("No_Hp");
        tbl.addColumn("Alamat");
        tbl.addColumn("Bidang");
        tbl.addColumn("Waktu_Kerja");
        
    Statement st = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_karyawan");
            
            while(rs.next()) {
                tbl.addRow(new Object[] {
                    rs.getString("id_karyawan"),
                    rs.getString("nama_karyawan"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("no_hp"),
                    rs.getString("alamat"),
                    rs.getString("bidang"),
                    rs.getString("waktu_kerja")       
                });
                jTable3.setModel(tbl);
        }    
    }
}
