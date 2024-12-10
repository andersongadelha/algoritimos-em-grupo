# Algoritimos em grupo

Esse projeto implementa três algoritimos( Bubble Sort, Merge Sort, Insertion Sort ).

## Indice 
1. [GitFlow](#gitflow)
2. [Commits](#commits)
3. [Documentação com Javadoc](#documentação-com-javadoc)
4. [Algoritimos](#algoritimos)
5. [Execução](#execucao)


## GitFlow

- Definimos que nossa branch principal será a branch `main`
- Optamos também por criar uma branch secundaria para que possamos desenvolver a patir da branch `develop`
- Para cada nova branch definimos um padrão de `feature/nome-algoritimo`
- Apos todos os codigos estiverem na develop poderiamos passar para a branch `main`

## Commits

-  Definimos para utilizar coventional commits para manter um padrão de projeto, seguindo essa documentação:
https://www.conventionalcommits.org/pt-br/v1.0.0/

## Documentação com Javadoc

Como sugestão de documentação poderiamos utilizar o javadoc para nossas classes de algoritimo.
Mais detalhes sobre javadoc podem ser encontradas nesse artigo:
https://www.baeldung.com/javadoc

## Algoritimos

### Bubble Sort

### Merge Sort
Merge Sort é um algoritimo de ordenação conhecido por `dividir e conquistar`
e possui uma complexidade de tempo de `O(n log n)`.

O algoritimo divide o array *recursivamente* até que fique apenas *um elemento* para ser comparado.
Em seguida esses elementos são combinados em ordem crescente para formar um array de resposta.

Para mais detalhes sobre a implementação foi implementado um javadoc para auxiliar o uso do algoritimo.

Foi utilizado essa documentação como referência para desenvolver `MergeSortUtil`:
https://www.w3schools.com/dsa/dsa_algo_mergesort.php

### Insertion Sort

## Execução
Para executar o projeto basta rodar a classe `Main`.
Também pode ser executado utilizando o atalho Shift + F10