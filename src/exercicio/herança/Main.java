package exercicio.herança;

public class Main {
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new Filha1(), new Filha2(), new ClasseMae()};

        //polimorfismo
        for(ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for(ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        //sobrescrita
        Filha2 filha2 = new Filha2();
        filha2.metodo3();
    }
}