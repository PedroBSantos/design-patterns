# state

Tem como objetivo alterar o comportamento do objeto quando o seu estado interno é alterado. Faz o uso do conceito de máquina de estados finita, onde cada estado
representa uma forma diferente de comportamento do objeto. A mudança de estados (transição de estado) é feita com base na mudança no estado interno do objeto mediante a execução de seus
métodos. Faz o uso da composição e delegação, ou seja, o objeto delega a execução de um método para o objeto que representa o seu estado atual. O cliente não determina o estado inicial do contexto (máquina de estados). O contexto é quem defini o seu estado inicial, diferente do padrão strategy onde o cliente é quem defini qual a estratégia o objeto contexto irá utilizar.
