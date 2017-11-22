Feature: tambah member
    Scenario: Pengguna ingin mendaftarkan diri menjadi member
      Given pengguna memberikan data
      When data pengguna belum tedaftar
      Then Petugas menginputkan data user
