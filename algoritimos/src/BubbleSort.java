public class BubbleSort {

    // Metodo bubbleSort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;

        // loop para percorrer o array
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }

        }

    }

}

