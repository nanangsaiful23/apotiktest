Feature: buy

Scenario: beliobat

    Given tickets can be purchased

     When "regular" customer makes request to purchase the ticket
      And request is within the acceptable discount period defined by the policy

     Then price of the ticket should be reduced for amount defined by the policy
      And payment transaction should be initiated with payment provider
      And customer should be notified about the "purchase"