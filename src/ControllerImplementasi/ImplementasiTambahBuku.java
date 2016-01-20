/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImplementasi;

import ControllerInterface.TambahBukuInterface;
import Koneksi.Koneksi;
import Model.ModelKategori;
import Model.ModelTambahBuku;
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
public class ImplementasiTambahBuku implements TambahBukuInterface{

    @Override
    public ModelTambahBuku simpan(ModelTambahBuku o) throws SQLException {
         PreparedStatement simpan = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_tambahbuku");
        simpan.setString(1,o.getJudul_buku());
        simpan.setString(2,o.getKategori_buku());
          simpan.setString(3,o.getKode_buku());
          simpan.setString(4,o.getPengarang());
          simpan.setString(5,o.getTgl_masukbuku());
          simpan.setString(6,o.getThn_terbit());
        simpan.executeUpdate();
        return o;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapus(String kode_buku) throws SQLException {
        PreparedStatement st= (PreparedStatement)
            Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_tambahbuku");
    st.setString(1,kode_buku);
st.executeUpdate();  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(ModelTambahBuku o) throws SQLException {
         PreparedStatement edit = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_tambahbuku");
        edit.setString(1,o.getJudul_buku());
        edit.setString(2,o.getKategori_buku());
        edit.setString(3,o.getKode_buku());
        edit.setString(4,o.getTgl_masukbuku());
        edit.setString(5,o.getPengarang());
        edit.setString(6,o.getThn_terbit());
        edit.executeUpdate();
            //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModelTambahBuku> tampil() throws SQLException {
       Statement stm= (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst= stm.executeQuery("call TampilTambahBuku");
List <ModelTambahBuku> ListtambahBuku = new ArrayList<>();
while (rst.next()){
ModelTambahBuku tambahBuku = new ModelTambahBuku(null, null);
tambahBuku.setJudul_buku(rst.getString("judul_buku"));
tambahBuku.setKategori_buku(rst.getString("kategori_buku"));
tambahBuku.setKode_buku(rst.getString("kode_buku"));
tambahBuku.setPengarang(rst.getString("tanggal_masukbuku"));
tambahBuku.setThn_terbit(rst.getString("thn_terbit"));

ListtambahBuku.add(tambahBuku);
}
return ListtambahBuku; //To change body of generated methods, choose Tools | Templates.
    }
    
}
