package Questão3;

public class Vaca extends Animal {

    public Vaca(String nome, String cor) {
        super(nome, cor);
    }
    @Override
    void fazerSom() {
        System.out.println(" a vaca "+getNome()+ " de cor "+getCor());
        System.out.println("muuu");
    }
}
