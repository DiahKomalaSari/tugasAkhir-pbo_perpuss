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
public class ModelTambahBuku {
 private String judul_buku;
private String pengarang;
private String thn_terbit;
private String tgl_masukbuku;
private String kode_buku;
private String kategori_buku;  

    public ModelTambahBuku(String judul_buku, String pengarang, String thn_terbit, String tgl_masukbuku, String kode_buku, String kategori_buku) {
        this.judul_buku = judul_buku;
        this.pengarang = pengarang;
        this.thn_terbit = thn_terbit;
        this.tgl_masukbuku = tgl_masukbuku;
        this.kode_buku = kode_buku;
        this.kategori_buku = kategori_buku;
        
    }

    public ModelTambahBuku(Object object, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getThn_terbit() {
        return thn_terbit;
    }

    public void setThn_terbit(String thn_terbit) {
        this.thn_terbit = thn_terbit;
    }

    public String getTgl_masukbuku() {
        return tgl_masukbuku;
    }

    public void setTgl_masukbuku(String tgl_masukbuku) {
        this.tgl_masukbuku = tgl_masukbuku;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getKategori_buku() {
        return kategori_buku;
    }

    public void setKategori_buku(String kategori_buku) {
        this.kategori_buku = kategori_buku;
    }
   
}
