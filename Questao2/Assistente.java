package Questao2;

public class Assistente extends Funcionario {

    public Assistente(String nome, String cargo, double salario) {
        super(nome, cargo, salario);
    }

    public double calcularBonus() {
        return salario * 0.05;

    }

    @Override
    public String toString() {
        return "Gerente \nnome: " + nome + " \ncargo: " + cargo + "\nsalario: " + salario + "\nbonus: " + calcularBonus();
    }
  
 

}
