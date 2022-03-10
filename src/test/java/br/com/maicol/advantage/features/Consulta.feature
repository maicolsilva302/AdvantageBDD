@web
Feature: Realizar a consulta de produtos
  Eu como Usuario 
  Quero realizar a consulta de produtos
  Para realizar compras

 @consulta
 Scenario Outline: Realizar a consulta de produtos
  	Given Navego para a pagina inical do site Advantage	
  	And Clico em pesquisar produtos
  	When Digito o produto "<produto>"
  	Then valido a mensagem final 

		Examples: 
      | produto |
      | laptops |
      