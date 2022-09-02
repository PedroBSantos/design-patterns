# facade

Cria uma interface de uso simplificada para um subsistema mais complexo, mas sem encapsular as classes do subsistema. As classes do subsistema permancem livres
para serem usadas diretamente. O objetivo é fazer com que o cliente de um subsistema não se acople as suas classes, sendo possível expandir o subsistema sem que o cliente
precise fazer alterações em seu código. A sua intenção é simplificar o uso de um subsistema complexo através de uma interface simplificada. Cada método da interface simplificada
será resolvido por um ou vários objetos do subsistema. Simplificar o uso de um subsistema complexo a partir de uma interface unificada.
