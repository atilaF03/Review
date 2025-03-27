package Questão3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>(); // Criamos uma lista para os animais
        animais.add(new Cachorro(" JEFF", "preto"));
        animais.add(new Gato("zezinho", "laranja"));
        animais.add(new Vaca("bete", "marrom"));

        for (Animal animal : animais) {
            animal.fazerSom();

        }
    }

}