package com.mycom.apotik;

import com.sun.xml.internal.ws.message.saaj.SAAJHeader;

import java.beans.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.tools.Diagnostic;

public class App {
   private List <Obat> dataobat=new ArrayList();
   private List<Pegawai> datapegawai=new ArrayList();
   private List<Pembeli> datapembeli= new ArrayList();
   private List<Distributor> dataDistributors= new ArrayList();
   private Database db;
   Scanner input= new Scanner(System.in);
   
   private static int idtransaksi=1;
    public App() {
        this.db=new Database();
        System.out.println("asd");
        db.connect();
        System.out.println("asd");
        this.datapegawai=db.loadPegawai();
        this.datapembeli=db.loadPembeli();
        this.dataobat=db.loadobat();
        this.dataDistributors=db.loaddistributor();
    }

    public List<Distributor> getDataDistributors() {
        return dataDistributors;
    }

    public List<Pembeli> getDatapembeli() {
        return datapembeli;
    }

    public Obat getDataobat(int i) {
        return dataobat.get(i);
    }

    public List<Obat> getDataobat() {
        return dataobat;
    }
   

    public List<Pegawai> getDatapegawai() {
        return datapegawai;
    }

    public void setDatapembeli(List<Pembeli> datapembeli) {
        this.datapembeli = datapembeli;
    }

    public void setDatapegawai(List<Pegawai> datapegawai) {
        this.datapegawai = datapegawai;
    }

    public void setDataobat(List<Obat> dataobat) {
        this.dataobat = dataobat;
    }

//    public void setDataDistributors(List<Distributor> dataDistributors) {
//        this.dataDistributors = dataDistributors;
//    }
    public void Masukkanobat(Obat o){
        db.saveObat(o);
        this.dataobat.add(o);
        this.dataobat=db.loadobat();
    }
    public void Liatdataobat(){
        for (Obat dataobat1 : dataobat) {
            System.out.println(dataobat1.toString());
        }
    }
    public void inputPegawai( Pegawai p){
        db.savePegawai(p);
        this.datapegawai.add(p);
        this.datapegawai=db.loadPegawai();
        }   
    public void liatdata(){
        for (Pegawai p: datapegawai) {
            System.out.println(p.toString());
        }
    }
    public void masukkandatadistributor(String nama, String kontak, String alamat,String password){
        Distributor d= new Distributor(nama, kontak, alamat, password);
        db.savedistributor(d);
        this.dataDistributors.add(d);
        this.dataDistributors=db.loaddistributor();
    }
//    public void liatDatadistributor(){
//        for (Distributor d :dataDistributors) {
//            System.out.println(d.toString());
//        }
//    }
    public void masukkanDataPembeli(Pembeli p){
        db.savePembeli(p);
        this.datapembeli.add(p);       
    }
    public void liatdataPembeli(){
        for (Pembeli p : datapembeli) {
            System.out.println(p.toString());
        }
    }
    public Pegawai caripegawai(int id){
        boolean t=false;
        for (Pegawai p :datapegawai) {
            if (p.getIdpegawai()==id)
                return p;
        }
        return null;
    }
    public Pembeli caripembeli(int id){

        for (Pembeli p : datapembeli) {
            if (p.getId()==id){
                return p;                
            }
        }
        return null;
    }
    public Obat cariobat( int id){
        for (Obat O1 : dataobat) {
            if(O1.getIdobat()==id){
                return O1;
            }
        }
        return null;
    }
    public List<Obat> caridataobat(int id){
        List<Obat> dt= new ArrayList();
        for (Obat dataobat1 : dataobat) {
            if (dataobat1.getIdobat()==id){
                dt.add(dataobat1);
            }
        }
        return dt;
    }
    
    public Distributor caridistributor(int id){
        for (Distributor d1 : dataDistributors) {
            if (d1.getIddistributor()==id){
                return d1;
            }
        }
        return null;
    }

    
    public void tambahRestock(Pegawai p,Distributor d,Obat o, int n){
      
      Pegawai pe;
      pe=caripegawai(p.getIdpegawai());
      db.saverestock(new Restock(d, o, pe));
      pe.Createstock(d, o, p);
      o.setJumlah(o.getJumlah()+n);
        for (Obat dataobat1 : dataobat) {
            db.updateobat(dataobat1);
        }
    }
    public void tambahtransaksi(Pegawai pg,Pembeli p,List<Obat> o,int jumlah,int harga){
        pg.Createjualbeli(p, o, jumlah,harga);
        db.savetransaksi(new Jualbeli(p, pg, o, harga, jumlah));
        int id= db.maxid();
        for (Obat o1 : o) {
            db.savedetiltransaksi(o1,id);
        }
        for (Obat o2 : dataobat) {
            db.updateobat(o2);
        }
    }
}
