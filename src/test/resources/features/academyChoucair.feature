@stories
Feature: Register at utest platform
  As a student I want to try testing real models with the learned knowledges
  @scenario1
  Scenario: Register at the utest page
    Given than Cristian wants to register at the utest page

    When he introduces the data in platform register form

      | strName           | strlastName       |     strEmail             |  strCity    |   strZipcode  |   strPassword   |   strConfirm_password     |
      | Cristian Camilo   | Cuevas Castañeda  | cristianca84@remail.com  |  Tunja      |   150001      |   Casa1234$%&   |    Casa1234$%&            |

    Then he got registtered on the utest platform
