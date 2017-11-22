Feature: catatobat
    Scenario: pegawai mencatat obat
      Given distributor membawa obat
      When medicine di gudang sudah siap untuk restock
      Then Petugas menginputkan data medicine
