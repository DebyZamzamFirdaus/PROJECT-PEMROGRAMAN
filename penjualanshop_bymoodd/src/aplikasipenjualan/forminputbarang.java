/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenjualan;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *  @author
 */
public class forminputbarang extends javax.swing.JFrame {
     private DefaultTableModel model;
    /**
     * Creates new form forminputbarang
     */
    public forminputbarang() {
        initComponents();
        
        model = new DefaultTableModel();

        tabelinput.setModel(model);

        model.addColumn("id_barang");
        model.addColumn("nama_barang");
        model.addColumn("jumlah_barang");
        model.addColumn("harga_beli");
        model.addColumn("harga_jual");
        model.addColumn("tgl_pemasokan");

        loadData();
        kode();
        
       
    }
     public void FilterHuruf(KeyEvent a){
       if(Character.isDigit(a.getKeyChar())){
           a.consume();
           JOptionPane.showMessageDialog(null, "masukan huruf saja!", "peringatan", JOptionPane.WARNING_MESSAGE);
       }
   }
    public void FilterAngka(KeyEvent a){
       if(Character.isAlphabetic(a.getKeyChar())){
           a.consume();
           JOptionPane.showMessageDialog(null, "masukan angka saja!", "peringatan", JOptionPane.WARNING_MESSAGE);
       }
   }
    public final void loadData() {
        bsimpan.setEnabled(true);
        bhapus.setEnabled(false);
        bedit.setEnabled(false);
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM tbl_barang";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("kd_barang");
                o[1] = r.getString("nama_barang");
                o[2] = r.getString("jumlah_barang");
                o[3] = r.getString("harga_beli");
                o[4] = r.getString("harga_jual");
                
                
                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     private void kode() {
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM tbl_barang ORDER by kd_barang desc";
            ResultSet r = s.executeQuery(sql);

            if (r.next()) {
                String nofak = r.getString("kd_barang").substring(1);
                String AN = "" + (Integer.parseInt(nofak) + 1);
                String Nol = "";

                if (AN.length() == 1) {
                    Nol = "000";
                } else if (AN.length() == 2) {
                    Nol = "00";
                } else if (AN.length() == 3) {
                    Nol = "0";
                } else if (AN.length() == 4) {
                    Nol = "";
                }

                tkdbarang.setText("B" + Nol + AN);
            } else {
                tkdbarang.setText("B0001");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        thargajual = new javax.swing.JTextField();
        tkdbarang = new javax.swing.JTextField();
        tnamabarang = new javax.swing.JTextField();
        tjumlahbarang = new javax.swing.JTextField();
        thargabeli = new javax.swing.JTextField();
        bedit = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelinput = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CARI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id_Barang");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama_Barang");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah Barang");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga Beli");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        thargajual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                thargajualKeyTyped(evt);
            }
        });
        jPanel1.add(thargajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 230, 30));

        tkdbarang.setEditable(false);
        tkdbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkdbarangActionPerformed(evt);
            }
        });
        jPanel1.add(tkdbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 230, 30));

        tnamabarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnamabarangKeyTyped(evt);
            }
        });
        jPanel1.add(tnamabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 230, 30));

        tjumlahbarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tjumlahbarangKeyTyped(evt);
            }
        });
        jPanel1.add(tjumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, 30));

        thargabeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                thargabeliKeyTyped(evt);
            }
        });
        jPanel1.add(thargabeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, 30));

        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel1.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 100, 30));

        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(bsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 100, 30));

        bhapus.setText("HAPUS");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        jPanel1.add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 100, 30));

        tabelinput.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelinput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelinputMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelinput);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 770, 180));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tgl_Pemasokan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcariKeyReleased(evt);
            }
        });
        jPanel1.add(tcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 270, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock Barang");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 60));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 30));

        exit.setText("KEMBALI");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Harga Jual");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        formmenu fb = new formmenu();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        if(tkdbarang.getText().equals("") ||tnamabarang.getText().equals("") || tjumlahbarang.getText().equals("")|| thargabeli.getText().equals("")|| thargajual.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "elektronik berkah", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String kbarang = tkdbarang.getText();
            String nbarang = tnamabarang.getText();
            String jbarang = tjumlahbarang.getText();
            String hbeli = thargabeli.getText();
            String hjual = thargajual.getText();
           
            try {
                long millis=System.currentTimeMillis();  
                java.sql.Date date=new java.sql.Date(millis);  
                System.out.println(date); 
                String tgl = date.toString();
                Connection c = koneksi.getKoneksi();

                String sql = "INSERT INTO tbl_barang VALUES (?, ?, ?, ?, ?, ?)";

                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, kbarang);
                p.setString(2, nbarang);
                p.setString(3, jbarang);
                p.setString(4, hbeli);
                p.setString(5, hjual);
                p.setString(6, tgl);
                
                p.executeUpdate();
                p.close();
                
            } catch (SQLException e) {
                System.out.println("Terjadi Error");
            } finally {
                loadData();
                kode();
                
                tnamabarang.setText("");
                tjumlahbarang.setText("");
                thargabeli.setText("");
                thargajual.setText("");

                JOptionPane.showMessageDialog(null, "Data berhasil tersimpan", "elekronik berkah", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void tabelinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelinputMouseClicked
        // TODO add your handling code here:
         bsimpan.setEnabled(false);
         bedit.setEnabled(true);
         bhapus.setEnabled(true);
        int i = tabelinput.getSelectedRow();
        if (i == -1) {
            return;
        }
        String kbarang = (String) model.getValueAt(i, 0);
        tkdbarang.setText(kbarang);
        tkdbarang.setEnabled(false);

        String nbarang = (String) model.getValueAt(i, 1);
        tnamabarang.setText(nbarang);

        String jumlah = (String) model.getValueAt(i, 2);
        tjumlahbarang.setText(jumlah);

        String hbeli = (String) model.getValueAt(i, 3);
        thargabeli.setText(hbeli);

        String hjual = (String) model.getValueAt(i, 4);
        thargajual.setText(hjual);
    }//GEN-LAST:event_tabelinputMouseClicked

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
         try {
            String sql ="delete from tbl_barang where kd_barang='"+tkdbarang.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        loadData();
        tkdbarang.setText("");
        tnamabarang.setText("");
        tjumlahbarang.setText("");
        thargabeli.setText("");
        thargajual.setText("");
    }//GEN-LAST:event_bhapusActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        if(tkdbarang.getText().equals("") ||tnamabarang.getText().equals("") || tjumlahbarang.getText().equals("")|| thargabeli.getText().equals("")|| thargajual.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "elektronik berkah", JOptionPane.INFORMATION_MESSAGE);
        }else{
        int i = tabelinput.getSelectedRow();
        if (i == -1) {
            return;
        }
        String user = (String) model.getValueAt(i, 0);
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "UPDATE  tbl_barang SET nama_barang =  '" + tnamabarang.getText() + "', jumlah_barang='"+ tjumlahbarang.getText() + "', harga_beli='"+ thargabeli.getText() + "', harga_jual='"+ thargajual.getText() +"' WHERE  kd_barang ='" + tkdbarang.getText() + "'";
            PreparedStatement p = c.prepareStatement(sql);
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        } finally {
            loadData();
            tkdbarang.setText("");
            tnamabarang.setText("");
            tjumlahbarang.setText("");
            thargabeli.setText("");
            thargajual.setText("");
            bsimpan.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Elektronik Berkah", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_beditActionPerformed

    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyReleased
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "select * from tbl_barang where kd_barang like '%" + tcari.getText() + "%' or nama_barang like'%" + tcari.getText() + "%' or jumlah_barang like'" + tcari.getText() + "%' or harga_beli like'%" + tcari.getText() + "%' " + "or harga_jual like'%" + tcari.getText() + "%'";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("kd_barang");
                o[1] = r.getString("nama_barang");
                o[2] = r.getString("jumlah_barang");
                o[3] = r.getString("harga_beli");
                o[4] = r.getString("harga_jual");
                
                
                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
    }//GEN-LAST:event_tcariKeyReleased

    private void tkdbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkdbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkdbarangActionPerformed

    private void tnamabarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnamabarangKeyTyped
        // TODO add your handling code here:
        FilterHuruf(evt);
    }//GEN-LAST:event_tnamabarangKeyTyped

    private void tjumlahbarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tjumlahbarangKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_tjumlahbarangKeyTyped

    private void thargajualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thargajualKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_thargajualKeyTyped

    private void thargabeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thargabeliKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_thargabeliKeyTyped
    
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
            java.util.logging.Logger.getLogger(forminputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forminputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forminputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forminputbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forminputbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelinput;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField thargabeli;
    private javax.swing.JTextField thargajual;
    private javax.swing.JTextField tjumlahbarang;
    private javax.swing.JTextField tkdbarang;
    private javax.swing.JTextField tnamabarang;
    // End of variables declaration//GEN-END:variables
}
