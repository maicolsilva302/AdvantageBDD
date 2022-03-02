@web
Feature: Realizar login com sucesso
  Eu como cliente
  Quero logar no site Advantage online shopping
  para realizar compras
	
	@login
  Scenario Outline: Realizar login com sucesso
    Given Navego para a pagina inical do site Advantage
    And seleciono usuario
    And digito meu usuario "<usuario>"
    And digito minha senha "<senha>"
    When clico em logar
    Then valido cadastro realizado com sucesso

    Examples: 
      | usuario | senha   |
      | maikao  | Maikao@2021 |