Feature: This is to log in the user
@smoke
Scenario Outline: registration process
Given the browser is launched
When the user "<user name>"
And he enters his first "<first name>" 
And he enters his last"<last name>"
And he enters his pass"<password>"
And he enters his confirmpass"<confirm password>"
And he enters his gend"<gender>"
And he enters his email"<email>"
And he enters his cont"<contact num>"
And he enters his dob"<dob>"
And he enters his add"<address>"
And he enters his sec"<security question>"
And he enters his ans"<answer>"
Then he clicks on register button
Then the User is successfully registered
Examples:
|user name|first name|last name|password|confirm password|gender|email|contact num|dob|address|security question|answer|
|ritheshhhuu|rike|salu|123rike|123rike|male|rikesalu@gmail.com|9677342867|21/08/1997|1,main st,chennai|1|red|
 
 @sanity
 Scenario Outline: Successful Login
 Given Login page is displayed
 When i enter the "<User name>"
 And i enter the user"<Password>"
 Then clicks on the Login button 
 Then user successfully logged in
 Examples:
 |User name|Password|
 |Lalitha|Password123| 

 @rik
 Scenario:
 Given the user finds the product
 
 
 
 