import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort (int[] listInsertion) {

        for (int i =  1 ; i < listInsertion.length; i++) {

            int key = listInsertion[i];
            int j = i -1 ;

            while (j >= 0 && key < listInsertion[j]) {   // Move elementos maiores que key, uma posição à frente de sua posição atual
                listInsertion[j + 1] = listInsertion[j];
                j--;
            }

            listInsertion[j + 1] = key;
        }
    }
}






// i começa em 1 porque o elemento no índice 0 é considerado já ordenado ou o menor elemento na porção ordenada do array. Ao começar em 1, você começa com o segundo elemento e o compara com o primeiro para inseri-lo na posição correta.
// j é usado para iterar pela parte já ordenada do array para encontrar a posição correta para a chave. Começar j em i — 1 significa que começamos comparando a chave com o elemento imediatamente anterior a ela no array. Movemos da direita para a esquerda na parte ordenada para encontrar a posição correta para inserção.
// a condição j >= 0 garante que o algoritmo não tente acessar um elemento fora dos limites do array.
// key = listInsertion[i] armazena o valor do elemento que estamos tentando inserir na parte ordenada do array e ajuda a preservar o valor original.
// listInsertion[j + 1] = listInsertion[j] usado para deslocar elementos para a direita até que a posição correta para a chave seja encontrada. O elemento em j é maior que a chave, então o movemos uma posição para a direita ( j + 1). Esse processo continua até que a chave seja menor ou que alcancemos o início da parte classificada do array.
// j-- move da direita para a esquerda na parte ordenada do array, comparando a chave com elementos em ordem decrescente. Isso garante que encontremos a posição correta para a chave na parte ordenada.
// listInsertion[j + 1] = key após encontrada a posição correta, insere a chave na parte classificada do array, mantendo a ordem geral classificada.




