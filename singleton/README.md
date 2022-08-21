# singleton

Definição: Permite que exista apenas uma única instância de uma classe. Existem duas maneiras de implementar:

- Utilizando o modo raiz
- Utilizando o monostate

Com o **modo raiz** a classe que terá uma única instância em toda aplicação e se encarrega de expor um método getInstance publico e estático
que é responsável por inicializar a instância da classe. Neste caso o construtor da classe deve ser privado. O objeto instanciado
é armazenado como um atributo estático da classe. Toda vez que o método getInstance for chamado, o mesmo irá verificar se o atributo
estático é nulo. Se o atributo estiver nulo uma instancia é criada e armazenada, caso contrário o objeto que já foi instânciado é retornado. Neste caso
ferimos o princípio da responsabilidade única do SOLID por a classe ser responsável por criar e gerenciar o estado global </br>

Com o **monostate** teremos duas classes. A primeira classe é responsável por armazenar o estado que irá ser disponibilizado de forma global para toda a aplicação.
Está classe é responsável por realizar a configuração deste estado e possui apenas métodos e atributos estáticos. Já a segunda classe irá disponibilizar instancias de objetos
que consomem o estado e os atributos da primeira classe. Neste caso conseguimos separar melhor as responsabilidades de criação e uso do estado em classes diferentes
(Não fere os princípios do SOLID), porém pode gerar uma certa confusão devido a segunda classe possuir vários objetos consumindo um mesmo estado.
