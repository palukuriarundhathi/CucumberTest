
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login into GDM UI Application
   Given Open Browser and enter Url
   When I enter UserName and Password 
   And click on Login button
   Then Application should navigate to HomePage
   
   #Scenario Outline: Login into GDM UI Application1
   #Given Open Browser and enter Url
   #When I enter <UserName> and <Password>
   #And click on Login button
   #Then Application should navigate to HomePage
   #Then Application should navigate to HomePage
   #
   #Examples:
   #
   #|UserName||Password|
   #|Ramesh  ||Password|