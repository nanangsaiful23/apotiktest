Feature: buy medicine
    Scenario: user buy medicine
      Given user take medicine with id "1"
      When medicine available "5"
      Then employee input data transaction