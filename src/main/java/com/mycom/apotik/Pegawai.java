package com.mycom.apotik;
import java.util.ArrayList;
import java.util.List;

public class Pegawai extends Person{
    private int idpegawai;
    private String nama;
    private int shift;
    private String jabatan;
    private double gaji;
    private String Password;
    private List<Restock> datarestock;
    private List<Jualbeli> datajualbeli;

    public Pegawai(int idpegawai, String nama, int shift, String jabatan, double gaji, String password) {
        this.idpegawai = idpegawai;
        this.nama = nama;
        this.shift = shift;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.Password=password;
        this.datarestock= new ArrayList();
        this.datajualbeli=new ArrayList();
    }

    public Pegawai(String nama, int shift, String jabatan, double gaji, String Password) {
        this.nama = nama;
        this.shift = shift;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.Password = Password;
         this.datarestock= new ArrayList();
        this.datajualbeli=new ArrayList();
    }

    public Pegawai(int idpegawai) {
        this.idpegawai = idpegawai;
         this.datarestock= new ArrayList();
        this.datajualbeli=new ArrayList();
    }
    
    public Pegawai() {
         this.datarestock= new ArrayList();
        this.datajualbeli=new ArrayList();
    }

    public List<Jualbeli> getDatajualbeli() {
        return datajualbeli;
    }
      
    public void Createjualbeli(Pembeli p,List<Obat> obat,int jumlah,int harga){
       
        Jualbeli j= new Jualbeli(p, this, obat,jumlah,harga );
        this.datajualbeli.add(j);
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }
    
    public void Createstock( Distributor distributor, Obat obat, Pegawai pegawai){
        Restock r=new Restock(distributor, obat, pegawai);
        this.datarestock.add(r);
    }
    
    public void Lihatdatapegawai() {
        System.out.println(toString());
        for (Restock r : datarestock) {
            System.out.println(r.toString());
        }    
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setIdpegawai(int idpegawai) {
        this.idpegawai = idpegawai;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getGaji() {
        return gaji;
    }

    public int getIdpegawai() {
        return idpegawai;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }

    public int getShift() {
        return shift;
    }

//    @Override
//    public String toString() {
//       String temp="";
//       for (Restock r : datarestock) {
//            temp+=r.toString();
//        }
//        return "idpegawai :"+idpegawai+"\nnama :"+nama+"\njabatan :" +jabatan + "\ngaji "+gaji+"\n "+temp;
//     }
    
    
}
