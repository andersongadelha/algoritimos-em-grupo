public class InsertionSort {
    public static void main(String[] args) {

        int[] listInsertion = {5,2,9,15,11};   // declara lista a ser ordenada

        for (int i =  1 ; i < listInsertion.length; i++) {   // i começa em 1 porque o elemento no índice 0 é considerado já ordenado ou o menor elemento na porção ordenada do array. Ao começar em 1, você começa com o segundo elemento e o compara com o primeiro para inseri-lo na posição correta.

            int key = listInsertion[i];
            int j = i -1 ;

            while (key < listInsertion[j] && j >= 0 ) {   // Move elementos maiores que key, uma posição à frente de sua posição atual
                listInsertion[j + 1] = listInsertion[j];
                j -= 1;
            }

            listInsertion[j + 1] = key;
        }
    }
}