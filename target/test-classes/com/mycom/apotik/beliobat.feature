Feature: buy medicine
    @normal
    Scenario: user buy medicine
      Given user take medicine with id "1"
      When medicine available "5"
      Then employee input data transaction
    @medicine not available
    Scenario: user buy medicine
      Given user take medicine with id "2"
      When medicine not available "5"
      Then employee not input data transaction
    