#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Pay Employees
  I want to be able to pay the various different type of employees in my company

  Scenario: Payroll Loads
    Given I visit the payroll web site
    Then The Page title should be "Agile Payroll Home"

  Scenario: Calculate Pay for a salaried employee
    Given An employee named "Joe Blogs"
    And is paid £12,000 per annum
    And has an annual Tax credit of £1,200
    When their pay is calculated
    Then their net pay is £900.00
