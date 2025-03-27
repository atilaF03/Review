package Questao2;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cargo, double salario) {
        super(nome, cargo, salario);
       
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Gerente \nnome: " + nome + " \ncargo: " + cargo + "\nsalario: " + salario + "\nbonus: " + calcularBonus();
    }

}
