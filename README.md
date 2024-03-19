# Trabalho acadêmico, Engenharia da computação (Instituto Infnet - 3 semestre)
## Teste de Performance 3 - Desenvolvimento de Serviços Web e Testes com Java

### O que é?
O projeto trata-se de uma API Rest em um contexto de compra de passagens de avião entre cliente e vendedor, A APi realizar requisições como Get, Post, Delete e Put.
Os dados retornados por ela estaram no formato JSON

### API Documentação
O projeto possui 4 pacotes importantes para API
- Models - Camada onde fica as entidades e onde são feitos os relacionamentos e definição do tipo de dado para o banco
- Repository - Camada onde fica os responsáveis por acessar e modificar os dados
- Services - Camada onde fica as funções que serão utilizadas para realizar as solitações HTTP
- Controller - Camada responsável por definir os endpoint que serão usados para realizar uma solicitação Http ou chama uma View (Página html)

O endpoint base (onde a aplicação será executada) é por padrão: http://localhost:8080  
Onde tem um {id} o endpoint exige que informe um número inteiro do dados que deseja usar

- Criar um cadastro: http://localhost:8080/api/create (Post, exige um objeto do cliente)
- Devolver todos os casdastro: http://localhost:8080/api (GET)
- Devolver um cadastro específico: http://localhost:8080/api/{id} (GET)
- Apagar um cadastro específico: http://localhost:8080/api/delete/{id} (DELETE)
- Atualizar passagem de um cadastro específico: http://localhost:8080/api/update/{id} (PUT)

### Ferramenta utizadas 

- Itellij (IDE) 
- Jdk 17   (java development kit)
- Maven (ferramenta de testes)
- Spring Boot

### dependencies
- Web app
- thymeleaf
- Banco h2
- JPA

### Regras 

Cliente 

- Um cliente só pode realizar a compra de uma passagem caso esteja cadastrado no sistema.
- Um cliente só pode estar associado a um único voo
- O Cliente pode cancelar sua passagem ou trocar por outra

Banco de dados
- Os dados serão são salvos no banco h2 (um banco semelhante ao banco de dados como sqLite, mas os dados não ficaram salvos quando a aplicação parar)

- Clientes tem os campos, 
id (número identificador), 
nome (nome do cliente), 
Cpf  (cpf do cliente, apenas 14 dígitos) 
idPassagem (número que se relaciona com a tabela passagens, caso o número seja 0 o cliente não tem passagens compradas)

- Passagens tem os campos
Id (Número identificador)
LclPartida (Local de Partida)
LclChegada (Local de Chegada)
Duracao (Duração da viagem)
Preco (Preço da passagem em real)
