/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterface;

import Model.ModelKategori;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public interface KategoriInterface {
ModelKategori simpan(ModelKategori o) throws SQLException;
void hapus (String id_kategori) throws SQLException;
void edit (ModelKategori o) throws SQLException;
List<ModelKategori> tampil () throws SQLException;
}
