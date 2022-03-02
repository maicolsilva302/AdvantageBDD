@web
Feature: Realizar cadastro com sucesso
  Eu como cliente
  Quero me cadastrar no site Advantage online shopping
  para realizar compras
  
@cadastro
  Scenario Outline: Realizar cadastro com sucesso
    Given Navego para a pagina inical do site Advantage
    And seleciono usuario
    And clico em criar nova conta
    And digito username "<userName>"
    And digito email valido "<email>"
    And digito senha "<senha>"
    And confirmo senha "<confirmoSenha>"
    And digito nome "<nome>"
    And digito sobre nome "<sobreNome>"
    And digito numero de telefone "<numeroTel>"
    And seleciono pais "<pais>"
    And digito cidade "<cidade>"
    And digito endereco "<endereco>"
    And digito estado "<estado>"
    And digito codigo postal "<codigoPostal>"
    And seleciono aceitar condicoes
    When clico em registrar
    Then valido cadastro realizado com sucesso

    Examples: 
      | userName | email           | senha       | confirmoSenha | nome   | sobreNome      | numeroTel   | pais   | cidade  | endereco   | estado    | codigoPostal |
      | maikao   | maikao@test.com | Maikao@2021 | Maikao@2021   | maikao | da silva sauro | 11970707070 | Brazil | Cajamar | Jordanesia | sao paulo |     07786725 |
