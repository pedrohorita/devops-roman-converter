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
  Esquema do Cenario: Converter numero base
    Dado um Converter 
    Quando informo o numero base <numero>
    Então o resultado deve ser uma unica letra, <resultado>

    Exemplos: 
      | numero  | resultado |
      |    1    |     I     |
      |    5    |     V     |
      |   10    |     X     |
      |   50    |     L     |
      |   100   |     C     |
      |   500   |     D     |
      |   1000  |     M     |
  
  @tag2
  Esquema do Cenario: Converter numero que resulte em dois algorismos
    Dado um Converter 
    Quando informo o numero <numero>
    Então o resultado deve ser com duas letras, <resultado>

    Exemplos: 
      | numero  | resultado |
      |   15    |    XV     |
      |    6    |    VI     |
      |   60    |    LX     |
      |   150   |    CL     |
      |   505   |    DV     |
      |   1050  |    ML     |
      |   2     |    II     |
  
  @tag3
  Esquema do Cenario: Converter numeros menores que os bases
    Dado um Converter 
    Quando informo o numero <numero>
    Então o resultado deve ser correto, <resultado>

    Exemplos: 
      | numero  | resultado |
      |    4    |     IV    |
      |    9    |     IX    |
      |   14    |    XIV    |
      |   399   |   CCCXCIX |
      |   430   |    CDXXX  |
      |   900   |      CM   |
      

