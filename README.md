Arquitetura de sistema distribuído

Este projeto consiste em dois microserviços implementados em Java Spring, onde:
cadastrar novos usuários.

## Microserviço 1 (Cliente)
Função: Este microserviço recebe requisições HTTP em um endpoint (POST /pagar). Ele pode ser responsável, por exemplo, por processar pagamentos.
Comunicação: Quando recebe uma requisição de pagamento, ele encaminha os detalhes do pagamento para o Microserviço 2 através de uma requisição HTTP (POST /notificar).
## Microserviço 2 (Servidor)
Função: Este microserviço recebe as notificações de pagamento do Microserviço 1 no endpoint (POST /notificar) e é responsável por processar essas notificações, como registrar o pagamento ou fazer alguma outra ação.

## Requisitos

- Docker e Docker Compose instalados.


## Acessando os Microserviços
Microserviço 1 (Cadastro):

Endpoint: http://localhost:8080/pagar
Método: POST
Corpo da Requisição (JSON):
json
{
  "descricao": "Pagamento de teste",
  "valor": 100.00
}


Microserviço 2 (Notificações):

Endpoint: http://localhost:8081/notificar
Método: POST
Corpo da Requisição (JSON):
json

{
  "descricao": "Pagamento de teste",
  "valor": 100.00
}
 ## Acessando o RabbitMQ
acessar a interface de gerenciamento do rabbitMQ em http://localhost:15672:

Usuário: guest
Senha: guest

## Como Subir os Serviços

1. Clone o repositório.
2. Navegue até a pasta do projeto.
3. Execute o comando:

   ```bash
   docker-compose up --build
## Maven
Construir o JAR:
```bash
mvn clean package



