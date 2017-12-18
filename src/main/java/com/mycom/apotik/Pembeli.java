package com.mycom.apotik;

public class Pembeli extends Person{
   private int id;
   private String nama; 
   private String Password;

    public Pembeli(int id, String nama,String Password) {
        this.id = id;
        this.nama = nama;
        this.Password=Password;
    }

    public Pembeli() {
       
    }

    public Pembeli(String nama, String Password) {
        this.nama = nama;
        this.Password = Password;
    }

    public Pembeli(int id) {
        this.id = id;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @Override
    public String toString() {
        return "id  :"+id +"\nnama : "+nama; //To change body of generated methods, choose Tools | Templates.
    }
    
}
