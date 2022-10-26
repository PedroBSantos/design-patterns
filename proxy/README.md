# proxy remoto

objeto remoto: tem a função de se passar pelo objeto que executa a lógica da operação solicitada, mas ele apenas envia a solicitação pra quem sabe como resolve-la (objeto real)
objeto real: é o objeto possui a lógica para executar a operação solicitada, é o destino final da solicitação.
o objeto cliente se comunica com o objeto remoto achando que este sabe como executar a operação, mas não sabe que o objeto remoto apenas envia a solicitação para
o objeto que realmente sabe como resolve-la (objeto real).
o objeto remoto possui a mesma interface do objeto real.
desacoplamento: o objeto cliente não sabe quem é o verdadeiro resolvedor da solicitação, assim como o objeto remoto não sabe qual a real origem da solicitação.
