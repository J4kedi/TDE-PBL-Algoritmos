import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDesordenada = new ArrayList<>();

        listaDesordenada.add(5);
        listaDesordenada.add(2);
        listaDesordenada.add(8);
        listaDesordenada.add(12);
        listaDesordenada.add(4);

        // System.out.println(BubbleSort.bubbleSort(listaDesordenada));
        System.out.println(InsertionSort.insertionSort(listaDesordenada));
    }
}
