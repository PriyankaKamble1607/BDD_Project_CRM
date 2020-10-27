@Activity2
Feature: create leads using parameterization
  
  @tag1
  Scenario: create leads using parameterization
    Given Log in to CRM
    When create lead with "Priya","Shitole","Test Lead"
    Then validate the Lead
    
