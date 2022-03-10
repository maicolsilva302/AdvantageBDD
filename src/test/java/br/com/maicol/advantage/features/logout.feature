@web
Feature: Realizar logout com sucesso
  Eu como cliente
  Quero deslogar do site Advantage online shopping
  para validar meu usuario
	
	@logout
  Scenario Outline: Realizar login com sucesso
    Given Navego para a pagina inical do site Advantage
    And seleciono usuario
    And digito meu usuario "<usuario>"
    And digito minha senha "<senha>"
    And clico em logar
    When seleciono usuario para realizar logout
    Then clico em sign out

    Examples: 
      | usuario | senha  		  |
      | maikao  | Maikao@2021 |