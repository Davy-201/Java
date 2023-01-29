package exercicio;

public class Carro {

    //atributos
    String cor;
    String modelo;
    double tanque;

    // sobrecarga
    Carro () {

    }

    Carro ( String cor, String modelo, double tanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;
    }

    // get e set
    void setCor(String cor){
         this.cor = cor;
    }

    String getCor () {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setTanque(double tanque){
        this.tanque = tanque;
    }

    double getTanque(){
        return tanque;
    }

    // metodo funcional
    double valorTanque(double valorCombustivel){
        return tanque * valorCombustivel;
    }
}