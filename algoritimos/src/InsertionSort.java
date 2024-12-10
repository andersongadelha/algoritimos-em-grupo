public class InsertionSort {

    // cria metodo de ordenação e define que o parametro é um array
    public static void insertionSort (int[] listInsertion) {

        // percorre cada elemento do array, iniciando no 2ª numero pois o primeiro nª não possui antecessor para análise
        for (int i =  1 ; i < listInsertion.length; i++) {

            // guarda o valor do elemento que está sendo comparado para encontrar sua posição correta
            int key = listInsertion[i];
            int j = i -1 ;

            // desloca elementos para a direita até que a posição correta seja encontrada e garante o limite do tamanho da array
            while (j >= 0 && key < listInsertion[j]) {
                listInsertion[j + 1] = listInsertion[j];
                j--;
            }

            // posição correta do elemento
            listInsertion[j + 1] = key;
        }
    }
}