/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImplementasi;

import ControllerInterface.DataAnggotaInterface;
import Koneksi.Koneksi;
import Model.ModelDataAnggota;
import Model.ModelKategori;
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
public class ImplementasiDataAnggota implements DataAnggotaInterface{

    @Override
    public ModelDataAnggota simpan(ModelDataAnggota o) throws SQLException {
PreparedStatement simpan = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_anggota");
        simpan.setString(1,o.getId_anggota());
        simpan.setString(2,o.getNama());
        simpan.setString(3,o.getAlamat());
        simpan.setString(4,o.getEmail());
        simpan.setString(5,o.getJenis_kelamin());
        simpan.setString(6,o.getJurusan());
        simpan.setString(7,o.getNo_telp());  
    simpan.setString(8,o.getUmur()); 
    simpan.setString(9,o.getNpm());
    
    return o; }

    @Override
    public void hapus(String id_anggota) throws SQLException {
       PreparedStatement st= (PreparedStatement)
            Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_anggota");
    st.setString(1, id_anggota);
st.executeUpdate();  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(ModelDataAnggota o) throws SQLException {
        PreparedStatement edit = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("SELECT * FROM tbl_anggota");
        edit.setString(1,o.getAlamat());
        edit.setString(2,o.getEmail());
        edit.setString(3,o.getId_anggota());
        edit.setString(4,o.getJenis_kelamin());
        edit.setString(5,o.getJurusan());
        edit.setString(6,o.getNpm());
        edit.setString(7,o.getNama());
        edit.setString(8,o.getNo_telp());
        edit.setString(9,o.getUmur());
        
        edit.executeUpdate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModelDataAnggota> tampil() throws SQLException {
   Statement stm= (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst= stm.executeQuery("SELECT * FROM tbl_anggota");
List <ModelDataAnggota> ListdataAnggota = new ArrayList<>();
while (rst.next()){
ModelDataAnggota dataAnggota = new ModelDataAnggota(null, null);
dataAnggota.setAlamat(rst.getString("alamat"));
dataAnggota.setId_anggota(rst.getString("id_anggota"));
dataAnggota.setJenis_kelamin(rst.getString("jenis_kelamin"));
dataAnggota.setJurusan(rst.getString("jurusan"));
dataAnggota.setNama(rst.getString("nama"));
dataAnggota.setNo_telp(rst.getString("no_telp"));
dataAnggota.setNpm(rst.getString("npm"));
dataAnggota.setUmur(rst.getString("umur"));
ListdataAnggota.add(dataAnggota);
}
return ListdataAnggota;       //To change body of generated methods, choose Tools | Templates.
    }
    
}
