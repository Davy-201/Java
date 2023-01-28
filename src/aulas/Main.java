package aulas;

public class Main {
    public static void main(String[] args) {
        /**
         * // Calculadora
         * System.out.println("Exercício calculadora");
         * Calculadora.soma(3, 6);
         * Calculadora.subtracao(9, 1.8);
         * Calculadora.multiplicacao(7, 8);
         * Calculadora.divisao(5, 2.5);
         * 
         * // Mensagem
         * System.out.println("Exercício mensagem");
         * Mensagem.obterMensagem(9);
         * Mensagem.obterMensagem(14);
         * Mensagem.obterMensagem(1);
         * 
         * // Empréstimo
         * System.out.println("Exercício empréstimo");
         * Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
         * Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
         * Emprestimo.calcular(1000, 5);
         * 
         * }
         * //__________________________________________________________________________________________________________
         */
        System.out.println("exercicio quadrilatero");
        quadrilateros.area(5, 5);
        quadrilateros.area(7, 8, 9);
        System.out.println("retorno");
        double areaQuadrado = quadrilateros.area(3);
        System.out.println("area do quadrado: " + areaQuadrado);
        //quadrilateros.area(5f, 5f);
    }
}