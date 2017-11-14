# language: pt
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
@tag
Funcionalidade: Converter numeros em algorismos romanos

  @tag1
  Cenario: Converter numero base
    Dado o numero base 10 <numero>
    Quando rodar o algoritomo de conversão
    Então o resultado <resultado> com uma letra deve ser exibido

    Examples: 
      | numero  | resultado |
      |    1    |     I     |
      |    5    |     V     |
      |   10    |     X     |
      |   50    |     L     |
      |   100   |     C     |
      |   500   |     D     |
      |   1000  |     M     |
