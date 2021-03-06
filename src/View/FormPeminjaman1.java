/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import ControllerImplementasi.ImplementasiPeminjaman;
import ControllerInterface.PeminjamanInterface;
import Model.ModelPeminjaman;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class FormPeminjaman1 extends javax.swing.JPanel {
List <ModelPeminjaman> record =new ArrayList<>();
    PeminjamanInterface perpusservis;
    int row;

    /**
     * Creates new form FormPeminjaman1
     */
    public FormPeminjaman1() {
        initComponents();
        perpusservis=new ImplementasiPeminjaman();
      this.refresdata();
    }
    void panggildata(){
        try {
            record = perpusservis.tampil();
        } catch (Exception e) {
        } 
    }
    void isitabel(){
    Object data[][] = new Object[record.size()][8];
    int x = 0;
    for (ModelPeminjaman peminjaman : record){
    data[x][0]=peminjaman.getNo_transaksi();
    data[x][1]=peminjaman.getNpm();
    data[x][2]=peminjaman.getNama();
    data[x][3]=peminjaman.getKode_buku();
    data[x][4]=peminjaman.getJudul_buku();
    data[x][5]=peminjaman.getNama_pengarang();
    data[x][6]=peminjaman.getKategori_buku();
    data[x][7]=peminjaman.getTanggal();
    x++;
    }
    String judul[]={"no_transaksi","npm","Nama","Kode Buku","Judul Buku","Pengarang","Kategori Buku","Tanggal"};
    jTable2.setModel(new DefaultTableModel(data,judul));
    }
        

   void refresdata() {
         isitabel();
    panggildata(); 
   }
    void bersih ()
    {
        jTextField1.setText("");
        jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
          jTextField7.setText("");
           jTextField9.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Form Peminjaman");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("No. Transaksi : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("NPM :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Kode Buku :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Judul Buku :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nama Pengarang :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 20));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 88, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 280, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 130, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 100, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Kategori Buku :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, -1));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 460, 140));

        jButton1.setText("Pinjam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jButton2.setText("Batal");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jButton3.setText("Cari");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 80, -1));

        jLabel9.setText("Cari Data Peminjam");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton4.setText("Baru");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel10.setText("Tanggal :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 90, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String no_transaksi=jTextField1.getText();
String npm=jTextField3.getText();
String nama=jTextField2.getText();
String kode_buku=jTextField4.getText();
String judul_buku=jTextField5.getText();
String nama_pengarang=jTextField6.getText();
String kategori_buku=jTextField7.getText();
String tanggal=jTextField9.getText();

        if(no_transaksi.trim().equals("") && npm.trim().equals("")&& nama.trim().equals("")&& kode_buku.trim().equals("")&& judul_buku.trim().equals("")&& nama_pengarang.trim().equals("")&& kategori_buku.trim().equals("")&& tanggal.trim().equals("")){
            JOptionPane.showMessageDialog(this,"Data Tidak Boleh Kosong");
        }else{
            try {
                ModelPeminjaman perpus=new ModelPeminjaman(null, null);
                perpus.setNo_transaksi(jTextField1.getText());
                perpus.setNpm(jTextField3.getText());
                perpus.setNama(jTextField2.getText());
                perpus.setKode_buku(jTextField4.getText());
                perpus.setJudul_buku(jTextField5.getText());
                perpus.setNama_pengarang(jTextField6.getText());
                perpus.setKategori_buku(jTextField7.getText());
                perpus.setTanggal(jTextField9.getText());
                
                perpusservis.simpan(perpus);
                JOptionPane.showMessageDialog(this,"Data Telah Berhasil di Simpan");
                
            } catch (SQLException e) {
                System.out.println("gagal mengedit"+e);
                
            }
        }
    
                   
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.bersih();
panggildata();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
