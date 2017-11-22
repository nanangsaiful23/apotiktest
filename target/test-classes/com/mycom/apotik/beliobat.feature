Feature: beliobat
    Scenario: Pengguna ingin membeli obat
      Given pengguna meminta medicine
      When medicine tersedia
      Then Petugas menginputkan data
            