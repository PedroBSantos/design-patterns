# factory-method

Usar quando:

- Exista uma hierarquia de classes que implementam uma mesma interface ou herdam de uma mesma classe e
queremos desacoplar quem uma classe X de quaisquer instâncias concretas, ou seja, a classe X não precisa e não quer
saber qual a classe específica de um determinado objeto, apenas se importa com a sua interface.
- Queremos instânciar um objeto concreto que pertence a uma hierarquia de classes, mas só
sabemos o tipo real desse objeto em tempo de execução a partir de alguma condição.
- Queremos encapsular a criação de objetos e deixar as subclasses decidirem qual objeto instanciar. </br>

Definição:

Define uma interface para criar um objeto, mas permite às classes decidir qual
classe instanciar. </br>
O factory method utiliza o princípio da inversão de dependencia em sua construção.

## abstract-factory

Este padrão nos ajuda a criar uma família de objetos que obedecem a uma determinada restrição. Por exemplo, os
ingredientes que vão em uma pizza de São Paulo podem ser diferentes dos ingredientes que vão em uma pizza de Aracaju. </br>
O abstract-factory é uma interface que expõe métodos para a criação de cada objeto dessa família de objetos. Cada implementação
dessa interface representa a concretização de uma restrição de instanciamento dos objetos. Exemplo, a factory para retornar os ingredientes
da pizza de São Paulo (a restrição de instanciamento aqui é a região) irá retornar ingredientes diferentes da factory de ingredientes da pizza de Aracaju,
alguns ingredientes podem ser iguais, mas certamente haverá alguma diferença. A diferença desta factory para o factory method é que o factory method lida apenas
com instâncias únicas, não se encarregando da responsabilidade de expor uma interface para criar vários objetos que estão dentro de um mesmo grupo.
Ambos podem decidir qual objeto, ou quais no caso do abstract factory, instanciar em tempo de execução. </br>

Definição:

Defini uma interface para criar uma **família** de objetos relacionados
ou dependentes. De certa forma, o abstract factory tem em sua estrutura o uso do factory method, pois a criação de cada objeto da família de objetos é feita através de um factory method.
