Feature: restock medicine
    Scenario: employee note the restock of medicine
      Given distributor have medicine with id  "2"
      When medicine in store limited
      Then employee note the medicine
