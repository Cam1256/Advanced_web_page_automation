@stories
Feature: Academy Choucair
  As a user, i want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair

    | strName           | strlastName       |     strEmail             |  strCity    |   strZipcode  |   strPassword   |   strConfirm_password     |
    | Cristian Camilo   | Cuevas Castañeda  | cristianca84@romail.com  |  Tunja      |   150001      |   Casa1234$%&   |    Casa1234$%&            |


    When he search for course Recursos Automatizacion Bancolombia on the choucair academy platform
    Then he finds the course called resources Recursos Automatizacion Bancolombia
