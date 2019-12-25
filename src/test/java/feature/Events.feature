Feature: List of events in Upcoming, Happening and Expired events
Scenario: 
Given User is on Eduma homepage after the browser initialise
When user click on Events which opens the Events page
And user click on Happening, Upcoming or Expired event
Then user get the list of events for the clicked event title
And close the browser
