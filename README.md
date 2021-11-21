# Padrões de Projeto

## Strategy

Variar a execução de um algoritmo com base em um parametro ou vários parametros.

### Antes do Strategy

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/911723174666846238/AntesStrategy.jpg" alt="Antes do Strategy">
</p>

### Depois do Strategy

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/911723207118176326/DepoisStrategy.jpg" alt="Depois do Strategy">
</p>

## Chain of Responsability

Executar uma sequencia de algoritmos quando satisfazem condições especificas. Cada algoritmo será implementado em uma classe específica que herda de uma mesma superclasse.
Cada classe possui a referência do proximo algoritmo a ser executado.

### Antes do Chain of Responsability

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/911723232598560768/AntesChainOfResponsability.jpg" alt="Antes do Chain of Responsability">
</p>

### Depois do Chain of Responsability

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/911723253221961808/DepoisChainOfResponsability.jpg" alt="Depois do Chain of Responsability">
</p>

## Template Method

Auxilia na implementação do esqueleto de um algoritmo na superclasse, mas as implementações específicas do algoritmo
ficará nas subclasses.

### Depois do Template Method

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/911723288307310692/DepoisTemplateMethod.jpg" alt="Depois do Template Method">
</p>

## State

Auxilia na implementação de vários estados que uma entidade pode assumir, semelhante a uma máquina de estados finitos (automatos finitos). Uma superclasse
representa todos os estados contento métodos concretos para auxiliar na transição dos estados existentes, mas a real implementação da transição fica de responsabilidade de cada estado em mapear pra qual estado seguinte ele pode ir. Aplicar algoritmos baseados no estado de uma classe. Semelhante ao strategy. Aplicar regras de transição de estados. Eliminar if's e elses aplicados com base no estado do objeto.

### Antes do State

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/911723306573525052/AntesState.jpg" alt="Antes do State">
</p>

### Depois do State

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/911723336059486218/DepoisSate.jpg" alt="Depois do State">
</p>

## Command Handlers

Auxilia na implementação de funcionalidades permitindo que essa implementação seja independente do mecanismo de apresentação I/O.

### Depois Command Handlers

<p align="center">
  </br>
  <img src="https://media.discordapp.net/attachments/590682723870310410/912092864551485440/Captura_de_tela_2021-11-21_183153.jpg" alt="Depois do Command Handlers">
</p>