package exercicio;

public class Rodar {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("BMW série 3");
        carro1.setTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getTanque());
        System.out.println(carro1.valorTanque(7.40));

        Carro carro2 = new Carro("cinza", "Mercedes-Benz classe c", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getTanque());
        System.out.println(carro2.valorTanque(7.40));
    }
}