package Questao3;

public class Gato extends Animal {

    public Gato(String nome, String cor) {
        super(nome, cor);
        //TODO Auto-generated constructor stub
    }
    @Override
    void fazerSom() {
        System.out.println(" o gato  "+getNome()+ " de cor "+getCor());
        System.out.println("esta miando ");
        System.out.println("miau miau ");
    }    }

