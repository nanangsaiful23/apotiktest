Feature: new employee
    Scenario:  person want to join employee
      Given data person  id ="8" and name="deni" 
      When data person not available in employee
      Then owner input data employee

