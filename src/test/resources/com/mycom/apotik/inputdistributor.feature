Feature: new distributor
    Scenario:  person want to join distributor
      Given person give data  id = "3"  name = "doni" 
      When data not available
      Then employee input data distributor
