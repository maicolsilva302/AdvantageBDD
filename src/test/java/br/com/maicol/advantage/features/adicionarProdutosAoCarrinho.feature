@web
Feature: Realizar login com sucesso
  Eu como cliente
  Quero logar no site Advantage online shopping
  para adicionar produtos ao carrinho
	
	@adicionarProdutos
  Scenario Outline: Realizar login com sucesso
    Given Navego para a pagina inical do site Advantage
    And seleciono usuario
    And digito meu usuario "<usuario>"
    And digito minha senha "<senha>"
    When clico em logar
    And clico no produto "<produto>"
    And clico na primeira opcao da lista
    And clico em adicionar item ao carrinho
    When clico em meu carrinho
    Then valido cadastro realizado com sucesso

    Examples: 
      | usuario | senha  		  | produto |
      | maikao  | Maikao@2021 | TABLETS |