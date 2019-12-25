Feature: Application Forgot password

Scenario Outline:

Given After Initialising the Chrome browser user is on Eduma homepage
When user click on login which opens the login page, user click on lost your password
And user enters <usernameoremail> and click Reset Password
Then user get the result displayed = <condition>
And user close the browser
Examples:
|usernameoremail |     |condition|
|testing  |            |http://sethuonline.com/lms/account/?result=reset|
|testing@gmail.com|    |http://sethuonline.com/lms/account/?action=lostpassword&user_not_exist=1|
|demo@yahoo.com|       |http://sethuonline.com/lms/account/?action=lostpassword&user_not_exist=1|