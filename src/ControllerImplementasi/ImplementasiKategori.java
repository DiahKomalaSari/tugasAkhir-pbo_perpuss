/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImplementasi;

import ControllerInterface.KategoriInterface;
import Koneksi.Koneksi;
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
public class ImplementasiKategori implements KategoriInterface{

    @Override
    public ModelKategori simpan(ModelKategori o) throws SQLException {
        PreparedStatement simpan = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("call SimpanKategori (?,?)");
        simpan.setString(1,o.getId_kategori());
        simpan.setString(2,o.getNama_kategori());
        simpan.executeUpdate();
        return o;
        
        
    }

    @Override
    public void hapus(String id_kategori) throws SQLException {
    PreparedStatement st= (PreparedStatement)
            Koneksi.KoneksiDatabase().prepareStatement("call HapusKategori (?)");
    st.setString(1, id_kategori);
st.executeUpdate();    }

    @Override
    public void edit(ModelKategori o) throws SQLException {
    PreparedStatement edit = (PreparedStatement)
        Koneksi.KoneksiDatabase().prepareStatement("call EditKategori (?,?)");
        edit.setString(1,o.getNama_kategori());
        edit.setString(2,o.getId_kategori());
        edit.executeUpdate();
           
    }

    @Override
    public List<ModelKategori> tampil() throws SQLException {
        Statement stm= (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst= stm.executeQuery("call TampilKategori");
List <ModelKategori> Listkategori = new ArrayList<>();
while (rst.next()){
ModelKategori kategori = new ModelKategori(null, null);
kategori.setId_kategori(rst.getString("id_kategori"));
kategori.setNama_kategori(rst.getString("nama_kategori"));
Listkategori.add(kategori);
}
return Listkategori;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
