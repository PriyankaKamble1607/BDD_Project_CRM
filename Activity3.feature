@Activity3
Feature: Schedule Meeting


  @tag1
  Scenario: Schedule Meeting
    Given Log in to Alchemy CRM
    When Schedule a meeting "scrum call"
    Then Confirm creation of meeting
    
