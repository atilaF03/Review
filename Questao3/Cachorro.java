package Questao3;

public class Cachorro extends Animal {

    public Cachorro(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    void fazerSom() {
        System.out.println(" o cachorro " + getNome() + " de cor " + getCor());
        System.out.println("esta latindo");
        System.out.println("au au ");
    }

}
