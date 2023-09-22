# Loja-Desing-Patterns-Estruturais

---
## Infos

:information_source: Este projeto se trata de uma continuação de outro curso que realizei. Decidi separa em dois repositórios pois são dois temas distintos e mais voltados para a parte teorica. Caso você queira ver o começo desse projeto deixarei abaixo o link:
:books:https://github.com/Rodrigo343/Loja-Desing-Patterns

:dart:Esse README tem como objetivo conter as informações que anoitei ao longo do curso, contendo meus entendimentos e oque consegui absorver de cada aula e de cada solução.

## Padrões Estruturais
---

### Problema 1

:red_circle:**Problema 1 →** Temos uma classe em nosso projeto a RegistroDeOrcamento a qual faz o registro de orçamento mas também irá chamar uma API externa. Mas o problema é implementar a chamada dessa API na mesma classe que realiza o registro de orçamento o qual não seria uma boa pratica realizar esse mistura de códigos.

:heavy_check_mark:**Solução →** Utilizado o padrão de projeto Adapter separando a implementação da chamado da API, pois podemos realizar isso de diversas formas possíveis e não queremos que essa questão impacte na implementação do registro de orçamento. Então por utilizamos padrão Adapter por meio da criação de um classe especifica para a chamada HPPT a qual podemos criar novos tipo de implementação sem impactar no registro de pedido assim só precisando instanciar o novo meio de chamado HTTP.

:information_source:**Objetivo do Adapter →** Como o próprio nome diz o padrão tem como objetivo fazer uma adaptação seja qual for, para facilitar e não permitir que o código fique limitado a só uma forma de realizar uma ação,  assim deixando o código menos acoplado.

---

### Problema 2

:red_circle:**Problema 2 →** Temos vários tipos de impostos e atualmente nosso sistema só comporta aplicar um imposto por vez, desenvolvemos uma nova classe que é a junção de dois imposto. Mas caso venha a aparecer mais impostos e mais combinações o nosso código virá a cresce infinitamente com a quantidade de combinações e se para cada uma delas precisarmos criar um classe irá ficar bem estranho essa estrutura.

:heavy_check_mark:** Solução →**  Utilizado o padrão de projeto **Decorator** decoramos um objeto com outro objeto, ou seja, fazemos uma composição de um objeto com outro objeto. No caso do nosso projeto são os impostos, compomos um objeto de imposto com outro, assim conseguimos deixar nosso código mais flexível pois só precisamos fazer essa composição entre os objetos dependendo da regra que necessitarmos

:information_source:** Objetivo do Decorator →**  Poder decorar, compor o objeto que você tem em seu código sem precisar alterar ou adaptar as características já existentes. O seu objeto original continua sendo eles mesmo apenas que com a agregação de uma nova característica/funcionalidade.
