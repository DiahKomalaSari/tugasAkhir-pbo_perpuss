/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterface;


import Model.ModelPeminjaman;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface PeminjamanInterface {
    ModelPeminjaman simpan(ModelPeminjaman o) throws SQLException;
void hapus (String no_transaksi) throws SQLException;
void edit (ModelPeminjaman o) throws SQLException;
List<ModelPeminjaman> tampil () throws SQLException;

    
}
