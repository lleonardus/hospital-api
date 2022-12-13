# 👨‍💻Sobre o projeto
A api foi inspirada em um desafio técnico da [Oli Saúde](https://github.com/olisaude/teste-dev-backend).

Através dessa api é possível criar, listar e atualizar clientes.

## 💿Como rodar na sua máquina
**Pré requisitos**: Git, Docker + Docker-Compose (caso queira utilizar Docker) e Java 17 (caso queira utilizar o Maven)

### 💻Clone o repositório e entre na pasta do projeto

```shell
$ git clone https://github.com/lleonardus/hospital-api.git
$ cd hospital
```
### 🐳Utilizando Docker
 ```shell
$ docker-compose up
```

### ♨️Utilizando Maven

```shell
$ ./mvnw spring-boot:run
```

Após esse processo, a api vai estar rodando em **http://localhost:8080**
e o banco de dados (H2 database) pode ser acessado em **http://localhost:8080/h2-console/** 

## 🗺️Diagrama Entidade Relacionamento (Banco de dados)

![diagrama](images/diagrama.png)

## 🎯Endpoints

### 👨‍👩‍👦‍👦Clients

- **GET** `/clients`: Lista todos os clientes registrados.
- **GET** `/clients/higher-health-risk`: Lista os clientes com maior risco de saúde. O risco é medido através
da equação **(1 / (1 + eˆ-(-2.8 + sd ))) * 100**, onde **sd é a soma dos graus das doenças de um cliente**.
O número máximo de clientes que pode ser listado é 10.
- **GET** `/clients/{id}`: Retorna uma tarefa em específico.
- **POST** `/clients`: Cria um cliente.
- **PUT** `/clients/{id}`: Edita os campos nome, data de nascimento e gênero do cliente.

### Exemplo de JSON para cadastrar cliente

```json
 {
        "name": "Lisa",
        "birthday": "2022-12-31",
        "gender": "FEMALE",
        "diseases": [
            {
                "name": "Diabetes",
                "degree": 2
            }
        ]
 }
```

### Exemplo de JSON para atualizar cliente

```json
 {
        "name": "Lisandro",
        "birthday": "2000-12-31",
        "gender": "MALE"
 }
```

## 🧰Ferramentas utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Docker
- Lombok
- Model Mapper
