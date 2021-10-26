# 📚Estudando Java
<a href="https://github.com/tiagolopesdev/estudandoJava/tree/master/src">Link para o projeto<a/>
  <p>Projeto voltado para aprofundamento na linguagem Java. Atualizações do Java 8 e demais tecnologias voltadas ao desenvolvimento da linguagem. </p>


<h2>Seção 1: lambdas</h2> 
<h4>Status: Concluído</h4>
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

<h2>Seção 2: Stream API</h2>
<h3>Status: Concluído</h3>
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

<h2>Seção 3: Generics</h2> 
<h4>Status: A fazer</h4>
<!-- <a href="LinkAqui">Link do projeto</a> -->

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

<h2>Seção 4: Java Persistence API (JPA)</h2> 
<h4>Status: A fazer</h4>
<p>É uma especificação oficial que descreve como deve ser o comportamento dos 
frameworks de persistência Java que desejarem implementá-la. A implementação 
usada nesse projeto é o Hibernate da Red Hat.</p>
<h3>Primeiros passos</h3>
  <ul>
    <li><h4>Persistindo Objetos</h4></li>
      <p>Inserir registros no banco de dados. O código abaixo deve inserir um novo produto na 
        tabela do banco de dados.
      </p>
      <img src="https://user-images.githubusercontent.com/58925056/135734317-dae31550-fe5a-4319-966c-d06dfd78a512.png" width=700px>
      <p>O Hibernate gerou o SQL de inserção. Instanciamos um novo produto e atribuímos alguns valores, atráves do construtor.</p>
      <img src="https://user-images.githubusercontent.com/58925056/135901846-e332cc42-a93e-4ca7-8b47-58a11f6e0885.png" width=600px>
      <p>Executamos o método persist (Metodo contido dentro da classe DAO), passando as instâncias dos
        produtos como parâmetro. Isso fará com que o JPA insira o objeto no banco de dados. Em seguida, faz-se o commit da transação,
        para efetivar a inserção do produto no banco de dados.
      </p>
    <li><h4>Buscando objetos pelo identificador</h4></li>
      <p>Através do identificador (chave primária) da entidade, pode-se recuperar objetos.
        O código abaixo busca um usuário com o código igual a 2.
      </p>
      <img src="https://user-images.githubusercontent.com/58925056/138903141-23d33b3a-cfd2-40e2-bcd6-3eaf960a537f.png"
           width=600px>
      <img src="https://user-images.githubusercontent.com/58925056/135902001-e0af3fac-50f5-425f-93de-033e55d1ee74.png">
      <p>A consulta foi feita atráves do método getOneId, contido dentro da classe DAO, que contém o
        método find, de EntityManager, que usa os argumentos do tipo da entidade e também o código
        do usuario. O SQL gerado possui a cláusula where, para filtrar apenas o produto de
        código igual a 2.
</p>
</p>
    <li><h4>Listando objetos</h4></li>
      <p>Consultas simples de entidade são feitas com a linguagem JPQL(uma extensão de SQL), porém com a caracteristica 
        da orientação a objetos. Com ela não referenciamos tabelas do banco de dados, mas sim as entidades do modelo. 
        O método setFirstResult(), limita a quantidade de resgistro na consulta. Já o método setFirstResult() pula os 
        registros de acordo com a quantidade passada no parametro. Confira o código.</p>
        <img src="https://user-images.githubusercontent.com/58925056/138904698-5411367e-369f-48b9-9362-9bac1c75de7d.png"
           width=600px>
      <p>Com os registros obtidos, foi usado a stream() para filtrar o atributo getPreco() do objeto para depois somar 
        o total de getPreco(). Em seguida, com Comparator<> foi feita a comparação de preços para retornar o 
        menor preço.</p>
      <a href="https://github.com/tiagolopesdev/JPA/blob/master/src/teste/basicoProduct/getAll.java">Link da classe 
        de teste</a>
    <li><h4>Atualizando objetos</h4></li>
      <p>Os atributos de entidades podem ser manipulados diretamente ou através dos métodos da classe e todas as 
        alterações serão detectadas e persistidas automaticamente, quando o contexto de persistência for “descarregado”
        para o banco de dados.</p>
         <img src="https://user-images.githubusercontent.com/58925056/138903765-26949b00-f274-4bf1-a965-5fb9bfcef709.png"
           width=600px>
      <p>Não é preciso chamar nenhum método para a atulização no banco de dados. A alteração foi identificada automaticamente
        e refletida no banco de dados, atráves do comando SQL update</p>
         <img src="https://user-images.githubusercontent.com/58925056/138904068-8766d241-93ad-4722-b4c4-90f0702d4c93.png"
           width=600px>
    <li><h4>Excluindo objetos</h4></li>
      <p>A exclusão de objetos é feita chamando o método remove de EntityManager(método contido dentro da classe DAO), passando
        como parâmetro o objeto da entidade e a chave primaria.</p>
          <img src="https://user-images.githubusercontent.com/58925056/138904485-4dffe9c9-ee91-4afd-b5e5-5aab6b7e4ca0.png"
           width=600px>
          <img src="https://user-images.githubusercontent.com/58925056/138904285-9bf41160-2220-4e87-8f28-d237f5a84d08.png"
           width=600px>
  </ul>
<a href="LinkAqui">Link do projeto</a>

<h2>Seção 5: Spring Boot</h2> 
<h4>Status: A fazer</h4>
<a href="LinkAqui">Link do projeto</a>

<h2>Seção 6: Microservices</h2> 
<h4>Status: A fazer</h4>
<a href="LinkAqui">Link do projeto</a>



