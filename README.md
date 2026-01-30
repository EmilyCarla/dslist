# DSList

O **DSList** é um sistema de gerenciamento de catálogos de jogos que permite a organização de coleções e a consulta de informações detalhadas sobre cada título. Este projeto foi desenvolvido durante o "Intensivão Java Spring" da DevSuperior.

## Tecnologias Utilizadas

* **Java**: Versão 21.
* **Spring Boot**: Versão 3.4.5.
* **Spring Data JPA**: Utilizado para o mapeamento objeto-relacional e persistência.
* **Bancos de Dados**: H2 para o ambiente de testes e suporte para PostgreSQL em produção.
* **Maven**: Automação de builds e gerenciamento de dependências.

## Funcionalidades

* **Consulta de Jogos**: Listagem completa de jogos e busca detalhada por ID, incluindo informações como título, ano, gênero, plataforma, score e descrição.
* **Gerenciamento de Listas**: Organização dos títulos em listas temáticas, como "Aventura e RPG" ou "Jogos de plataforma".
* **Reordenação de Itens**: Capacidade de mover a posição de um jogo dentro de uma lista específica, atualizando a ordem de exibição no banco de dados.
* **Configuração de CORS**: Acesso configurado para permitir integrações com front-ends em diferentes origens.

## Estrutura da API

### Jogos (`/games`)
* `GET /games`: Retorna uma lista simplificada de todos os jogos cadastrados.
* `GET /games/{id}`: Retorna os dados detalhados de um jogo específico.

### Listas (`/lists`)
* `GET /lists`: Retorna todas as listas de jogos disponíveis.
* `GET /lists/{listId}/games`: Retorna os jogos pertencentes a uma lista específica.
* `POST /lists/{listId}/replacement`: Permite alterar a ordem de um jogo na lista através dos índices de origem e destino.

## Modelo de Dados

O sistema utiliza as seguintes entidades principais:
* **Game**: Representa as características técnicas e descritivas do jogo.
* **GameList**: Define as coleções de jogos.
* **Belonging**: Entidade associativa que conecta jogos a listas e armazena o atributo de posição para a ordenação.

## Como Executar

1.  Certifique-se de ter o **Java 21** instalado.
2.  Clone este repositório.
3.  Execute o projeto utilizando o Maven Wrapper:
    * **Linux/macOS**: `./mvnw spring-boot:run`.
    * **Windows**: `mvnw.cmd spring-boot:run`.
4.  Por padrão, o projeto utiliza o perfil `test` com banco de dados H2 em memória. Os dados iniciais são carregados automaticamente pelo arquivo `import.sql`.
