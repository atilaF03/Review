package Questao1;

public class Produtos {
    private String nome;
    private double preco, quantidade;

    public Produtos(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return getPreco() * getQuantidade();
    }

    public void informacoes() {
    System.out.println("produtos");
    System.out.println("o nome: "+ getNome());
    System.out.println("o valor: "+ getPreco());
    System.out.println("a quantidade: "+ getQuantidade());
    double total = calcularValorTotal();
    System.out.println("total:"+total);
    }

}
