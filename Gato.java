package Questão3;

public class Gato extends Animal {

    public Gato(String nome, String cor) {
        super(nome, cor);
        //TODO Auto-generated constructor stub
    }
    @Override
    void fazerSom() {
        System.out.println(" o gato  "+getNome()+ " de cor "+getCor());
        System.out.println("miau miau ");
    }    }

