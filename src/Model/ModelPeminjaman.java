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
public class ModelPeminjaman {
 private String no_transaksi;
private String nama;
private String kode_buku;
private String judul_buku;
private String kategori_buku;
private String npm;
private String nama_pengarang;
private String tanggal;

public ModelPeminjaman(String no_transaksi, String nama, String kode_buku, String judul_buku, String kategori_buku, String npm, String nama_pengarang, String tanggal) {
        this.no_transaksi=no_transaksi;
        this.nama = nama;
        this.kode_buku=kode_buku;
        this.kategori_buku=kategori_buku;
        this.judul_buku=judul_buku;
        this.npm=npm;
        this.nama_pengarang=nama_pengarang;
        this.tanggal=tanggal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public ModelPeminjaman(Object object, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNo_transaksi() {
        return no_transaksi;
    }

    public void setNo_transaksi(String no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getKategori_buku() {
        return kategori_buku;
    }

    public void setKategori_buku(String kategori_buku) {
        this.kategori_buku = kategori_buku;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama_pengarang() {
        return nama_pengarang;
    }

    public void setNama_pengarang(String nama_pengarang) {
        this.nama_pengarang = nama_pengarang;
    }

    
    }




