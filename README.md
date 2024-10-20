# user-api

Este projeto é uma API desenvolvida em Java com Spring Boot, destinada à gestão de usuários. O objetivo é facilitar a criação, leitura, atualização e exclusão (CRUD) de usuários.

## Tecnologias Utilizadas

- **Java**: Versão 17
- **Spring Boot**: Versão 3.x (substitua pela versão específica que você está utilizando)
- **PostgreSQL**: Versão 17
- **Flyway**: Versão 10.20.0

## Dependências do Projeto

O projeto utiliza as seguintes dependências principais:

- **Spring Web**: Para construir aplicações web.
- **Spring Data JPA**: Para interação com o banco de dados usando JPA.
- **PostgreSQL Driver**: Para conectar a aplicação ao banco de dados PostgreSQL.
- **Flyway**: Para gerenciar migrações de banco de dados.

## Configuração do Banco de Dados

O banco de dados utilizado é o PostgreSQL. A configuração pode ser realizada no arquivo `application.properties`:

```properties
spring.application.name=app
#Configuracoes da porta
server.port=8081
# Configurações PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/dev
spring.datasource.username=postgres
spring.datasource.password=<usa password da base de dados>
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.default_schema="user"
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl


#Configuracoes flywaydb
spring.flyway.enabled=false
spring.flyway.url=jdbc:postgresql://localhost:5432/dev
spring.flyway.user=postgres
spring.flyway.password=<usa password da base de dados>
spring.flyway.schemas="user"

# Configurações do HikariCP
spring.datasource.hikari.minimum-idle=5           
spring.datasource.hikari.maximum-pool-size=20      
spring.datasource.hikari.connection-timeout=60000  
spring.datasource.hikari.idle-timeout=600000       
spring.datasource.hikari.max-lifetime=1800000  
