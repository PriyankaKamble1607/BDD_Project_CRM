@Activity4
Feature: Add products
  

  @tag1
  Scenario Outline: Add products
    Given Open Browser and log in
    When create product with "<Product name>","<Part Number>","<Price>"
    Then validate Product
    And check more outcomes

 Examples:
 |Product name|Part Number|Price|
 |Intel Processor|c2222|1000|
  