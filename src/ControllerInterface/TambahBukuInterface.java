/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterface;



import Model.ModelTambahBuku;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface TambahBukuInterface {
    ModelTambahBuku simpan(ModelTambahBuku o) throws SQLException;
void hapus (String kode_buku) throws SQLException;
void edit (ModelTambahBuku o) throws SQLException;
List<ModelTambahBuku> tampil () throws SQLException;  
}
