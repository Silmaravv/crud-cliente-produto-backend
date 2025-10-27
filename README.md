# Sistema de Gerenciamento - Ecommerce
___
![Java 21](https://img.shields.io/badge/Java-21-DC143C)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.7-green)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-3.x+-deeppink)

Esta API expõe endpoints para gerenciar clientes e produtos, servindo como backend para o painel de administração.

## Como Iniciar
___

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Silmaravv/crud-cliente-produto-backend.git
    cd crud-cliente-produto-backend
    ```

2.  **Execute o backend (Spring Boot)**

3.  **Acesse a aplicação:**
    O servidor backend estará rodando em `http://localhost:8080`

## Endpoints da API (Swagger)
___

A documentação completa da API, incluindo todos os endpoints, detalhes de requisição, resposta e entre outras informações é gerada automaticamente pelo Swagger (OpenAPI).

Após iniciar a aplicação, você pode acessar a documentação interativa no seguinte local:

* **Swagger UI:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Autenticação
___

A API está protegida com **Basic Authentication**. Você deve incluir um header `Authorization` em todas as suas requisições.

### Usuário Padrão
Utilize a credencial abaixo para ser autorizado a realizar requisiçoes:

* **Usuário:** `teste`
* **Senha:** `teste123`