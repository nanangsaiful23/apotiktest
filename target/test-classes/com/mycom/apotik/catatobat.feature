Feature: restock medicine
    @normal
    Scenario: employee note the restock of medicine
      Given distributor have medicine with id  "2"
      When medicine in store limited
      Then employee note the medicine
    @obatnotlimited
    Scenario: employee not note the restock of medicine
      Given distributor have medicine with id  "1"
      When medicine in store not limited
      Then employee not note the medicine
    