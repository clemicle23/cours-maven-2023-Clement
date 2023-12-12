Feature: Plug the machine and test the electrical system
  A new machine is created, plugged to the electrical system, and tested
  Scenario: A user plug his coffee machine and test the electrical system
    Given a new coffee machine with 0.10 l of min capacity, 3.0 l of max capacity, 600.0 l per h of water flow for the pump
    When The user plug the machine
    And The machine is functionning
    Then The machine is plugged