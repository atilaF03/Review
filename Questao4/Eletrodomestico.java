package Questao4;

// declarando classe abstrata 
abstract class Eletrodomestico {
    private String marca;
    private int potencia;

    // geranndo contructor
    public Eletrodomestico(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }
    // gerando getters e Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // implementando metodo para ligar objetos
    public void ligar() {

    }

}
