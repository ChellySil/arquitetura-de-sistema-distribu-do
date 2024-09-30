Arquitetura de sistema distribuído

Este projeto consiste em dois microserviços implementados em Java Spring, onde:

- **Microserviço 1** (Cadastro) recebe requisições para cadastrar novos usuários.
- **Microserviço 2** (Notificação) processa as notificações de cadastro e envia mensagens para um tópico RabbitMQ.

## Requisitos

- Docker e Docker Compose instalados.

## Como Subir os Serviços

1. Clone o repositório.
2. Navegue até a pasta do projeto.
3. Execute o comando:

   ```bash
   docker-compose up --build
## Maven
Construir o JAR:
```mvn clean package
