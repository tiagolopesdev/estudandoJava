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
<h3>Persistindo Objetos</h3>
<h3>Buscando objetos pelo identificador</h3>
<h3>Listando objetos</h3>
<h3>Atualizando objetos</h3>
<h3>Excluindo objetos</h3>
<a href="LinkAqui">Link do projeto</a>

<h2>Seção 5: Spring Boot</h2> 
<h4>Status: A fazer</h4>
<a href="LinkAqui">Link do projeto</a>

<h2>Seção 6: Microservices</h2> 
<h4>Status: A fazer</h4>
<a href="LinkAqui">Link do projeto</a>



