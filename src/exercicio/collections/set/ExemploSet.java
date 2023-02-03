package exercicio.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("confira se a nota 5 esta na no conjunto: " + notas.contains(5d));
        System.out.println("exiba a menor nota: " + Collections.min(notas));
        System.out.println("exiba a menor nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma dos valores: " + soma);
        System.out.println("exiba a media dos valores: " + (soma / notas.size()));
        System.out.println("remova a nota 0");
        notas.remove(0d);
        System.out.println("remova as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("exiba o conjunto na ordem informada");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("apague os elementos da lista");
        notas.clear();
        System.out.println("confira se a lista esta vazia: " + notas.isEmpty());
        System.out.println("confira se a lista esta vazia: " + notas2.isEmpty());
        System.out.println("confira se a lista esta vazia: " + notas3.isEmpty());
    }
}