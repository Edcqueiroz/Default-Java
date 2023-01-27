#language: pt
#encoding: utf-8
#@run
Funcionalidade: Login

  Contexto:
    Dado que acesso o login do careers

  @run
  Cenario: Login com sucesso
    Quando clico no link "SignIn"
    E preencho email e senha
    E clico no botão SignIn
    Então valido login com sucesso

  Cenario: Login com dados inválidos
    Quando clico no link "SignIn"
    E preencho email e senha inválidos
    E clico no botão SignIn
    Então valido mensagem de erro