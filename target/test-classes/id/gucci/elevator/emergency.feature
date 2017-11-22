Feature: emergency
    Scenario: Pengguna ingin meminta bantuan
      Given Saya telah menekan emergency call
      When Elevator bermasalah
      Then Petugas mendapat panggilan dari elevator