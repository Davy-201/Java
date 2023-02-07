package exercicio.teste;

public class Calcular implements OperacaoMatematica {
    
    @Override
    public void soma(int valor1, int valor2){
        System.out.println("soma:" + (valor1 + valor2));
    }

    @Override
    public void subtracao(int valor1, int valor2){
        System.out.println("subtração:" + (valor1 - valor2));
    }

    @Override
    public void divisao(int valor1, int valor2){
        System.out.println("divisão:" + valor1 / valor2);
    }

    @Override
    public void multiplicacao(int valor1, int valor2){
        System.out.println("multiplicação:" + valor1 * valor2);
    }
}