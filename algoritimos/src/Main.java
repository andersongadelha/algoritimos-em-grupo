import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] lista = {5, 2, 1 ,6, 7, 10};
        Integer[] listaComUmElemento = {1};
        Integer[] listaVazia = {};

        Integer[] listaOrdenada = MergeSortUtil.ordenar(lista);
        Integer[] listaOrdenadaComUmElemento = MergeSortUtil.ordenar(listaComUmElemento);
        Integer[] listaVaziaOrdenada = MergeSortUtil.ordenar(listaVazia);

        System.out.println("Lista Original: " + Arrays.toString(lista));
        System.out.println("Lista Ordenada: " + Arrays.toString(listaOrdenada));

        System.out.println("Lista Original: " + Arrays.toString(listaComUmElemento));
        System.out.println("Lista Ordenada: " + Arrays.toString(listaOrdenadaComUmElemento));

        System.out.println("Lista Original: " + Arrays.toString(listaVazia));
        System.out.println("Lista Ordenada: " + Arrays.toString(listaVaziaOrdenada));

    }
}