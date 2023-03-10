# language: pt

  Funcionalidade: Pesquisa de Termo

    Contexto:
      Dado que estou na homepage do Blog do Agi

      Cenario: Pesquisar sem trazer resultados
        Quando eu realizo a pesquisa com o termo "Automacao"
        Entao devo ver uma tela com mensagem de nenhum resultado encontrado

      Cenario: Pesquisar trazendo resultados
        Quando eu realizo a pesquisa com o termo "Idoso"
        Entao devo ver todas as postagens que utilizaram o termo "Idoso"