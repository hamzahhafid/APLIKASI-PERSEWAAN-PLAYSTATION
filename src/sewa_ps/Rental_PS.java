/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewa_ps;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 */
public class Rental_PS extends javax.swing.JFrame {
    private final DefaultTableModel tabel;
    public Statement stt;
    public Connection con;
    private TableColumn column;
    
    public int biaya_, lama, total_;
    
    
    /**
     * Creates new form Rental_PS
     */
    public Rental_PS() {
        initComponents();
        String[] judul={"Kode Rental","Nama Pelanggan","Jenis PS","Biaya","Lama Sewa","Total","Jaminan","No HP","Alamat"};
        tabel = new DefaultTableModel(judul,0);
        tabmenu.setModel(tabel);
        tampilkan_data();
        disable_all();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kdrental = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nmpelanggan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jenisPS = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        biaya = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lamasewa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        totalbiaya = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jaminan = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        hp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabmenu = new javax.swing.JTable();
        hapus = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        Bg = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("RENTAL PS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 330, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Kode Rental");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText(":");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 90, -1, -1));
        getContentPane().add(kdrental, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 90, 132, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Nama Pelanggan");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 128, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText(":");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 128, -1, -1));
        getContentPane().add(nmpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 128, 132, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Jenis Playstation");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 166, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText(":");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 166, -1, -1));

        jenisPS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- PILIH JENIS PS --", "Playstation 2", "Playstation 3", "Playstation 4" }));
        jenisPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jenisPSMouseClicked(evt);
            }
        });
        jenisPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisPSActionPerformed(evt);
            }
        });
        getContentPane().add(jenisPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 166, 132, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Biaya Per Malam");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 204, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText(":");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 204, -1, -1));

        biaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayaActionPerformed(evt);
            }
        });
        getContentPane().add(biaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 204, 129, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Lama Sewa");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 242, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText(":");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 242, -1, -1));

        lamasewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamasewaActionPerformed(evt);
            }
        });
        getContentPane().add(lamasewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 242, 100, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("Malam");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 242, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("Total Biaya");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 280, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText(":");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 280, -1, -1));
        getContentPane().add(totalbiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 280, 97, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("Jaminan");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 318, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText(":");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 318, -1, -1));
        getContentPane().add(jaminan, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 318, 101, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setText("No HP");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 349, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText(":");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 349, -1, -1));
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 349, 149, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("Alamat");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 387, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 0));
        jLabel25.setText(":");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 387, -1, -1));
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 387, 150, -1));

        tabmenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tabmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabmenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabmenu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 447, 750, 109));

        hapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 180, 114, -1));

        simpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 131, 113, -1));

        edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 229, 114, -1));

        clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clear.setText("BATAL");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 110, -1));

        exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 276, 114, -1));

        tambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 89, -1, -1));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg umum.jpg"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -10, 1120, 640));

        setSize(new java.awt.Dimension(861, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        if(kdrental.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih Data Terlebih Dahulu !");
        }
        else{
            int reply = JOptionPane.showConfirmDialog(this,"Hapus Data Pemeriksaan ?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    java.sql.Connection koneksi = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/sewa_ps","root","");
                    koneksi.createStatement().executeUpdate("DELETE FROM rental where kdrental='"+kdrental.getText()+"'");
                    JOptionPane.showMessageDialog(this, "Data Dihapus !");
                    tampilkan_data();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus !");
                }
                
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
                //Simpan Data
String kd_rental = kdrental.getText();
String nama = nmpelanggan.getText();
String jenis = (String) jenisPS.getSelectedItem();
String biaya_ = biaya.getText();
String lama = lamasewa.getText();
String total_ = totalbiaya.getText();
String jaminan_ = jaminan.getText();
String nohp = hp.getText();
String alamat_ = alamat.getText();
{
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/sewa_ps", "root", "");
com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
String sql="insert into rental values('"+kd_rental+"','"+nama+"','"+jenis+"','"+biaya_+"','"+lama+"','"+total_+"','"+jaminan_+"','"+nohp+"','"+alamat_+"')";
int executeUpdate = statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
kdrental.setText("");
nmpelanggan.setText("");
jenisPS.setSelectedItem("-- PILIH JENIS PS --");
biaya.setText("");
lamasewa.setText("");
totalbiaya.setText("");
jaminan.setText("");
hp.setText("");
alamat.setText("");
koneksi.close();
}
catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
finally {
tampilkan_data();
}
    }               
    }//GEN-LAST:event_simpanActionPerformed

     private void tampilkan_data() {
        try {
            int data = tabmenu.getRowCount();
            for(int i=0;i<data;i++){
            tabel.removeRow(0);
            }
            com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/sewa_ps","root","");
            ResultSet re=koneksi.createStatement().executeQuery("SELECT * FROM rental ORDER BY kdrental");            
            while(re.next()){                
                String[] tabel_master={re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getString(7),re.getString(8),re.getString(9)};
                tabel.addRow(tabel_master);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan Tampil Tabel");
        }
    }
    
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
String kd_rental = kdrental.getText();
String nama = nmpelanggan.getText();
String jenis = (String) jenisPS.getSelectedItem();
String biaya_ = biaya.getText();
String lama = lamasewa.getText();
String total_ = totalbiaya.getText();
String jaminan_ = jaminan.getText();
String nohp = hp.getText();
String alamat_ = alamat.getText();
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/sewa_ps", "root", "");
com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
String sql="UPDATE rental SET kdrental='"+kd_rental+"',nm_pelanggan='"+nama+"',jenis='"+jenis+"',biaya='"+biaya_+"',lama='"+lama+"',total='"+total_+"',jaminan='"+jaminan_+"',nohp='"+nohp+"',alamat='"+alamat_+"'WHERE kdrental LIKE '"+kd_rental+"'";
statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil diedit..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}finally{
tampilkan_data();
}
    }//GEN-LAST:event_editActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        disable_all();
        
kdrental.setText("");
nmpelanggan.setText("");
jenisPS.setSelectedItem("-- PILIH JENIS PS --");
biaya.setText("");
lamasewa.setText("");
totalbiaya.setText("");
jaminan.setText("");
hp.setText("");
alamat.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        penomoran_otomatis();
        tambah.setEnabled(false);
        edit.setEnabled(false);
        hapus.setEnabled(false);
        simpan.setEnabled(true);
        clear.setEnabled(true);
    }//GEN-LAST:event_tambahActionPerformed

    private void disable_all() {
        tambah.setEnabled(true);
        edit.setEnabled(false);
        hapus.setEnabled(false);
        simpan.setEnabled(false);
        clear.setEnabled(false);
       }
    private void biayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayaActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_biayaActionPerformed

    private void lamasewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamasewaActionPerformed
         // TODO add your handling code here:
         lama = Integer.parseInt(lamasewa.getText());
            biaya_ = Integer.parseInt(biaya.getText());
            total_ = lama * biaya_;

            totalbiaya.setText(total_ + "");
    }//GEN-LAST:event_lamasewaActionPerformed

    private void tabmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabmenuMouseClicked
         // TODO add your handling code here:
         kdrental.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 0).toString());
        nmpelanggan.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 1).toString());
        jenisPS.setSelectedItem(tabmenu.getValueAt(tabmenu.getSelectedRow(), 2).toString());
        biaya.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 3).toString());
        lamasewa.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 4).toString());
        totalbiaya.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 5).toString());
        jaminan.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 6).toString());
        hp.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 7).toString());
        alamat.setText(tabmenu.getValueAt(tabmenu.getSelectedRow(), 8).toString());

        
        String temp_kd_rental = tabmenu.getValueAt(tabmenu.getSelectedRow(), 0).toString();
        
        tambah.setEnabled(false);
        edit.setEnabled(true);
        hapus.setEnabled(true);
        simpan.setEnabled(false);
        clear.setEnabled(true);
    }//GEN-LAST:event_tabmenuMouseClicked

   

    
    private void jenisPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisPSActionPerformed
        // TODO add your handling code here:
       String jenis= (String)(jenisPS.getSelectedItem());
         if(jenis == "Playstation 2"){
         biaya.setText("100000");
             
        }
        else if(jenis == "Playstation 3"){
            biaya.setText("200000");
                 
        }
         else if(jenis == "Playstation 4"){
            biaya.setText("300000");
                 
        }
                
    }//GEN-LAST:event_jenisPSActionPerformed

    private void jenisPSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jenisPSMouseClicked
         // TODO add your handling code here:
         
    }//GEN-LAST:event_jenisPSMouseClicked

     private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/sewa_ps","root","");
            stt = (Statement) con.createStatement();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Koneksi Database Error");
        }
    }
    
    private void penomoran_otomatis() {
        int kode_rental=0;
        String temp_kode_rental="";
        try {
            koneksi();
            String sql = "select kdrental from rental order by kdrental desc limit 1";                        
            ResultSet res=stt.executeQuery(sql);
            while (res.next()) {
                temp_kode_rental = res.getString(1);                
                String nomor_blkg = temp_kode_rental.substring(2,4);
                kode_rental=Integer.parseInt(nomor_blkg);
            }
                        
            kode_rental++;
            String nilai=String.valueOf(kode_rental);                      
            if(nilai.length()==1){
                kdrental.setText("R00"+kode_rental);
            }else
            if(nilai.length()==2){
                kdrental.setText("R0"+kode_rental);
            }else
            if(nilai.length()==3){
                kdrental.setText("R"+kode_rental);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Penomoran !");
        }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rental_PS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental_PS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental_PS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental_PS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental_PS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField biaya;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jaminan;
    private javax.swing.JComboBox<String> jenisPS;
    private javax.swing.JTextField kdrental;
    private javax.swing.JTextField lamasewa;
    private javax.swing.JTextField nmpelanggan;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabmenu;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField totalbiaya;
    // End of variables declaration//GEN-END:variables
}
