# template-method

Tem como intenção criar o esqueleto de um algoritmo em uma superclasse permitindo que as suas subclasses implementem etapas específicas
do algoritmo. Etapas que são comuns ao algoritmo são definidas na superclasse. As etapas que são específicas ficam definidas em subclasses. As etapas
específicas do algoritmo são definidas como métodos abstratos na superclasse (operações primitivas). Já as etapas padrão ficam definidas na superclasse (operações concretas).
Além disso temos o conceito de "hook" que é um método definido na superclasse e que não possui nenhum comportamento, ficando a cargo das subclasses implementarem ou não o método
para realizar operações adicionais ao algoritmo encapsulado.
