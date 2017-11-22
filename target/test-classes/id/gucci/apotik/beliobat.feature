Feature: emergency
    Scenario: Pengguna ingin membeli obat
      Given pelayan memberikan obat
      When Obat tersedia
      Then Petugas menginputkan transaksi pembayaran