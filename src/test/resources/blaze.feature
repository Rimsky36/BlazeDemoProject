Feature: Blaze Demo Purchase Page Funtionality

  Scenario Outline: Verify User able to Purchase Flights
    Given User navigates to Register Page "https://blazedemo.com/purchase.php"
    When User enters FirstAndLastName "<firstLastName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And User enters ZipCode "<zipCode>"
    And User selects CardType "<cardType>"
    And User enters CreditCardNumber "<creditCardNumber>"
    And User enters Month "<month>"
    And User enters Year "<year>"
    And User enters NameOnCard "<nameOnCard>"
    And User clicks on Remember Me box
    And User clicks on Purchase Flight button
    Then User verifies correct message "<message>"

    Examples: 
      | firstLastName | address | city          | state | zipCode | cardType         | creditCardNumber | month    | year | nameOnCard | message                            |
      | Rober N       | 433 Dr  | La Mesa       | CA    |   92124 | Diner's Club     |        123456789 | April    | 2025 | Rober N    | Thank you for your purchase today! |
      | Nicole K      | 678 Rd  | Carlsbad      | CA    |   98989 | American Express |        555444785 | May      | 2026 | Nicole K   | Thank you for your purchase today! |
      | Frank S       | 665 St  | Oceanside     | CA    |   98766 | Diner's Club     |        644712457 | December | 2028 | Frank S    | Thank you for your purchase today! |
      | Marc A        | 909 Crt | La Jolla      | CA    |   99877 | American Express |        325878765 | January  | 2025 | Marc A     | Thank you for your purchase today! |
      | Tom H         | 112 Dr  | Pacific Beach | CA    |   93232 | Diner's Club     |        336699887 | Jun      | 2027 | Tom H      | Thank you for your purchase today! |
