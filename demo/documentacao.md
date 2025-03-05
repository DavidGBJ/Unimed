<h1>Documentação da prova prática nível júnior</h1>
<h2>Repositório do projeto:</h2>
https://github.com/DavidGBJ/Unimed

<h2>Tecnologias usadas:</h2>
- Java 11
- Postrgers
- Angular
- Postman
- NVM
- GitHub
- PgAdmin

<h2>Para usar os arquivos é necessário:</h2>
-Baixar o Java 11, instalar e aplicar o SDK
-Instalar o Angular 17
-Baixar o Postman para realizar testes com o backend
-Baixar o PgAdmin
-Baixar os arquivos do projeto

<h2>Metodos usados</h2>

Para a estruturação do projeto foi usado o método MVC (Model-View-Controller)
Também foi aplicado métodos como encapsulamento 

<h2>Query usada para criar a tabela de tarefa</h2>
CREATE TABLE TAREFAS(
TAREFAS_PK INT PRIMARY KEY NOT NULL,
TITULO VARCHAR (100),
STATUS VARCHAR (50)
)