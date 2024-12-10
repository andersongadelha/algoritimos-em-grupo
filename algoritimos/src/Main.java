import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // envia mensagem para o usuário escolher o tamanho da sua lista
        System.out.println("Digite o tamanho de elementos que deseja para sua lista: ");
        int tamanho = input.nextInt();

        // cria a lista com o tamanho especificado pelo usuário
        int[] listInsertion = new int[tamanho];

        // imprime mensagem o tanto de vezes que for o tamanho escolhido da lista e permite que usuário informe seus elementos
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Agora digite os números para compor sua lista: ");
            listInsertion[i] = input.nextInt();
        }

        // imprime lista com os números fornecidos pelo usuário
        System.out.println("Lista antes da ordenação: " + Arrays.toString(listInsertion));

        // chama metodo de ordenação escrito na outra classe
        InsertionSort.insertionSort(listInsertion);

        // imprime lista após ordenação em ordem crescente
        System.out.println( "Lista após a ordenação: " + Arrays.toString(listInsertion));
    }
}