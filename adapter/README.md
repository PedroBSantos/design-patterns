# adapter

Tem como objetivo fazer com que duas interfaces (alvo e adaptada) incompatíveis trabalhem juntas, através de um objeto central que recebe solicitações a métodos da interface alvo e as mapeia mapa métodos da interface adaptada. A classe do objeto central implementa a interface alvo e armazena uma instancia da interface adaptada.
Existem dois tipos de implementação: adaptadores de objetos e adaptadores de classes.
Ambos os tipos possuem o mesmo objetivo, mas o alcança utilizando técnicas diferentes. Adaptadores de objetos fazem uso da composição. Por outro lado, adaptadores de classes
utilizam herança múltipla, algo que é bastante incomum nas linguagens atuais. </br>
No padrão arquitetural Clean Architecture temos a camada de **Interface Adapters** onde o padrão adapter é utilizado para fazer com que as interfaces de regra de negócio e
de frameworks possam trabalhar juntas sem que seja necessário corromper o código do domínio da aplicação para seguir os padrões impostos pelo framework ou alguma biblioteca.
