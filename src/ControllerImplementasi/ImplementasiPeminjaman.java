/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImplementasi;

import ControllerInterface.PeminjamanInterface;
import Koneksi.Koneksi;
import Model.ModelKategori;
import Model.ModelPeminjaman;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ImplementasiPeminjaman implements PeminjamanInterface {

    @Override
    public ModelPeminjaman simpan(ModelPeminjaman o) throws SQLException {
         PreparedStatement simpan = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_peminjaman");
        simpan.setString(1,o.getNo_transaksi());
        simpan.setString(2,o.getNama());
        simpan.setString(3,o.getKode_buku());
        simpan.setString(4,o.getKategori_buku());
        simpan.setString(5,o.getJudul_buku());
        simpan.setString(6,o.getNama_pengarang());
        simpan.setString(7,o.getNpm());
        
        simpan.executeUpdate();
        return o; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapus(String no_transaksi) throws SQLException {
         PreparedStatement st= (PreparedStatement)
            Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_peminjaman");
    st.setString(1, no_transaksi);
st.executeUpdate();  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(ModelPeminjaman o) throws SQLException {
        PreparedStatement edit = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_peminjaman");
        edit.setString(1,o.getNo_transaksi());
        edit.setString(2,o.getNama());
        edit.setString(3,o.getJudul_buku());
        edit.setString(4,o.getKategori_buku());
        edit.setString(5,o.getKode_buku());
        edit.setString(6,o.getNpm());
        edit.setString(7,o.getNama_pengarang());
        
        edit.executeUpdate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModelPeminjaman> tampil() throws SQLException {
         Statement stm= (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst= stm.executeQuery("SELECT * FROM tbl_peminjaman");
List <ModelPeminjaman> Listpeminjaman = new ArrayList<>();
while (rst.next()){
ModelPeminjaman peminjaman = new ModelPeminjaman(null, null);
peminjaman.setNo_transaksi(rst.getString("no_transaksi"));
peminjaman.setNama(rst.getString("nama"));
peminjaman.setKode_buku(rst.getString("kode_buku"));
peminjaman.setKategori_buku(rst.getString("kategori_buku"));
peminjaman.setNama_pengarang(rst.getString("nama_pengarang"));
peminjaman.setNpm(rst.getString("npm"));
peminjaman.setJudul_buku(rst.getString("judul_buku"));
Listpeminjaman.add(peminjaman);
}
return Listpeminjaman; //To change body of generated methods, choose Tools | Templates.
    }
    
}
