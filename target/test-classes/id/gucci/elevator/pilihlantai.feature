Feature: Pilih_Lantai

  Scenario: Pengguna akan memilih lantai tujuan dari dalam elevator
    Given Saya telah menekan lantai tujuan
    When Saya sudah berada di dalam elevator
    And Elevator sedang tidak ada antrian
    Then Elevator akan berpindah ke lantai tujuan

Scenario: Pengguna akan memilih lantai tujuan dari dalam elevator
    Given Saya telah menekan lantai tujuan
    When Saya sudah berada di dalam elevator
    And Elevator sedang ada antrian
    Then Elevator akan berpindah ke lantai tujuan yang berada pada antrian pertama