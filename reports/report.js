$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/br/com/maicol/advantage/features/AdicionarProdutosAoCarrinho.feature");
formatter.feature({
  "line": 2,
  "name": "Realizar login com sucesso",
  "description": "Eu como cliente\nQuero logar no site Advantage online shopping\npara adicionar produtos ao carrinho",
  "id": "realizar-login-com-sucesso",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Realizar login com sucesso",
  "description": "",
  "id": "realizar-login-com-sucesso;realizar-login-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@adicionarProdutos"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Navego para a pagina inical do site Advantage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "seleciono usuario",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "digito meu usuario \"\u003cusuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "digito minha senha \"\u003csenha\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clico em logar",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "clico no produto \"\u003cproduto\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "clico na primeira opcao da lista",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "clico em adicionar item ao carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "clico em meu carrinho",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "valido cadastro realizado com sucesso",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "realizar-login-com-sucesso;realizar-login-com-sucesso;",
  "rows": [
    {
      "cells": [
        "usuario",
        "senha",
        "produto"
      ],
      "line": 21,
      "id": "realizar-login-com-sucesso;realizar-login-com-sucesso;;1"
    },
    {
      "cells": [
        "maikao",
        "Maikao@2021",
        "TABLETS"
      ],
      "line": 22,
      "id": "realizar-login-com-sucesso;realizar-login-com-sucesso;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 253600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Realizar login com sucesso",
  "description": "",
  "id": "realizar-login-com-sucesso;realizar-login-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@adicionarProdutos"
    },
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Navego para a pagina inical do site Advantage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "seleciono usuario",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "digito meu usuario \"maikao\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "digito minha senha \"Maikao@2021\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clico em logar",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "clico no produto \"TABLETS\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "clico na primeira opcao da lista",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "clico em adicionar item ao carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "clico em meu carrinho",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "valido cadastro realizado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "GenericStep.navego_para_pagina_inical_do_site_advantage()"
});
formatter.result({
  "duration": 4535225000,
  "status": "passed"
});
formatter.match({
  "location": "GenericStep.seleciono_usuario()"
});
formatter.result({
  "duration": 1470442400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maikao",
      "offset": 20
    }
  ],
  "location": "LoginStep.digito_meu_usuario(String)"
});
formatter.result({
  "duration": 1496386200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maikao@2021",
      "offset": 20
    }
  ],
  "location": "LoginStep.digito_minha_senha(String)"
});
formatter.result({
  "duration": 963698700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clico_em_logar()"
});
formatter.result({
  "duration": 140316900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TABLETS",
      "offset": 18
    }
  ],
  "location": "AdicionarProdutosSteps.clico_no_produto(String)"
});
formatter.result({
  "duration": 1023547100,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutosSteps.clico_na_primeira_opcao_da_lista()"
});
formatter.result({
  "duration": 206823600,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutosSteps.clico_em_adicionar_item_ao_carrinho()"
});
formatter.result({
  "duration": 3179163500,
  "status": "passed"
});
formatter.match({
  "location": "AdicionarProdutosSteps.clico_em_meu_carrinho()"
});
formatter.result({
  "duration": 5186222000,
  "status": "passed"
});
formatter.match({
  "location": "GenericStep.valido_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 40229054300,
  "status": "passed"
});
formatter.after({
  "duration": 881973000,
  "status": "passed"
});
});