import java.util.List;

public final class BubbleSort {

    public BubbleSort() {} 
    
    public static List<Integer> bubbleSort(List<Integer> listaDesordenada) {
        int indx;
        int size = listaDesordenada.size() - 1;

        while (size > 1) {
            for(indx = 0; indx < size; indx++) {
                int primeiraPosicao = listaDesordenada.get(indx);
                int segundaPosicao = listaDesordenada.get(indx + 1);
    
                if (primeiraPosicao > segundaPosicao) {
                    listaDesordenada.set(indx, segundaPosicao);
                    listaDesordenada.set(indx + 1, primeiraPosicao);
                }
            }
            size--;
        }

        return listaDesordenada;
    }

}