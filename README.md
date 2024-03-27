# Funcional
- O cliente poderá fazer o cadastro dele e do animal de estimação, e essas informações será armazenadas.
- O cliente poderá ver e realizar o agendamento de serviços.
- O cliente poderá visualizar os produtos disponíveis e fazer a compras deles.
- O funcionário poderá ver a listagem de clientes cadastrados.
- O funcionário poderá visualizar os serviços agendados.
- O funcionário poderá cadastrar serviços para serem realizados.
- O funcionário poderá cadastrar os produtos que serão vendidos.
- O cliente poderá ver o serviço em andamentos.

# Não funcional
- As abas do funcionário deveram ser protegidas contra acesso não autorizado.
- O sistema deve estar disponível quando necessário
- O sistema deve ser fácil de usar e entender.
- O padrão a ser seguido das informaçõçes de cadastro do usuário.

# Regras de negocios
- Não é permitido o cadastro de outros animais além de gato e cachorro.
- É obrigatório no cadastro os dados pessoais do tutor.
- O tutor pode cadastrar quantos animais ele quiser.
- Na tela de agendamento é obrigatório o endereço do animal ou marca a tag "Animal será entregue pelo tutor".
- Não é possivel modeificar o serviço em andamento.
- Para cancelamento tem um prazo de 3 horas de antecedencia, caso contrário será gerado uma taxa de cancelamento de 30,00.
- O transporte do animal tem o valor fixo de 25,00, por solicitante e um adicional de 10% por animal.
- Não pode ser agendado mais de 3 animais para o mesmo horário.
- É obrigatório um número de emergência para caso de emergência.

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
  
