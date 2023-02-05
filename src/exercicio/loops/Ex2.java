package exercicio.loops;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota;
        nota = scan.nextFloat();
        
        System.out.println("nota: " + nota);
        
        while(nota < 0 || nota > 10){
            System.out.println("nota invalida! tente novamente");
            nota = scan.nextFloat();
        }
    }
}