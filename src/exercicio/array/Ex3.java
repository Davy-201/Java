package exercicio.array;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] aleatorio = new int[20];

        for(int i = 0;i < aleatorio.length; i++) {
            int numero = random.nextInt(100);
            aleatorio[i] = numero;
        }

        System.out.println("numeros aleatorios: ");
        for (int numero : aleatorio) {
            System.out.print(numero + " ");
        }
        
        System.out.println("\nsucessor dos numeros aleatorios: ");
        for (int numero : aleatorio) {
            System.out.print((numero +1) + " ");
    }
}
}
