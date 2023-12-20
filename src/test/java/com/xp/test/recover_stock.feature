Funcionalidade: Recuperar informações sobre ação
  Verifica se as informações sobre a ação são corretamente recuperadas
  se a sigla da ação e a faixa de datas são válidas.

Cenário: Todos os dados estão corretos.
  Dado que estou na página dos indicadores de uma ação
  Quando inserir a sigla "VALE3" no campo correto
  E inserir a data inicial "01-02-2023"
  E inserir a data final "01-06-2023"
  E clico no botão submeter
  Então os indicadores de volatilidade, retorno médio e VaR devem aparecer na tela.
