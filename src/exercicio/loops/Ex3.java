package exercicio.loops;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {

            System.out.println("Número: ");
            num = scan.nextInt();

            soma = soma + num;

            if(num > maior) maior = num;
            
            count += 1;
        
        }while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma /5));
    }
}