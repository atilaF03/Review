package Questao2;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("alice", "gerente", 5000);
        Assistente assistente = new Assistente("atila", "assitente", 2500);
        System.out.println(gerente);
        System.out.println(assistente);
    }
}
