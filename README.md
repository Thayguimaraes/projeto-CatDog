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

# História 1
- Sendo o usuário quero me cadastrar para armazenar as informações no sistema.
  ## Criteiro de aceito história 1
  >> 

# História 2 
- Usuário quer cadastrar suas informaçoes com o objetivo de armazenalas no sistema.


# História 3
- Feature: Apenas Um Exemplo
- Como um usuario do Catdog
- Eu quero acessar um formulario de cadastro
- Para que eu possa me cadastrar e obter novas informações

# Cenario: Submetendo um formulario de teste
- Given o navegador aberto
  -  And acessar o formulario de cadastro
  -  And Inserir informações de cadastro
  -  And certificar que as informações inseridas  na pagina estejam corretas  
  -  When clicar no botao de submeter formulario
  -  Then de inserir as informações
- And o navegador pode ser fechado.

