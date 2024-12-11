import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] lista = {5, 2, 1 ,6, 7, 10};
        int[] resultadoEsperado = {1, 2, 5, 6 ,7, 10};
        int[] listaComUmElemento = {1};
        int[] listaVazia = {};

        int[] listaOrdenada = MergeSortUtil.ordenar(lista);
        int[] listaOrdenadaComUmElemento = MergeSortUtil.ordenar(listaComUmElemento);
        int[] listaVaziaOrdenada = MergeSortUtil.ordenar(listaVazia);

        System.out.println("Teste para ordenar array:");
        System.out.println("Lista Original: " + Arrays.toString(lista));
        System.out.println("Lista Ordenada: " + Arrays.toString(listaOrdenada));
        testeComparacao(listaOrdenada, resultadoEsperado);
        System.out.println("Teste para ordenar array com apenas um elemento:");
        System.out.println("Lista Original: " + Arrays.toString(listaComUmElemento));
        System.out.println("Lista Ordenada: " + Arrays.toString(listaOrdenadaComUmElemento));
        testeComparacao(listaOrdenadaComUmElemento, listaComUmElemento);
        System.out.println("Teste para ordenar array vazio:");
        System.out.println("Lista Original: " + Arrays.toString(listaVazia));
        System.out.println("Lista Ordenada: " + Arrays.toString(listaVaziaOrdenada));
        testeComparacao(listaVaziaOrdenada, listaVazia);
    }

    private static void testeComparacao(int[] listaOrdenada, int[] resultadoEsperado) {
        if (Arrays.toString(listaOrdenada).equals(Arrays.toString(resultadoEsperado))){
            System.out.println("Resultado esperado: " + Arrays.toString(resultadoEsperado));
            System.out.println("Passou!");
        } else {
            System.out.println("Resultado esperado: " + Arrays.toString(resultadoEsperado));
            System.out.println("Falhou!");
        }
    }
}