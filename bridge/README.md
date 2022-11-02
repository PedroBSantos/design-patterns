# bridge

O utiliza o principio de tentar manter o baixo acoplamento entre objetos que interagem. Cada lado da "ponte" (dois objetos que interagem) será uma interface,
com isso, cada lado pode variar a implementação sem que tenhamos um alto acoplamento entre os dois lados. Sem o uso do padrão teremos um alto acoplamento entre as classes que se interagem e
uma explosão de classes para mapear todas as interações necessárias (produto cartesiano). </br>
O padrão aplica os conceitos de abstração e implementação de uma maneira diferente. A implementação diz respeito a uma entidade complexa e rica em métodos. Por outro lado, a abstração visa
simplificar o uso da implementação mediante uma interface mais simples. A abstração não possui inteligência própria, ou seja, suas ações são delegadas para a implementação.
