# Victor Araujo Paula Cavichioli

## Introdução

Olá, seja bem-vindo. Sou o Victor Cavichioli, estudante de Banco de Dados pela FATEC Prof. Jessen Vidal. 

Tenho 18 anos e trabalho com DevOps. <br/>

<img src="https://avatars.githubusercontent.com/u/79488234?v=4"/>

<h4><details>
<summary>Meus principais conhecimentos</summary>

#### Python

Python foi a primeiras linguagem que estudei, no primeiro semestre da graduação. Hoje como DevOps minhas principais atribuições são utilizando python, pela Fatec também
já fiz um projeto em Python de um assistente virtual, no meu trabalho utilizamos Python para integrar outros serviços, realizar operações de verificação no cluster e
no Banco de Dados

#### Java
Java foi a terceira linguagem de programação que aprendi, antes de trabalhar com Python eu trabalhei uma pouco na parte de Billing, e muitos dos serviços são feitos
em Java utilizando Spring Boot, juntando isso com os APIs na Fatec que foram em Java, agrego muito valor quando estamos falando em Java e principalmente REST APIs

</details></h4>

#### Projetos Integradores durante a graduação 
Durante a minha gradução, trabalhei no desenvolvimento de trabalhos chamados de "Projetos integradores". Um projeto integrador tem o objetivo de solucionar um problema do mundo real, utilizando os conhecimentos adquiridos durante a graduação.<br/>
Abaixo todos estes projetos serão descritos, detalhando o problema, solução proposta (e entregue), e os aprendizamos extraídos de cada um deles.

<h4><details>
<summary>Projeto 3: 1º Semestre de 2022</summary>

### Parceiro Acadêmico
MidAll

### Visão do Projeto

A empresa MidAll situada no Parque Tecnológico de São José dos Campos, propôs o seguinte desafio baseado na metodologia ágil Scrum. "Temos um problema para criação de promoções em um Ecommerce. Precisamos de uma solução inteligente onde, as mecânicas das promoções sejam feitas de forma flexível e de rápida atualização no sistema".

### Tecnologias adotadas na solução

### Banco de Dados: Microsoft SQL Server
Como requisitado pela Fatec, utilizamos um banco de dados relacional para armazenar o conteúdo das tabelas, como a escolha do BD era opcional optamos por utilizar
o Microsoft SQL Server

### Back-end: Java e Spring Boot
Para relização da API utilizamos a linguagem Java (Outro requisito Fatec) e o framework rest Spring Boot 

### Front-end: Angular, CSS, Bootstrap
Para construção da nos interface utilizamos o Angular, por alguns motivos, ele é um framework typescript, que é uma linguagem de progamação semelhante o Java e ao mesmo tempo tendo as caracteríticas do javascript, também utilizamos o Angular pois uma das dores do cliente era atualização simultânea de dados, o que podemos fazer facilmente com Angular utilizando o recurso two-way data binding.

### Ferramentas: IntelliJ IDEA, Visual Studio Code, GitHub e Figma

### Contribuições pessoais

- Exposição do endpoints das tabelas e camada de serviço;

<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/resources.png"/>


Fui responsável por realizar a exposição de alguns endpoins baseado no modelo básico de dados, a seguir temos um exemplo de como isso é feito:

<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/resourcesMethods.png"/> 


Como podemos ver, utilizando a camada de serviço (que é responsável pelas regras de negócio), realizamos a exposição da entidade para que seja acessada via
a uma URL na web, com o domínio que quisermos.


<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/serviceExemplo.png"/>

Aqui temos um exemplo de um dos services que trabalhei, a camada de serviço é reponsável pelas regras de negócio da aplicação, ou seja, o que define o que 
a aplicação faz, o comportamento dela, aqui temos métodos de pesquisa, de inserção, de deleção, update, totalmente personalizados para a entidade em questão
no caso a entidade "Category".


- Modelo básico de dados;

<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/domain.png"/>

Como fui responsável pelo template inicial do projeto, produzi o modelo básico de dados, que seria as classes que representam entidades


<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/domainExemplo.png"/> 

Como vemos acima, esse é um exemplo de como é feito uma entidade utilizando o spring-boot, elas necessitam da anotação @Entity para serem compreendidas como
classes que são representações de entidades/tabelas, temos também outras anotações que são colocadas nos atributos para defini-los, cada atributo da classe é
uma coluna da tabela


- Módulo de configurações da aplicação;

<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/config-module.png"/>

Também foi necessário que tivessemos um módulo responsável por realizar configurações antes da inicialização do TomCat, fiquei responsável por isso e desenvolvi algumas funções que tinham características específicas, como pro exemplo um configuration que definisse a nossa WebConfig, quais URLs poderiam estar acessando nosso backend, quais métodos seriam permitidos e assim por diante, com o intuito de não ter que repetir código em todos os endpoints que fossem implementados.


- Integração do Front-end e Backend utilizando Typescript;

<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/service-front.png"/> 

Fiz também parte da integração do serviço em Angular com o backend, através do uso dos services do angular, onde eram criados métodos que enviavam objetos para as URLs definidas no backend de acordo com as regras pre-definidas utilizando o módulo HTTP do Angular.


- Desenvolvimento de algumas telas responsivas.

<img src="https://github.com/VictorCavichioli/bertoti/blob/main/metodologia/image-meto/html.png"/> 

Por fim, participei também da criação de algumas telas utilizando HTML, Bootstrap e Angular, realizando as análises e implementando recursos do Angular de acordo com a necessidade de cada tela e de cada endpoint ao qual o frontend iria consumir.

#### Aprendizados Efetivos 

</details></h4>
