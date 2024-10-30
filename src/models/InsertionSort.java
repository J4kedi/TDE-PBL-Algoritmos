import java.util.List;

public final class InsertionSort {
    
    public InsertionSort() {}

    public static List<Integer> insertionSort(List<Integer> listaDesordenada) {
        int size = 0;
        
        while(size < listaDesordenada.size()) {
            int primeiraPosicao = listaDesordenada.get(size);
            int posicao = listaDesordenada.get(size + 1);

            if(primeiraPosicao > posicao) {
                listaDesordenada.set(size, posicao);
                listaDesordenada.set(size + 1, primeiraPosicao);
            }

            System.out.println(listaDesordenada);

            size++;
        }

        return listaDesordenada;
    }
}
