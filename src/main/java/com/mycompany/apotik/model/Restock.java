package com.mycompany.apotik.model;

import com.sun.corba.se.spi.oa.OADefault;
import java.util.ArrayList;
import java.util.List;

public class Restock {
    private int idtransaksi;
    private Distributor distributor;
    private Obat dataobat ;
    private Pegawai pegawai;

    public Restock() {
    }

    
    public Restock( Distributor distributor, Obat obat, Pegawai pegawai) {
        this.distributor = distributor;
        this.dataobat=obat;
        this.pegawai = pegawai;
    }

    public Restock(int idtransaksi, Distributor distributor, Obat dataobat, Pegawai pegawai) {
        this.idtransaksi = idtransaksi;
        this.distributor = distributor;
        this.dataobat = dataobat;
        this.pegawai = pegawai;
    }
    
//    public void addobat(Obat o, int j){
//        this.dataobat.add(o);
//        o.setJumlah(o.getJumlah()+j);
//    }

    public Distributor getDistributor() {
        return distributor;
    }

    public int getIdtransaksi() {
        return idtransaksi;
    }

//    public Obat getObat(int i) {
//        return dataobat.get(i);
//    }
    
    public Obat getDataobat() {
        return dataobat;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }


    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }
    
//
//    @Override
//    public String toString() {
//        String temp = "";
//        for (Obat dataobat1 : dataobat) {
//            temp+=dataobat1.toString();
//        }
//        return "idtransaksi :"+idtransaksi+
//                "\nobat yang di inputkan:\n"+temp+
//                "\n distributor: \n"+distributor.toString();
//    }
//    
//    

    public void setDataobat(Obat dataobat) {
        this.dataobat = dataobat;
    }
}
