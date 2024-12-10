import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho de elementos que deseja para sua lista: ");
        int tamanho = input.nextInt();

        int[] listInsertion = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Agora digite os números para compor sua lista: ");
            listInsertion[i] = input.nextInt();
        }

        System.out.println("Lista antes da ordenação: " + Arrays.toString(listInsertion));

        InsertionSort.insertionSort(listInsertion);

        System.out.println( "Lista após a ordenação: " + Arrays.toString(listInsertion));
    }
}