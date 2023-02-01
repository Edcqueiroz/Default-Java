#language: pt
#encoding: utf-8
#@run
Funcionalidade: Login

  Contexto:
    Dado que acesso careers

  @run
  Cenario: Login com sucesso
    Quando clico no link "SignIn"
    E preencho email e senha válidos
    E clico no botão SignIn
    Entao valido login com sucesso

    @run
  Cenario: Login com dados inválidos
    Quando clico no link "SignIn"
    E preencho email e senha inválidos
    E clico no botão SignIn
    Entao valido mensagem de erro