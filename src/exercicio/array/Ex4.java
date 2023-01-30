package exercicio.array;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        
        Random randon = new Random();
        int [] [] M = new int [4] [4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = randon.nextInt(9);
            }
        }

        System.out.println("matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}