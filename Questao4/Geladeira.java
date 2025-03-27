package Questao4;

public class Geladeira extends Eletrodomestico {
    // declaração de variavéis requisitadas

    private double capacidade;

    // contructor com classe herdada
    public Geladeira(String marca, int potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }
    // get and set

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    // funçao para retornar as informações

    public void exibirInfo() {
        System.out.println("a marca é:" + getMarca());
        System.out.println("a potencia é:" + getPotencia() + "V");
        System.out.println("a capacidade é:" + getCapacidade() + "l");
    }

    // metodo para ligar

    @Override
    public void ligar() {
        System.out.println("a geladeira esta ligada");
    }

}