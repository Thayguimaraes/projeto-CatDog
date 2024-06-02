# Objetivo
- Prover um software de gerenciamento de um PetShop que facilite a vida dos funcionários no comprimento da sua carga horária diária. 
O Sistema fará o gerenciamento dos serviços disponíveis para os clientes, horários e histórico de cada serviço. Além disso irá 
gerenciar venda de produtos, cadastro de clientes e seus pets.

# Público Alvo
- Funcionários dos PetShop, entre 21 e 45 anos, amantes de animais.

# Justificativa
- Facilitar o dia a dia dos funcionários para possam se concentrar nos deveres e não na burocracia da empresa e suas regras de negócio.

# Atores
- Vendedor PetShop
- Dono PetShop
- Funcionário do Banho e Tosa 

# 1 - Requisitos Funcionais
## 1.1 - O cliente poderá fazer o cadastro dele e do animal de estimação, e essas informações será armazenadas.
## 1.2 - O cliente poderá ver e realizar o agendamento de serviços.
## 1.3 - O cliente poderá visualizar os produtos disponíveis e fazer a compras deles.
## 1.4 - O funcionário poderá ver a listagem de clientes cadastrados.
## 1.5 - O funcionário poderá visualizar os serviços agendados.
## 1.6 - O funcionário poderá cadastrar serviços para serem realizados.
## 1.7 - O funcionário poderá cadastrar os produtos que serão vendidos.
## 1.8 - O cliente poderá ver o serviço em andamentos.

# 2 - Requisitos não funcionais
## 2.1 - As abas do funcionário deveram ser protegidas contra acesso não autorizado.
## 2.2 - O sistema deve estar disponível quando necessário.
## 2.3 - O sistema deve ser fácil de usar e entender.
## 2.4 - O padrão a ser seguido das informaçõçes de cadastro do usuário.

# 3 - Regras de negocios
## 3.1 - Não é permitido o cadastro de outros animais além de gato e cachorro.
## 3.2 - É obrigatório no cadastro os dados pessoais do tutor.
## 3.3 - O tutor pode cadastrar quantos animais ele quiser.
## 3.4 - Na tela de agendamento é obrigatório o endereço do animal ou marca a tag "Animal será entregue pelo tutor".
## 3.5 - Não é possivel modeificar o serviço em andamento.
## 3.6 - Para cancelamento tem um prazo de 3 horas de antecedencia, caso contrário será gerado uma taxa de cancelamento de 30,00.
## 3.7 - O transporte do animal tem o valor fixo de 25,00, por solicitante e um adicional de 10% por animal.
## 3.8 - Não pode ser agendado mais de 3 animais para o mesmo horário.
## 3.9 - É obrigatório um número de emergência para caso de emergência.


# Histórias de usuário funcionário 
## História 1 - Visualizar funcionário
>> Como tosador quero visualizar os dados do cliente para ofertar a melhor serviço de tosa para seu pet.
## Critério de aceitação 
>> Campo para consulta por nome do cliente ou nome do pet.
>> Acesso ao cadastro de todos os clientes.
>> Lista com acesso aos dados completos do cliente.
>> Não permitir agendamento de serviço sem cadastro de cliente.

## História 2 - Visualizar funcionário
- Como tosador quero ter acesso aos agendamentos para organizar as demandas.
 ## Critério de aceitação 
>> Visualizar agenda.
>> Posibilite consultas por filtro de data/hora, nome cliente ou nome pet.

## História 3 - Visualizar Funcionário
- Como tosador quero ter acesso aos produtos disponivies para ofertar ao cliente.
 ## Critério de aceitação 
>> Tela com lista de produtos e seus respectivos preços.

 ## História 4 - Visualizar funcionário
- Como tosador quero ter acesso a lista de clientes.
 ## Critério de aceitação 
>> Posibilite consultas por filtro de nome ou nome do pet.

 ## História 5 - Visualizar funcionário
- Como motorista quero a localização de busca do animal.
## Criteiro de aceitação
>> Quando ouver confirmação do serviço de busca e O funcionário receber uma mensagem monstrando a localização do cliente.

 ## História 6 - Visualizar funcionário
- Com a entrega do animal o tosador podera realizar o serviço solicitado pelo cliente.
## Criteiro de aceitação
>> Entrega e especificações de corte escolhidas pelo dono do pet no aplicativo.

 ## História 7 - Visualizar funcionário
- Depois da tosa ser realizada o tosador vai encaminhar o animal para o serviço de transpote.
## Criteiro de aceitação
>> O funcionário vai confirmar que o serviço foi realizado enviando uma notificação para o dono e para o motorista para se preparar para a entrega do animal.

 ### História 8 - Visualizar funcionário
- Depois o motorista vai buscar o animal no estabelecimento para entregalo para seu dono.
## Criteiro de aceitação
>> Localização de entrega selecionada pelo cliente .

# História de Usuario - Visão Cliente

## História #1 - Cadastro de animais e pessoal.
- Como cliente quero me cadastrar e cadastrar meu animal de estimação para agendamento de serviços.
   
## Critérios de aceitação:
>> É necessário no cadastro, os dados pessoais do tutor.
>> É obrigatório número de emergência para casos de emegência.
>> O cliente pode cadastrar quantos animais ele quiser.

 ## História #2 - Agendamento de serviços.
- Como cliente quero ver a lista de agendamentos de serviços e realizar agendamentos.

## Critérios de aceitação:
>> Na tela de agendamento é obrigatório o endereço do animal ou a marcar a tag "Animal será entregue pelo tutor".
>> Não é possivel agendar mais de 3 animais para o mesmo horário.

## História #3 - Produtos. 
-  Como cliente quero ver os produtos disponíveis para comprar.

## Critérios de aceitação:
>> É obrigatório o cliente ser cadastrado para realizar compras.
>> O cliente pode comprar quantos itens quiser se tiver estoque.

## História #4 - Serviços em andamento
-  Como cliente quero ver meus serviços agendados em andamento para ver disponibilidade de busca do pet, para pagamento se o serviços estiver concluído.

## Critérios de aceitação:
>> Não é possivel modeificar o serviço em andamento.

## História #6 - Cancelamento de serviços.
- Como cliente quero visualizar meus serviços agendados para cancelamento.

## Critérios de aceitação:
>> O cliente pode cancelar quantos serviços agendados ele quiser.
>> Para cancelamento tem um prazo de 3 horas de antecedencia, caso contrário será gerado uma taxa de cancelamento de 30,00.
  
