package com.mycom.apotik;

public class Obat {
    private int idobat;
    private String nama;
    private int harga;
    private String jenisobat;
    private int jumlah;

    public Obat() {
    }
    
    
    public Obat(int idobat, String nama, int harga, String jenisobat,int jumlah) {
        this.idobat = idobat;
        this.nama = nama;
        this.harga = harga;
        this.jenisobat = jenisobat;
        this.jumlah=jumlah;
    }

    public Obat(int idobat) {
        this.idobat = idobat;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setIdobat(int idobat) {
        this.idobat = idobat;
    }

    public void setJenisobat(String jenisobat) {
        this.jenisobat = jenisobat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getIdobat() {
        return idobat;
    }

    public String getJenisobat() {
        return jenisobat;
    }

    public String getNama() {
        return nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    @Override
    public String toString() {
        return "idobat :"+idobat +"\nnama :"+ nama+ " \njenis obat :"+jenisobat+
                "\njumlah :"+jumlah+"\nharga :"+harga;
    }
    
}
