/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImplementasi;

import ControllerInterface.PengembalianInterface;
import Koneksi.Koneksi;
import Model.ModelPeminjaman;
import Model.ModelPengembalian;
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
public class ImplementasiPengembalian implements PengembalianInterface{

    @Override
    public ModelPengembalian simpan(ModelPengembalian o) throws SQLException {
        PreparedStatement simpan = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_pengembalian");
        simpan.setString(1,o.getNo_transaksi());
        simpan.setString(2,o.getNama());
        simpan.setString(3,o.getKode_buku());
        simpan.setString(5,o.getJudul_buku());
        simpan.setString(6,o.getNama_pengarang());
        simpan.setString(7,o.getNpm());
        simpan.setString(8,o.getTanggal());
        
        simpan.executeUpdate();
        return o; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapus(String no_transaksi) throws SQLException {
          PreparedStatement st= (PreparedStatement)
            Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_pengembalian");
    st.setString(1, no_transaksi);
st.executeUpdate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(ModelPengembalian o) throws SQLException {
         PreparedStatement edit = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_pengembalian");
        edit.setString(1,o.getNo_transaksi());
        edit.setString(2,o.getNama());
        edit.setString(3,o.getJudul_buku());
        edit.setString(5,o.getKode_buku());
        edit.setString(6,o.getNpm());
        edit.setString(7,o.getNama_pengarang());
        edit.setString(8,o.getTanggal());
        edit.executeUpdate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModelPengembalian> tampil() throws SQLException {
     Statement stm= (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst= stm.executeQuery("SELECT * FROM tbl_pengembalian");
List <ModelPengembalian> Listpengembalian= new ArrayList<>();
while (rst.next()){
ModelPengembalian pengembalian = new ModelPengembalian(null, null);
pengembalian.setNo_transaksi(rst.getString("no_transaksi"));
pengembalian.setNama(rst.getString("nama"));
pengembalian.setKode_buku(rst.getString("kode_buku"));
pengembalian.setNama_pengarang(rst.getString("nama_pengarang"));
pengembalian.setNpm(rst.getString("npm"));
pengembalian.setJudul_buku(rst.getString("judul_buku"));
pengembalian.setTanggal(rst.getString("tanggal"));
Listpengembalian.add(pengembalian);
}
return Listpengembalian; //To change body of generated methods, choose Tools | Templates.
    }
    
}
