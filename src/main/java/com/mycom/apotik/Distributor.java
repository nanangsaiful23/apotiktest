package com.mycom.apotik;

public class Distributor extends Person{
    private int iddistributor   ;
    private String nama;
    private String kontak;
    private String alamat;
    private String Password;

    public Distributor() {
    }
    
    
    public Distributor(int iddistributor, String nama, String kontak, String alamat) {
        this.iddistributor = iddistributor;
        this.nama = nama;
        this.kontak = kontak;
        this.alamat = alamat;
    }

    public Distributor(int iddistributor, String nama, String kontak, String alamat, String Password) {
        this.iddistributor = iddistributor;
        this.nama = nama;
        this.kontak = kontak;
        this.alamat = alamat;
        this.Password = Password;
    }
    

    public Distributor( String nama, String kontak, String alamat, String Password) {
        this.nama = nama;
        this.kontak = kontak;
        this.alamat = alamat;
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIddistributor(int iddistributor) {
        this.iddistributor = iddistributor;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getIddistributor() {
        return iddistributor;
    }

    public String getKontak() {
        return kontak;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "id distibutor :" +iddistributor +"\nnama :"+nama+"\nalamat "+alamat +"\nkontak "+kontak;
    }
    
}
    