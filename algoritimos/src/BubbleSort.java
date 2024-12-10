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

    }

}

