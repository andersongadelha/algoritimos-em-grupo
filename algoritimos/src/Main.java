import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho de elementos que deseja para sua lista: ");
        int tamanho = input.nextInt();

        int[] listInsertion = new int[tamanho];

        for (int i = 0; i < tamanho; i++); {
            System.out.println("Agora digite os números para compor sua lista: ");
            listInsertion['i'] = input.nextInt();
        }

        System.out.println("Lista antes da ordenação: " + listInsertion);

        for (int num : listInsertion) {
            System.out.print(num + " " );
        }

        System.out.print( "Lista após a ordenação: " );

        for (int num : listInsertion) {
            System.out.print(num + " " );
        }






    }
}