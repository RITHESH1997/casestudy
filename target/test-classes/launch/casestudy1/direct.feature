Feature: to search a product directly



  Scenario Outline: Search a product
    Given user directly search by typing "<search>"
    And click find details button
		Then the page is redirected to the login page

    Examples: 
    | search  |
   | Headphone |
