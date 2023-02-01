package exercicio.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExList {
    public static void main(String[] args) {
        System.out.println("crie uma lista chamada notas2");

        List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8d, 9d, 5d));
        System.out.println(notas2);
        System.out.println("mostre a primeira nota sem remove-la: " + notas2.get(0));
        System.out.println("mostre a primeira nota removendo-a: ");
        notas2.remove(0);
    }
}