# command

A chamada ao método é encapsulada em um objeto
contendo todos os dados necessários para que seja gerado algum resultado. Faz com que o invocador não precise saber qual método do receptor chamar
para executar o comando. Esta ação está encapsulada dentro do comando que sabe qual método do receptor chamar. O objeto Command representa a parametrização
a chamada de um método. Os atributos deste objeto são os parametros que serão passados para o receptor que também é um atributo. Com isso o método execute da interface
Command não precisa receber os parametros que serão passados para o método do receptor, pois o objeto command representa a parametrização a chamada do método. A vantagem
deste padrão está na capacidade do mesmo de desacoplar o cliente de um método do objeto que irá executar esse método. Também é possível ter um comportamento mais lazy em
relação a execução do método, pois podemos escolher quando executar o comando será executado e, em alguns casos, desfazer o que foi feito. Usar quando for necessário desconectar
o objeto que realiza chamada de um método para um determinado objeto. Nesse padrão temos o Invocador e o Receptor. O invocador usa comandos para realizar ações no receptor, porém
o invocador não está acoplado ao receptor, na verdade ele nem sabe quem irá responder a sua solicitação.</br>

## macrocommand

Um comando que pode executar vários outros comandos. É uma classe que implementa a interface command e possui um atributo que é uma lista de comandos. Quando
o método execute do macrocommand é chamado a lista de comandos é percorrida executando o método execute. O mesmo ocorre para o método undo.
