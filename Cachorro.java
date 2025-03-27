package Questão3;

public class Cachorro extends Animal {

    public Cachorro(String nome, String cor) {
        super(nome, cor);
    }
@Override
void fazerSom() {
    System.out.println(" o cachorro "+getNome()+ " de cor "+getCor());
  
    System.out.println("au au ");
}
    
}

    


