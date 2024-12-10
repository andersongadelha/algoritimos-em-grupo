import javax.swing.*;

public class BubbleSort {

    public static void main(String[] args) {
        // Pergunta o tamanho da lista
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da lista: "));

        // Cria o Array
        int[] lista = new int[tamanho];

        // Pergunta os itens da lista
        for (int i = 0; i < tamanho; i++) {
            lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os itens da lista: "));
        }

        bubbleSort(lista);

        // Exibe a lista ordenada
        System.out.println("Lista ordenada.");
        for (int num : lista) {
            System.out.println(num + " ");
        }

    }

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

