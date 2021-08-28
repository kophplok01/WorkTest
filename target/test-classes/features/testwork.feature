Feature: verify the general operation of the user interface of the login page


  Scenario: checking the login page
    Given the actor juan accesses to the github login page
    When the actor clicks on terms button he can see the terms and services page
    And when the actor clicks on the privacy button he can see the privacy statement page
    And when the actor clicks on the Security button he can see the indicated page
    And when the actor clicks on the contact button he can see the indicated page
    And when the actor clicks on the button to create a new account, he can see the indicated page
    And when the actor clicks on the forgot password button, he can see the indicated page
    Then the actor verifies that he can log in complying with the specified conditions: user anaximanderpkk@gmail.com and password 57blocksworktest
