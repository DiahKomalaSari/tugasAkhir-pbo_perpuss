/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterface;

import Model.ModelPeminjaman;
import Model.ModelPengembalian;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface PengembalianInterface {
    ModelPengembalian simpan(ModelPengembalian o) throws SQLException;
void hapus (String no_transaksi) throws SQLException;
void edit (ModelPengembalian o) throws SQLException;
List<ModelPengembalian> tampil () throws SQLException;

    
    
}
