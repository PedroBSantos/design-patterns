# command

A chamada ao método é encapsulada em um objeto
contendo todos os dados necessários para que seja gerado algum resultado. Faz com que o invocador não precise saber qual método do receptor chamar
para executar uma operação. Esta ação está encapsulada dentro do comando que sabe qual método do receptor invocar. Os atributos deste objeto são os parametros que serão passados para o método a ser chamado no receptor. Com isso o método execute da interface
Command não precisa receber os parametros que serão passados para o método do receptor. A vantagem deste padrão está na capacidade de desconectar o invocador de um método do seu receptor.
Também é possível ter um comportamento mais lazy em relação a execução do método, pois podemos escolher quando o comando será executado e, em alguns casos, desfazer o que foi feito. Nesse padrão temos o Invocador e o Receptor. O invocador usa comandos para realizar ações no receptor, porém
o invocador não está acoplado ao receptor, na verdade ele nem sabe quem irá responder a sua solicitação.</br>

## macrocommand

Um comando que pode executar vários outros comandos. É uma classe que implementa a interface command e possui um atributo que é uma lista de comandos. Quando
o método execute do macrocommand é chamado a lista de comandos é percorrida executando o método execute. O mesmo ocorre para o método undo.
