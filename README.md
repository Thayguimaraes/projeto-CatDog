# Objetivo
- Prover um software de gerenciamento de um PetShop que facilite a vida dos funcionários no comprimento da sua carga horária diária. 
O Sistema fará o gerenciamento dos serviços disponíveis para os clientes, horários e histórico de cada serviço. Além disso irá 
gerenciar venda de produtos, cadastro de clientes e seus pets.

# Público Alvo
- Funcionários dos PetShop, entre 21 e 45 anos, amantes de animais.

# Justificativa
- Facilitar o dia a dia dos funcionários para possam se concentrar nos deveres e não na burocracia da empresa e suas regras de negócio.

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
- É obrigatório um número de emergência.





# Histórias de usuário tosador
## História 1 - Visualizar tosador
- Como tosador quero visualizar os dados do cliente para ofertar a melhor serviço de tosa para seu pet.
### Critério de aceitação 
 - Campo para consulta por nome do cliente ou nome do pet.
 - Acesso ao cadastro de todos os clientes.
 - Lista com acesso aos dados completos do cliente.
 - Não permitir agendamento de serviço sem cadastro de cliente.

## História 2 - Visualizar tosador
- Como tosador quero ter acesso aos agendamentos para organizar as demandas.
 ### Critério de aceitação 
 - Visualizar agenda.
 - Posibilite consultas por filtro de data/hora, nome cliente ou nome pet.

## História 3 - Visualizar tosador
- Como tosador quero ter acesso aos produtos disponivies para ofertar ao cliente.
 ### Critério de aceitação 
  - Tela com lista de produtos e seus respectivos preços.

 ## História 4 - Visualizar tosador
- Como tosador quero ter acesso a lista de clientes.
 ### Critério de aceitação 
- Posibilite consultas por filtro de nome ou nome do pet.


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


 ## História 5 - Visualizar tosador
- Como tosador quero visualizar os seviços agendados.
 ### Critério de aceitação 
 - Posibilite consultas de horarios disponiveis e permita indisponibilizar horário.

