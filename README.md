# Desenvolvimento Para Servidores - FATEC de São Roque
- Aluno: Bruno Henrique Rosa da Silva

# Sistema de Autenticação de Usuários (CRUD Swing + JDBC)

Sistema desktop desenvolvido em Java utilizando Java Swing para a interface gráfica e JDBC para persistência de dados em banco de dados MySQL. A aplicação contempla operações completas de cadastro, autenticação (login), alteração de dados e exclusão de contas com criptografia de senha via MD5 no próprio banco de dados.

> **Nota:** Este projeto foi desenvolvido originalmente utilizando o **IntelliJ IDEA**, mas pode ser importado e executado em qualquer IDE Java (como Eclipse, NetBeans, VS Code, entre outras).

---

## Tecnologias e Ferramentas

* **Linguagem:** Java (JDK 8 ou superior)
* **Interface Gráfica:** Java Swing
* **Banco de Dados:** MySQL
* **Driver JDBC:** MySQL Connector/J (`com.mysql.cj.jdbc.Driver`)
* **IDE de Desenvolvimento:** IntelliJ IDEA

---

## Pré-requisitos

Para rodar este projeto em sua máquina, certifique-se de possuir:

1. **JDK** (Java Development Kit) instalado e configurado.
2. Servidor **MySQL** em execução na porta `3306`.
3. Uma IDE Java de sua preferência (IntelliJ IDEA, Eclipse, NetBeans, VS Code, etc.).
4. O arquivo `.jar` do driver **MySQL Connector/J** adicionado ao classpath/bibliotecas do projeto.

---

## Configuração do Banco de Dados

1. Certifique-se de que o serviço do MySQL esteja rodando localmente.
2. Execute o script SQL a seguir (ou importe o arquivo `QueryInicial.sql` contido no projeto) para criar a base de dados e a tabela:

```sql
CREATE DATABASE bd_Login;

USE bd_Login;

CREATE TABLE Usuario (
    usuario VARCHAR(10) PRIMARY KEY,
    nome VARCHAR(30) DEFAULT '',
    senha CHAR(32) DEFAULT ''
);
```

> **Atenção quanto às credenciais:**
> A conexão (`Conexao.java`) está configurada para conectar com os seguintes parâmetros:
> * **URL:** `jdbc:mysql://localhost:3306/bd_Login`
> * **Usuário:** `root`
> * **Senha:** `123456`
> 
> Caso as credenciais do seu ambiente MySQL local sejam diferentes, atualize as constantes `usuario` e `senha` na classe `Login.Conexao`.

---

## Funcionalidades da Aplicação

* **Tela de Login:** Autenticação por usuário e senha com validação no banco de dados.
* **Cadastro:** Permite o registro de novos usuários validando duplicidade de logins e confirmação de senha.
* **Alteração de Dados:** Permite atualizar o nome e a senha do usuário logado mediante confirmação da senha atual.
* **Exclusão:** Permite a remoção da conta do usuário logado na base de dados.
