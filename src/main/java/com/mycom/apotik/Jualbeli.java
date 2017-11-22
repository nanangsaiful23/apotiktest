package com.mycom.apotik;

import java.util.ArrayList;
import java.util.List;

public class Jualbeli {
 private int idtransaksi;
 private  Pembeli pembeli;
 private Pegawai pegawai;
 private List<Obat> obat;
 private double totalharga;
 private int jumlahobat;



    public Jualbeli(int idtransaksi, Pembeli pembeli, Pegawai pegawai) {
        this.idtransaksi = idtransaksi;
        this.pembeli = pembeli;
        this.pegawai = pegawai;
        this.obat= new ArrayList();
    }

    public Jualbeli( Pembeli pembeli, Pegawai pegawai, List<Obat> obat, double totalharga, int jumlahobat) {
        this.pembeli = pembeli;
        this.pegawai = pegawai;
        this.obat = obat;
        this.totalharga = totalharga;
        this.jumlahobat = jumlahobat;
    }

    public Jualbeli(int idtransaksi, Pembeli pembeli, Pegawai pegawai, List<Obat> obat, double totalharga, int jumlahobat) {
        this.idtransaksi = idtransaksi;
        this.pembeli = pembeli;
        this.pegawai = pegawai;
        this.obat = obat;
        this.totalharga = totalharga;
        this.jumlahobat = jumlahobat;
    }
    

    public Pembeli getPembeli() {
        return pembeli;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public int getJumlahobat() {
        return jumlahobat;
    }
    

    public void addObat(Obat o, int j){
        if (o.getJumlah()>=j){
        this.obat.add(o);
        o.setJumlah(o.getJumlah()-j);
        this.jumlahobat=jumlahobat+j;
        this.totalharga=totalharga+j*o.getHarga();
        }else{
            System.out.println("obat tidak memenuhi");
        }
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }
    
    public int getIdtransaksi() {
        return idtransaksi;
    }

    public double getTotalharga() {
        return totalharga;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public void setTotalharga(double totalharga) {
        this.totalharga = totalharga;
    }

    @Override
    public String toString() {
        String temp = "";
        for (Obat obat1 : obat) {
            temp += obat1.toString();
            
        }
        return pegawai.toString()+
                "\n================\n"+
                "id transaksi "+idtransaksi+
                "\n================\n"+
                temp+           
                "\n================\n"+
                pembeli.toString()+
                "\njumlah obat :"+jumlahobat+
                "\ntotal harga :"+totalharga;

    }
    
}
