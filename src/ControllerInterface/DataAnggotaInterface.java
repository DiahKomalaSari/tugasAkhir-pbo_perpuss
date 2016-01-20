/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterface;

import Model.ModelDataAnggota;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface DataAnggotaInterface {
    ModelDataAnggota simpan(ModelDataAnggota o) throws SQLException;
void hapus (String id_anggota) throws SQLException;
void edit (ModelDataAnggota o) throws SQLException;
List<ModelDataAnggota> tampil () throws SQLException;

    
}
    

