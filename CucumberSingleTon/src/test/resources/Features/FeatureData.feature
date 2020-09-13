@Reg
Feature: Verify Adactin using datatype details

  Scenario Outline: Verify login details and enter
    Given User is on Adactin page
    When User should enter "<userName>", "<password>" and click
    And User should search hotel by values "<location>","<hotels>","<roomType>","<checkinDt>","<checkkOutDt>","<firstName>","<lastName>","<add>","<ccNo>","<expMon>","<expYr>"and"<cvvNo>"
      | noOfRooms | adultsPerRoom | childPerRoom | cardType         |
      | 1 - One   | 1 - One       | 0 - None     | American Express |
      | 2 - Two   | 2 - Two       | 1 - One      | VISA             |
      | 3 - Three | 3 - Three     | 2 - Two      | Master Card      |
      | 4 - Four  | 4 - Four      | 3 - Three    | Other            |
      | 5 - Five  |               | 4 - Four     |                  |
      | 6 - Six   |               |              |                  |
      | 7 - Seven |               |              |                  |
      | 8 - Eight |               |              |                  |
      | 9 - Nine  |               |              |                  |
      | 10 - Ten  |               |              |                  |
    And print the booking id generated
    Then user should enter the logout button

    Examples: 
      | userName  | password | location  | hotels         | roomType | checkinDt  | checkkOutDt | firstName | lastName | add             | ccNo             | expMon | expYr | cvvNo |
      | Pushparaj | HF07YG   | Melbourne | Hotel Sunshine | Standard | 01/09/2020 | 02/09/2020  | Pushparaj | Utham    | No.1,FirstColny | 4567765498768907 | July   |  2022 |   234 |
