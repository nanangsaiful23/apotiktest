package com.mycom.apotik;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.omg.PortableInterceptor.DISCARDING;

public class Database {

    private String server = "jdbc:mysql://localhost:3306/apotik";
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement statement = null;
    private Connection connection = null;
    private App model;

    public void connect() {
        try {
//            connection = DriverManager.getConnection(server, dbuser, dbpasswd);
//       
//            statement = connection.createStatement();
            System.out.println("connection sukses ");
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat koneksi");
        }
    }

    public void savePegawai(Pegawai m) {
        try {
//            String query = "insert into pegawai(nama,shift,jabatan,gaji,password) values"
//                    + "('"
//                    //                    + m.getIdpegawai() + "', "+ "'"
//                    + m.getNama() + "', "
//                    + "'" + m.getShift() + "', "
//                    + "'" + m.getJabatan() + "', "
//                    + "'" + m.getGaji() + "', "
//                    + "'" + m.getPassword() + "')";
//            statement.execute(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save pegawai");
        }
    }

    public void saveObat(Obat t) {
        try {
//            String query = "insert into obat(namaobat,hargaobat,jenisobat,jumlahobat) values"
//                    + "('" + t.getNama() + "',"
//                    + "'" + t.getHarga() + "',"
//                    + "'" + t.getJenisobat() + "',"
//                    + "'" + t.getJumlah() + "')";
//            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            if (rs.next()) {
//                int generatedId = rs.getInt(1);
//                t.setIdobat(generatedId);
//            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save tim");
        }
    }

    public void savePembeli(Pembeli p) {
        try {
//            String query = "insert into pembeli(namapembeli,password) values"
//                    + "('" + p.getNama() + "',"
//                    + "'" + p.getPassword() + "')";
//            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            if (rs.next()) {
//                int generatedId = rs.getInt(1);
//                p.setId(generatedId);
//            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save tim");
        }
    }

    public void savetransaksi(Jualbeli t) {
        try {
//            String query = "insert into transaksi(idpembeli,idpegawai,totalharga,jumlahobat) values"
//                    + "('" + t.getPembeli().getId() + "',"
//                    + "'" + t.getPegawai().getIdpegawai() + "',"
//                    + "'" + t.getTotalharga() + "',"
//                    + "'" + t.getJumlahobat() + "')";
//            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            if (rs.next()) {
//                int generatedId = rs.getInt(1);
//                t.setIdtransaksi(generatedId);
//            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save tim");
        }
    }

    public void savedetiltransaksi(Obat o, int id) {
        try {
//            String query = "insert into detiltransaksi(idobat,idtransaksi) values"
//                    + "('" + o.getIdobat() + "',"
//                    + "'" + id + "')";
//            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save tim");
        }
    }

    public void updateobat(Obat o) {
        try {
//            String query;
//            query = "update obat set jumlahobat=" + o.getJumlah()
//                        + " where idobat='" + o.getIdobat() + "'";
//            statement.executeUpdate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat update tim");
        }
    }
    public ArrayList<Pegawai> loadPegawai() {
        try {
            ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
//            String query = "select * from pegawai";
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                Pegawai p = new Pegawai(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getString(6));
//                daftarPegawai.add(p);
//            }
            daftarPegawai.add(new Pegawai(1));
            daftarPegawai.add(new Pegawai(2));
            daftarPegawai.add(new Pegawai(3));
            return daftarPegawai;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load peserta");
        }
    }

    public ArrayList<Pembeli> loadPembeli() {
        try {
            ArrayList<Pembeli> daftarPembeli = new ArrayList<>();
           
//            String query = "select * from pembeli";
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                Pembeli p = new Pembeli(rs.getInt(1), rs.getString(2), rs.getString(3));
//                daftarPembeli.add(p);
//            }
            daftarPembeli.add(new Pembeli(1));
            daftarPembeli.add(new Pembeli(2));
            daftarPembeli.add(new Pembeli(3));
            return daftarPembeli;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load peserta");
        }
    }

    public ArrayList<Obat> loadobat() {
        try {
            ArrayList<Obat> daftarObats = new ArrayList<>();
//            String query = "select * from obat";
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                Obat o = new Obat(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
//                daftarObats.add(o);
//            }
            
            daftarObats.add(new Obat(1,"paramex",1000,"umum",10));
            daftarObats.add(new Obat(2,"konidin",2000,"umum",1));
            daftarObats.add(new Obat(3,"enervonce",2500,"umum",10));
            return daftarObats;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load pembeli");
        }
    }

    public ArrayList<Jualbeli> loadtransaksi(App model) {
        ArrayList<Jualbeli> daftartransaksi = new ArrayList<>();
//        try {
//            String query = "select * from transaksi";
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                Statement statement2 = connection.createStatement();
//                String query2 = "select * from detiltransaksi where idtransaksi=" + rs.getInt(1);
//                ResultSet rs2 = statement2.executeQuery(query2);
//                ArrayList<Obat> obats = new ArrayList();
//                while (rs2.next()) {
//                    Obat o1 = model.cariobat(rs2.getInt(1));
//                    obats.add(o1);
//                }
//                Jualbeli o = new Jualbeli(rs.getInt(1), model.caripembeli(rs.getInt(2)), model.caripegawai(rs.getInt(3)), obats, rs.getInt(4), rs.getInt(5));
//                daftartransaksi.add(o);
//            }
//        } catch (Exception e) {
//            throw new IllegalArgumentException("terjadi kesalahan saat load pembeli");
//        }
            daftartransaksi.add(new Jualbeli(1, new Pembeli(1), new Pegawai(1) ));
            daftartransaksi.add(new Jualbeli(2, new Pembeli(2), new Pegawai(2) ));
            daftartransaksi.add(new Jualbeli(3, new Pembeli(3), new Pegawai(3) ));
            
        return daftartransaksi;
    }

    public int maxid() {
        try {
//            String query = "select max(idtransaksi) from transaksi";
//            ResultSet rs = statement.executeQuery(query);
//            int n = 0;
//            while (rs.next()) {
//                n = Integer.parseInt(rs.getString(1));
//            }
            return 10;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load pembeli");
        }

    }

    public void savedistributor(Distributor d) {
        try {
//            String query = "insert into distributor(namadistributor,kontakditributor,alamatdistributor,password) values"
//                    + "('" + d.getNama() + "',"
//                    + "'" + d.getKontak() + "',"
//                    + "'" + d.getAlamat() + "',"
//                    + "'" + d.getPassword() + "')";
//            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            if (rs.next()) {
//                int generatedId = rs.getInt(1);
//                d.setIddistributor(generatedId);
//            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save tim");
        }
    }

    public ArrayList<Distributor> loaddistributor() {
        try {
            ArrayList<Distributor> daftarDistributor = new ArrayList<>();
//            String query = "select * from distributor";
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                Distributor o = new Distributor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//                daftarDistributor.add(o);
//            }
            
            daftarDistributor.add(new Distributor(0,"fadho","085741434512","bandung","124"));
            daftarDistributor.add(new Distributor(1,"darma","085745121232","jakarta","1456"));
            return daftarDistributor;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat loaddata distributor");
        }
    }
    public void saverestock(Restock r) {
        try {
//            String query = "insert into restock(iddistributor,idpegawai,idobat) values"
//                    + "('" + r.getDistributor().getIddistributor() + "',"
//                    + "'" + r.getPegawai().getIdpegawai() + "',"
//                    + "'" + r.getDataobat().getIdobat() + "')";
//            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save data rstock");
        }
    }
    public ArrayList<Restock> loadrestock(App model) {
        try {
            ArrayList<Restock> daftarrestock= new ArrayList<>();
//            String query = "select * from restock";
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                Pegawai p=model.caripegawai(rs.getInt(3));
//                Distributor d=model.caridistributor(rs.getInt(2));
//                Obat o1= model.cariobat(rs.getInt(4));
//                Restock r = new Restock(rs.getInt(1), d, o1, p);
//                daftarrestock.add(r);
//            }
            daftarrestock.add(new Restock(1));
            daftarrestock.add(new Restock(2));
            return daftarrestock;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load peserta");
        }
    }

}
