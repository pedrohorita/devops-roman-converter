# language: pt
#Autores: Fernanda Montanari (fmontanarisa@gmail.com) e Pedro Horita (pedro_horita@hotmail.com)

Funcionalidade: Converter numeros em algarismos romanos

  Esquema do Cenario: Converter numero base de 1 a 3999
    Dado um Converter 
    Quando informo o numero base <numero>
    Então o resultado deve ser o algarismo romano <resultado>

    Exemplos: Retorno de uma letra representando o algarismo
      | numero  | resultado |
      |    1    |     I     |
      |    5    |     V     |
      |   10    |     X     |
      |   50    |     L     |
      |   100   |     C     |
      |   500   |     D     |
      |   1000  |     M     |
  

    Exemplos: Retorno de duas letras representando o algarismo
      | numero  | resultado |
      |   15    |    XV     |
      |    6    |    VI     |
      |   60    |    LX     |
      |   150   |    CL     |
      |   505   |    DV     |
      |   1050  |    ML     |
      |   2     |    II     |
  

    Exemplos: Converter numeros menores que os bases
      | numero  | resultado |
      |    4    |     IV    |
      |    9    |     IX    |
      |   14    |    XIV    |
      |   399   |   CCCXCIX |
      |   430   |    CDXXX  |
      |   900   |      CM   |
      
      
    Exemplos: Converter numeros limites
      | numero  | resultado |
      |    1    |     I     |
      |   3999 	| MMMCMXCIX |
      
      
      
    Exemplos: Converter numeros menores que 1
      | numero |             resultado            |
      |   0    | Número base deve ser de 1 a 3999 |
      |  -50   | Número base deve ser de 1 a 3999 |
      |  -200  | Número base deve ser de 1 a 3999 |
      
      
      
    Exemplos: Converter numeros maiores que 3999
      | numero  |            resultado             |
      | 4000    | Número base deve ser de 1 a 3999 |
      | 50000   | Número base deve ser de 1 a 3999 |
      | 100000  | Número base deve ser de 1 a 3999 |
      

