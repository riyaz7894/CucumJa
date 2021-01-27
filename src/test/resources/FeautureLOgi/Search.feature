
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Smoke
  Scenario Outline: Enter the user name
    Given The user in the  demo.guru99.com
    When The user want to enter the username "<item>","<monthlyRental>","<Local Minutes>","<Free International Minutes>","<Free SMS Pack>"
    Then The username should ne displayed "<item>","<monthlyRental>","<Local Minutes>","<Free International Minutes>","<Free SMS Pack>"

    Examples: 
      | item   | monthlyRental | Local Minutes | Free International Minutes | Free SMS Pack |
      | riyaz  |           200 |            30 |                         10 | yes           |
      | salman |           600 |             5 |                         90 | no            |
      | sathy  |          1500 |            10 |                        200 | yes           |
