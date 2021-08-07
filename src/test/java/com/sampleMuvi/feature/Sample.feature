Feature: Sample feature

  Scenario: Sample test scenario page
    Given User logged in to Muvi application
    When logo of the application is present, user clicks on Free trial button
    When User-Info page appears , User fills all the information and click on Next button
    When user is in Dashboard Page
    Then Mousehovers to Manage Content and click on Content Library
    When user Clicks on Add content
    And fills the Basic Info section
    And Clicks on Save & Continue button
    Then Mousehovers to Manage Content and click on Content Library
    When user checks for newly added content, it should be present in Content Library