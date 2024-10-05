# Desafio Target Sistemas


1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

    [Resposta da questão 1](https://github.com/Marcelo-Augustovs/estagio-target-sistemas/tree/main/src/exercicio1) 

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

     [Resposta da questão 2](https://github.com/Marcelo-Augustovs/estagio-target-sistemas/blob/main/src/exercicio2/main.java) 

3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto

    K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

    Ao final do processamento, qual será o valor da variável SOMA? 

    [Resposta da questão 3](https://github.com/Marcelo-Augustovs/estagio-target-sistemas/blob/main/src/exercicio3/main.java) = 77

4) Descubra a lógica e complete o próximo elemento:


    a) 1, 3, 5, 7, <strong><code>9</code></strong>

    b) 2, 4, 8, 16, 32, 64,  <strong><code>128</code></strong>

    c) 0, 1, 4, 9, 16, 25, 36, <strong><code>49</code></strong>

    d) 4, 16, 36, 64, <strong><code>100</code></strong>

    e) 1, 1, 2, 3, 5, 8,<strong><code>13</code></strong>

    f) 2,10, 12, 16, 17, 18, 19, <strong><code>200</code></strong>


5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

```
*São 3 salas que possuem uma lâmapada em cada e só posso fazer 2 idas:
Na primeira ida:

- Ligo o interruptor  1 por 7 minutos e o desligo, ligo o interruptor 2 e vou até uma das 3 salas
- Se a lampada estiver acessa, pertence ao interruptor 2, se estiver desligada e quente pertence ao interruptor 1, se estiver desligada e fria pertence ao interruptor 3.

Na segunda ida:
- Sabendo já a qual pertence um interruptor, apenas deixo um ligado e outro desligado entre o restantes
- Vou até outra sala e descubro os outros dois.

*Se a condição for eu so poder entra ate 2 vezes em apenas 1 sala entao:
Na primeira ida:
- ligo os 2 primeiros interruptores verifico as salas, encontrarei 1 sala apagada e 2 salas acessas.
- retorno a salas dos interruptores sabendo qual é o da sala que não acendeu a luz e apago o 1 interruptor que ligei

Na segunda ida:
- volto para uma das salas acessas inicialmente, se ela estiver acessa o 1 interruptor corresponde a outra sala acessa e o da verificada o 2,
- caso esteja apagado desligei o dessa sala e sei qual é o da outra que acendeu.
- Descobrindo assim qual interruptor corresponde a cada sala

```
