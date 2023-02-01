package exercicio.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        /*
         * System.out.println(notas.toString());
         * System.out.println("exiba a posição de nota 5: " + notas.indexOf(5d));
         * System.out.println("adicione na lista a nota 8 na posição 4");
         * notas.add(4, 8d);
         * System.out.println("substitua a nota 5 pela 6");
         * notas.set( notas.indexOf(5d), 6d);
         * System.out.println(notas);
         * System.out.println("confira se a nota 5 esta na lista: " +
         * notas.contains(5d));
         * System.out.println("imprima todas as notas:");
         * for (Double nota : notas) {
         * System.out.println(nota);
         * }
         */

        System.out.println("exiba a terceira nota adicionada: " + notas.get(2));
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
        System.out.println("remova a nota da posição 0");
        notas.remove(0);
        System.out.println("remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println("apague os elementos da lista");
        notas.clear();
        System.out.println(notas);
        System.out.println("confira se a lista esta vazia: " + notas.isEmpty());
    }
}