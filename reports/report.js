$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/br/com/advantage/features/cadastro.feature");
formatter.feature({
  "line": 2,
  "name": "Realizar cadastro com sucesso",
  "description": "Eu como cliente\nQuero me cadastrar no site Advantage online shopping\npara realizar compras",
  "id": "realizar-cadastro-com-sucesso",
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
  "name": "Realizar cadastro com sucesso",
  "description": "",
  "id": "realizar-cadastro-com-sucesso;realizar-cadastro-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@cadastro"
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
  "name": "clico em criar nova conta",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "digito username \"\u003cuserName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "digito email valido \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "digito senha \"\u003csenha\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "confirmo senha \"\u003cconfirmoSenha\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "digito nome \"\u003cnome\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "digito sobre nome \"\u003csobreNome\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "digito numero de telefone \"\u003cnumeroTel\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "seleciono pais \"\u003cpais\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "digito cidade \"\u003ccidade\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "digito endereco \"\u003cendereco\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "digito estado \"\u003cestado\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "digito codigo postal \"\u003ccodigoPostal\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "seleciono aceitar condicoes",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "clico em registrar",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "valido cadastro realizado com sucesso",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "realizar-cadastro-com-sucesso;realizar-cadastro-com-sucesso;",
  "rows": [
    {
      "cells": [
        "userName",
        "email",
        "senha",
        "confirmoSenha",
        "nome",
        "sobreNome",
        "numeroTel",
        "pais",
        "cidade",
        "endereco",
        "estado",
        "codigoPostal"
      ],
      "line": 29,
      "id": "realizar-cadastro-com-sucesso;realizar-cadastro-com-sucesso;;1"
    },
    {
      "cells": [
        "maikao",
        "maikao@test.com",
        "Maikao@2021",
        "Maikao@2021",
        "maikao",
        "da silva sauro",
        "11970707070",
        "Brazil",
        "Cajamar",
        "Jordanesia",
        "sao paulo",
        "07786725"
      ],
      "line": 30,
      "id": "realizar-cadastro-com-sucesso;realizar-cadastro-com-sucesso;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 175000,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Realizar cadastro com sucesso",
  "description": "",
  "id": "realizar-cadastro-com-sucesso;realizar-cadastro-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@cadastro"
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
  "name": "clico em criar nova conta",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "digito username \"maikao\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "digito email valido \"maikao@test.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "digito senha \"Maikao@2021\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "confirmo senha \"Maikao@2021\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "digito nome \"maikao\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "digito sobre nome \"da silva sauro\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "digito numero de telefone \"11970707070\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "seleciono pais \"Brazil\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "digito cidade \"Cajamar\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "digito endereco \"Jordanesia\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "digito estado \"sao paulo\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "digito codigo postal \"07786725\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "seleciono aceitar condicoes",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "clico em registrar",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "valido cadastro realizado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "GenericStep.navegoParaAPaginaInicalDoSiteAdvantage()"
});
formatter.result({
  "duration": 2832777300,
  "status": "passed"
});
formatter.match({
  "location": "GenericStep.seleciono_usuario()"
});
formatter.result({
  "duration": 1511536400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.clicoEmCriarNovaConta()"
});
formatter.result({
  "duration": 1592187900,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca href\u003d\"javascript:void(0)\" role\u003d\"link\" class\u003d\"create-new-account ng-scope\" translate\u003d\"CREATE_NEW_ACCOUNT\" data-ng-click\u003d\"createNewAccount()\"\u003e...\u003c/a\u003e is not clickable at point (683, 410). Other element would receive the click: \u003cdiv class\u003d\"loader\" style\u003d\"display: block; opacity: 1;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d98.0.4758.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SKAR1201274\u0027, ip: \u0027192.168.1.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_311\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.102, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\MAICOL~1.LIM\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:61861}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3eef5447ecef6028e1eefb63ba6ead01\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat br.com.advantage.utils.AcoesWeb.clicar(AcoesWeb.java:19)\r\n\tat br.com.advantage.page.cadastro.CadastroLogic.clicarCriarConta(CadastroLogic.java:15)\r\n\tat br.com.advantage.page.cadastro.CadastroStep.clicoEmCriarNovaConta(CadastroStep.java:17)\r\n\tat ✽.And clico em criar nova conta(src/test/java/br/com/advantage/features/cadastro.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "maikao",
      "offset": 17
    }
  ],
  "location": "CadastroStep.digitoUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "maikao@test.com",
      "offset": 21
    }
  ],
  "location": "CadastroStep.digitoEmailValido(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Maikao@2021",
      "offset": 14
    }
  ],
  "location": "CadastroStep.digitoSenha(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Maikao@2021",
      "offset": 16
    }
  ],
  "location": "CadastroStep.confirmoSenha(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "maikao",
      "offset": 13
    }
  ],
  "location": "CadastroStep.digitoNome(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "da silva sauro",
      "offset": 19
    }
  ],
  "location": "CadastroStep.digitoSobreNome(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "11970707070",
      "offset": 27
    }
  ],
  "location": "CadastroStep.digitoNumeroDeTelefone(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Brazil",
      "offset": 16
    }
  ],
  "location": "CadastroStep.selecionoPais(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cajamar",
      "offset": 15
    }
  ],
  "location": "CadastroStep.digitoCidade(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Jordanesia",
      "offset": 17
    }
  ],
  "location": "CadastroStep.digitoEndereco(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sao paulo",
      "offset": 15
    }
  ],
  "location": "CadastroStep.digitoEstado(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "07786725",
      "offset": 22
    }
  ],
  "location": "CadastroStep.digitoCodigoPostal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CadastroStep.selecionoAceitarCondicoes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CadastroStep.clicoEmRegistrar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GenericStep.validoCadastroRealizadoComSucesso()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 790226800,
  "status": "passed"
});
});