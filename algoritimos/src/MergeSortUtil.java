import java.util.Arrays;

/**
 * Merge Sort Util
 *
 * <p> Merge Sort é um algoritimo de ordenação baseado na técnica de dividir para conquistar,
 * com complexidade de tempo de O(n log n)</p>
 *
 * @author Anderson Gadelha
 */
public class MergeSortUtil {

    /**
     * Ordena um array de inteiros utilizando o algoritimo Merge Sort.
     *
     * @param lista um array de inteiros a ser ordenado
     * @return retorna um novo array de inteiros ordenado.
     */
    public static Integer[] ordenar(Integer[] lista) {
        //Caso a lista tenha apenas um elemento ou esteja vazia, ela não vai precisar de ordenação e pode ser retornada
        if (lista.length < 2) {
            return lista.clone();
        }

        //Divide a lista no meio
        int meio = lista.length / 2;
        Integer[] esquerda = Arrays.copyOfRange(lista, 0, meio);
        Integer[] direita = Arrays.copyOfRange(lista, meio, lista.length);

        //Chama recursivamente até que fique apenas um elemento
        esquerda = ordenar(esquerda);
        direita = ordenar(direita);

        //Chamada metodo privado para ordenar e juntar listas
        return merge(esquerda, direita);
    }

    private static Integer[] merge(Integer[] esquerda, Integer[] direita) {
        //Define uma nova lista que tenha o tamanho das duas listas juntas
        Integer[] resultado = new Integer[esquerda.length + direita.length];

        int indiceParaArrayEsquerdo = 0;
        int indiceParaArrayDireito = 0;
        int indiceParaArrayResultado = 0;

        //Compara elementos da esquerda e direita e adiciona no array de resposta
        while (indiceParaArrayEsquerdo < esquerda.length && indiceParaArrayDireito < direita.length) {
            if (esquerda[indiceParaArrayEsquerdo] <= direita[indiceParaArrayDireito]) {
                resultado[indiceParaArrayResultado++] = esquerda[indiceParaArrayEsquerdo++];
            } else {
                resultado[indiceParaArrayResultado++] = direita[indiceParaArrayDireito++];
            }
        }

        //Adiciona elementos restantes que ainda não foram percorridos
        while (indiceParaArrayEsquerdo < esquerda.length) {
            resultado[indiceParaArrayResultado++] = esquerda[indiceParaArrayEsquerdo++];
        }
        while (indiceParaArrayDireito < direita.length) {
            resultado[indiceParaArrayResultado++] = direita[indiceParaArrayDireito++];
        }

        //Retorna os arrays combinados
        return resultado;
    }

}
