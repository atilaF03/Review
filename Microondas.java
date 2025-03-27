package Questao4;

public class Microondas extends Eletrodomestico {
    // declaração de variavéis requisitadas

    private int tempoMaximo;

    // contructor com classe herdada
    public Microondas(String marca, int potencia, int tempoMaximo) {
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;
    }

    // get and set
    public int getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    // funçao para retornar as informações
    public void exibirInfo() {
        System.out.println("a marca é:" + getMarca());
        System.out.println("a potencia é:" + getPotencia() + "V");
        System.out.println("a capacidade é:" + getTempoMaximo() + "l");
    }

    // metodo para ligar
    @Override
    public void ligar() {
        System.out.println("o microondas esta ligado ");
    }

}