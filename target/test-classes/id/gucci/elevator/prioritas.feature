Feature: Prioritas

  Scenario: Pengguna prioritas ingin naik ke lantai tertentu
    Given pengguna prioritas sudah ada didalam elevator
    When pengguna prioritas mentapping id card dan memilih lantai
    Then elevator menuju lantai yang dipilih oleh pengguna prioritas
