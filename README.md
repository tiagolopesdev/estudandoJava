# 📚Estudando Java
<a href="https://github.com/tiagolopesdev/estudandoJava/tree/master/src">Link para o projeto</a>
  <p>Projeto voltado para aprofundamento na linguagem Java. Atualizações do Java 8 e demais tecnologias voltadas ao desenvolvimento da linguagem. </p>

<details>
  <summary><span>Seção 1: lambdas</span></summary>
    <div>
    <br>
  
  ![AppVeyor](https://img.shields.io/badge/Status-Concluído-green)
      <p>Um conceito adicionado ao Java 8, e que tem como principal objetivo adicionar ao Java técnicas de linguagens funcionais, como LISP. Sua 
      vantagem é diminuir a quantidade de código necessária para a escrita de algumas funções</p>
      <h3>Interface Consumer</h3>
      <p>Uma operação que aceita um único argumento de entrada e não retorna nenhum resultado, operando por meio de 
        efeitos colaterais.</p>
      <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Lambdas/Consumidor.java">Código 
        aqui.</a></li>
      <h3>Interface BinaryOperator</h3>
      <p>Representa uma operação sobre dois operandos do mesmo tipo, produzindo um resultado do mesmo tipo que os 
        operandos.</p>
      <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Lambdas/OperadorBinario.java">Código 
        aqui.</a></li>
      <h3>Interface UnaryOperator</h3>
      <p>Uma operação com um único operando, produzindo um resultado do mesmo tipo de seu operando.</p>
      <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Lambdas/OperadorUnario.java">Código 
        aqui.</a></li>
      <h3>Interface Predicate</h3>
      <p>Representa um predicado (função com valor booleano) de um argumento.</p>
      <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Lambdas/PredicadoComposicao.java">Código 
        aqui.</a></li>
      <h3>Interface Function</h3>
      <p>Representa uma função que aceita um argumento e produz um resultado.</p>
      <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Lambdas/Funcao.java">Código 
        aqui.</a></li>
    </div>
</details>

<details>
  <summary><span>Seção 2: Stream API</span></summary>
  <div>
  <br>
  
  ![AppVeyor](https://img.shields.io/badge/Status-Concluído-green)
    <p>A Streams API faz a manipulação, combinada com as expressões lambda, de coleções em Java seguindo os princípios da programação funcional. 
    Possibilitando uma forma diferente de lidar com conjuntos de elementos.</p>
    <h3>Filter</h3>
    <p>Filtra os elementos de acordo com uma condição retornando uma nova stream.</p>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/streams/Filter.java">Código aqui.</a></li>
    <h3>Map</h3>
    <p>Retorna uma stream consistindo no resultado da aplicação de uma função de mapeamento nos elementos da stream.</p>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/streams/Map.java">Código aqui.</a></li>
    <h3>Diferentes usos de foreach, iterator e stream</h3>
    <p>Stream mostra-se a forma mais inchuta de código.</p>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/streams/imprimindoObjetos.java">Código aqui.</a>
    </li>
    <h3>Reduce</h3>
    <p>Realiza uma operação de redução que leva uma sequência de elementos de entrada e os combina em um único resultado, como acumular valores.</p>
    <ul>
      <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/streams/ReduceOne.java">Acumulando valores do tipo Integer</a></li>
      <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/streams/ReduceThree.java">Acumulando valores de objeto e transformando em numbers</a></li>
    </ul>
    <h3>Math</h3>
    <p>Realiza uma operação com retorno booleano. Funcões usando allMatch, anyMatch e noneMatch<</p>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/streams/Match.java">Código aqui</a></li>
  </div>
</details>

<details>
  <summary><span>Seção 3: Generics</span></summary>
  <div>
  <br>
  
  ![AppVeyor](https://img.shields.io/badge/Status-Concluído-green)
    <h3>Generics Integer</h3>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Generics/Caixa.java">Classe 
      génerica</a></li>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Generics/CaixaIntTeste.java">Teste do código</a></li> 
    <h3>Generics List</h3>
    <p>Um método generico que retorna o último elemento da lista</p>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Generics/ListUtil.java">
      Classe génerica</a></li>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Generics/ListUtilTeste.java">
      Teste do código</a></li>
    <h3>Generics Retornando um valor a partir de uma chavePar</h3>
    <p>Ao adicionar um chave e valor, é verificado se a chave adicionada já existe. Em seguida, filtra-se
      os valores passados em getValor</p>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Generics/Pares.java">
      Classe</a></li>
    <li><a href="https://github.com/tiagolopesdev/estudandoJava/blob/master/src/Generics/ParesTeste.java">
      Teste do código</a></li>
  </div>
</details>

<details>
  <summary><span>Seção 4: Java Persistence API (JPA)</span></summary>
  <div> 
  <br>

  ![AppVeyor](https://img.shields.io/badge/Status-Concluído-green)
    <p>É uma especificação oficial que descreve como deve ser o comportamento dos 
    frameworks de persistência Java que desejarem implementá-la. A implementação 
    usada nesse projeto é o Hibernate da Red Hat.</p>
    <h3>Primeiros passos</h3>
    <ul>
      <li><h4>Persistindo Objetos</h4></li>
      <p>Inserir registros no banco de dados. O código abaixo deve inserir um novo produto na tabela do banco de dados.
      <img src="https://user-images.githubusercontent.com/58925056/135734317-dae31550-fe5a-4319-966c-d06dfd78a512.png" width=700px>
      <p>O Hibernate gerou o SQL de inserção. Instanciamos um novo produto e atribuímos alguns valores, atráves do construtor.</p>
      <img src="https://user-images.githubusercontent.com/58925056/135901846-e332cc42-a93e-4ca7-8b47-58a11f6e0885.png" width=600px>
      <p>Executamos o método persist (Metodo contido dentro da classe DAO), passando as instâncias dos produtos como parâmetro. Isso fará com que o JPA insira o objeto no banco de dados. Em seguida, faz-se o commit da transação, para efetivar a inserção do produto no banco de dados.
      </p>
      <a href="https://github.com/tiagolopesdev/JPA/blob/master/src/teste/basicoUser/NovoUsuario.java">Código aqui</a>
      <li><h4>Buscando objetos pelo identificador</h4></li>
      <p>Através do identificador (chave        primária) da entidade, pode-se recuperar objetos. O código abaixo busca um usuário com o código igual a 2.
      </p>
      <img src="https://user-images.githubusercontent.com/58925056/138903141-23d33b3a-cfd2-40e2-bcd6-3eaf960a537f.png" width=600px>
      <img src="https://user-images.githubusercontent.com/58925056/135902001-e0af3fac-50f5-425f-93de-033e55d1ee74.png">
      <p>A consulta foi feita atráves do método getOneId, contido dentro da classe DAO, que contém o método find, de EntityManager, que usa os argumentos do tipo da entidade e também o código do usuario. O SQL gerado possui a cláusula where, para filtra apenas o produto de código igual a 2.</p>
      <a href="https://github.com/tiagolopesdev/JPA/blob/master/src/teste/basicoUser/ObterUsuario.java">Código aqui</a>
      <li><h4>Listando objetos</h4></li>
      <p>Consultas simples de entidade são feitas com a linguagem JPQL(uma extensão de SQL), porém com a caracteristica da orientação a objetos. Com ela não referenciamos tabelas do banco de dados, mas sim as entidades do modelo. O método setFirstResult(), limita a quantidade de resgistro na consulta. Já o método setFirstResult() pula os      registros de acordo com a quantidade passada no parametro. Confira o código.</p>
      <img src="https://user-images.githubusercontent.com/58925056/138904698-5411367e-369f-48b9-9362-9bac1c75de7d.png" width=600px>
      <p>Com os registros obtidos, foi usado a stream() para filtrar o atributo getPreco() do objeto para depois somar o total de getPreco(). Em seguida, com Comparator<> foi feita a comparação de preços para retornar o menor preço.</p>
      <a href="https://github.com/tiagolopesdev/JPA/blob/master/src/teste/basicoUser/ObterUsuarios.java">Código aqui</a>
      <li><h4>Atualizando objetos</h4></li>
      <p>Os atributos de entidades podem ser manipulados diretamente ou através dos métodos da classe e todas as       alterações serão detectadas e persistidas automaticamente, quando o contexto de persistência for “descarregado”
      para o banco de dados.</p>
      <img src="https://user-images.githubusercontent.com/58925056/138903765-26949b00-f274-4bf1-a965-5fb9bfcef709.png" width=600px>
      <p>Não é preciso chamar nenhum método para a atulização no banco de dados. A alteração foi identificada automaticamente e refletida no banco de dados, atráves do comando SQL update</p>
      <img src="https://user-images.githubusercontent.com/58925056/138904068-8766d241-93ad-4722-b4c4-90f0702d4c93.png" width=600px><br>
      <a href="https://github.com/tiagolopesdev/JPA/blob/master/src/teste/basicoUser/UpdateUserOne.java">Código aqui</a>
      <li><h4>Excluindo objetos</h4></li>
      <p>A exclusão de objetos é feita chamando o método remove de EntityManager(método contido dentro da classe DAO), passando
      como parâmetro o objeto da entidade e a chave primaria.</p>
      <img src="https://user-images.githubusercontent.com/58925056/138904485-4dffe9c9-ee91-4afd-b5e5-5aab6b7e4ca0.png" width=600px>
      <img src="https://user-images.githubusercontent.com/58925056/138904285-9bf41160-2220-4e87-8f28-d237f5a84d08.png" width=600px></img><br>
      <a href="https://github.com/tiagolopesdev/JPA/blob/master/src/teste/basicoUser/RemoveUser.java">Código aqui</a>
    </ul>
    <h3>Herança</h3>
    <ul>
      <li>Tabela única para todas as classes (single table)
</li>
      <p>Esse tipo de herança é o padrão, ou seja, não precisaríamos anotar a classe com @Inheritance. A anotação @DiscriminatorColumn foi usada para informar o nome de coluna de controle para discriminar de qual classe é o registro. As subclasses (Esportivo e popular) foram anotadas com @DiscriminatorValue para definir o valor discriminador de cada tipo. Nesse tipo de herança é gerado somente uma tabela que armazena todos as subclasses.
      </p>
      <img src="https://user-images.githubusercontent.com/58925056/142004281-19bba562-c7b1-4a11-9cb3-6abef75c694a.png"><br>
      <a href="https://github.com/tiagolopesdev/JPA/tree/master/src/modelo/heranca/single_table">Código aqui</a><br>
      <li>Uma tabela para cada classe da hierarquia (joined)
</li>
      <p>Nas classes filhas, podemos adicionar a anotação
      @PrimaryKeyJoinColumn para informar o nome da coluna que faz referência à <a href="https://github.com/tiagolopesdev/JPA/blob/master/src/modelo/heranca/joined/Funcionario.java">tabela pai</a>. Se o nome dessa coluna for igual ao nome da coluna da tabela pai, essa anotação não precisa ser utilizada. Esse tipo de mapeamento criará 3 tabelas.
      </p>
      <img src="https://user-images.githubusercontent.com/58925056/142005014-deadb71a-84a1-48cf-8423-3764036c7bde.png"><br>
      <a href="https://github.com/tiagolopesdev/JPA/tree/master/src/modelo/heranca/joined">Código aqui</a><br>
      <li>Uma tabela para cada classe concreta (table per class)</li>
      <p>Cada tabela deve possuir todas as colunas, incluindo as da
      superclasse. Como também, deve-se mudar a estratégia de geração de identificadores “increment”, que a implementação do Hibernate disponibiliza (não é padronizada pelo JPA). Não podemos usar a geração automática de chaves nativa do banco de dados.
      Também não precisamos mais da anotação @PrimaryKeyJoinColumn.
      </p>
      <img src="https://user-images.githubusercontent.com/58925056/142005245-f694affb-ac0c-4fad-98cb-d903baee5a65.png"><br>
      <a href="https://github.com/tiagolopesdev/JPA/tree/master/src/modelo/heranca/table_per_class">Código aqui</a><br>
    </ul>
    <a href="https://github.com/tiagolopesdev/JPA/tree/master/src/modelo/heranca">Todos os codigos de herança</a>
  </div>
</details>

<details>
  <summary><span>Seção 5: Spring Boot</span></summary>
  <div>
  <br>
  
  ![AppVeyor](https://img.shields.io/badge/Status-A%20fazer-red) 
  # Padrão MVC (Model, view, controller) & Spring Boot

## Visão Geral

  ### Model
  
  - Regras de negócio
  - Entidades
  - Camada de acesso à dados.
    
  ### View
    
  - Responsável por renderizar a página como resposta a requisição
  - Trabalha com:
    - Javascript
    - CSS
    - HTML
    
  ### Controller
    
  - Faz o controle entre model e view
  - É a camada que recebe a requisição

## Fluxo sem acesso à dados

  - Não há necessidade de passar pela camada ***Model*** (camada que se liga ao banco de dados).
  - Nesse cenario um **browser gera uma requisição ao web server** que passa para aplicação em questão e **acessa o controller**. Em seguida, é encaminhado a **requisição para a view**, sendo essa responsável por **encaminhar a resposta ao browser**.

## Fluxo com acesso à dados

  - Passa pela camada ***Model*.**
  - Nesse cenário o browser **enviar uma requisição,** ao qual necessita de dados do banco de dados, para à aplicação. Para isso, **o controller envia uma requisição ao model** que acessa o banco de dados e obtém o que foi solicitado na requisição e **retorna ao controller**. Em seguida, o **controller encaminha a view**, responsável por renderizar os dados, que **manda as resposta ao browser.**

## Camadas do fluxo de dados

  - Browser
  - Web server
  - Aplicação
  - Controller

## Com Spring
  
  ![Fonte: Produtividade no desenvolvimento de aplicações web com Spring Boot. AlgaWorks, ed. 3º](https://user-images.githubusercontent.com/58925056/142873292-41ecbf70-0ca4-4885-aa1d-01d6e31c0ef9.png)
    
  Fonte: Produtividade no desenvolvimento de aplicações web com Spring Boot. AlgaWorks, ed. 3º
    
  - A requisição HTTP enviada ao servidor que roda a aplicação *web*, no caso do *Spring Boot* o servidor *Tomcat*. Em seguida a requisição é passada ao *front controller (DispatcherServlet)* que a partir da URL identifica o a classe responsável por tratar essa requisição, entregando a ela os dados enviados pelo *browser*. Se houver acessa ou não aos dados todo esse processo (Realizar cálculos, validações e executar regras de negócios) é realizado pelo *Model*. O resultado das operações são entregues ao *Controller* que passa a *View* renderizando a pagina em HTML que é apresentado ao *browser*.

  # Injeção de dependência (Dependency Injection - DI)

  - Uma determinada classe precisa instanciar outra classe. Por exemplo, uma classe A instancia uma classe B.
  ### No contexto do Spring Framework

  - A Injeção de Dependência **define quais classes serão instanciadas e em quais lugares** serão injetadas **quando houver necessidade**. Assim, basta que a classe A crie um ponto de injeção da classe B, pelo construtor por exemplo, e quando houver a necessidade **o container do Spring Framework irá criar uma instância da classe** B para que a classe A possa utilizar o método b.metodoB(), como mostra na imagem abaixo.

  ![Fonte: Spring Boot Da API REST aos Microservices - Michelli Brito](https://user-images.githubusercontent.com/58925056/143074225-f8536226-b0dc-4778-b64f-fc1c7f168ba2.png)

  - A classe *ProductController* é gerenciada pelo Spring por conta da anotação *@RestController*. Dessa forma, ao ler a anotação *@Autowired* o Spring Framework injeta uma instância da interface *ProductRepository* na propriedade *productRepository*.

  ![Fonte: Autoria própria](https://user-images.githubusercontent.com/58925056/143074328-3f36f49f-7fa3-4336-8340-2e3cbd4378c7.png)  
  <a href="LinkAqui">Link do projeto</a>
  </div>
</details>

<details>
  <summary><span>Seção 6: Microservices</span></summary>
  <div>
  <br>
  
  ![AppVeyor](https://img.shields.io/badge/Status-A%20fazer-red)
    <a href="LinkAqui">Link do projeto</a>
  </div>
</details>



