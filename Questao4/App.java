package Questao4;

public class App {
    public static void main(String[] args) {
        // instaciando objetos
        Geladeira geladeira = new Geladeira("Eletro", 220, 200);
        Microondas microondas = new Microondas("Bomb", 110, 60);
        
        geladeira.exibirInfo();
        geladeira.ligar();
        System.out.println("=======================");
        microondas.exibirInfo();
        microondas.ligar();
    }
}
