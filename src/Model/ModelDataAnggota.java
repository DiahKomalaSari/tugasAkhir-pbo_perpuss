/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class ModelDataAnggota {
private String id_anggota;
private String nama;
private String jurusan;
private String jenis_kelamin;
private String email;
private String npm;
private String no_telp;
private String umur;  
private String alamat;  

    public ModelDataAnggota(String id_anggota, String nama, String jurusan, String jenis_kelamin, String email, String npm, String no_telp, String umur, String alamat) {
        this.id_anggota = id_anggota;
        this.nama = nama;
        this.jurusan = jurusan;
        this.jenis_kelamin = jenis_kelamin;
        this.email = email;
        this.npm = npm;
        this.no_telp = no_telp;
        this.umur = umur;
        this.alamat = alamat;
        
    }

    public ModelDataAnggota(Object object, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(String id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}

