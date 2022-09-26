# command

Nesse padrão temos o Invocador e o Receptor. O invocador usa comandos para realizar ações no receptor, porém
o invocador não está acoplado ao receptor, na verdade ele nem sabe quem irá responder a sua solicitação.
Como o invocador não conhece mais (está desconectado) o tipo concreto do objeto que expõe o método que está invocando, o invocador pode "executar" métodos de objetos
de diferentes tipos sem precisar saber qual o método o receptor está executando. O invocador apenas precisa saber que para invocar o método no objeto receptor é necessário chamar
o método execute definido na interface command. Com isso, podemos dizer que o invocador pode ser parametrizado com diversos comandos, ele não se restringe a invocar
comandos destinados ao mesmo tipo de objeto. Assim, ao parametrizar um invocador com vários comandos podemos:

- Adiar para tempo de execução qual método no receptor o invocador irá chamar.
- Executar comandos destinados a diferentes tipos de objetos em tempo de execução.
</br>

## macrocommand

Um comando que pode executar vários outros comandos. É uma classe que implementa a interface command e possui um atributo que é uma lista de comandos. Quando
o método execute do macrocommand é chamado a lista de comandos é percorrida executando o método execute. O mesmo ocorre para o método undo.
