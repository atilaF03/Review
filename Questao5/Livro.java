package Questao5;

public class Livro {
    private String titulo, autor;
    private int anoPublicacao;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacao() {
        System.out.println("o titulo do livro é " + getTitulo() + "\n o autor é " + getAutor()
                + "\n o ano de publicacao é: " + getAnoPublicacao() + "\n o preco do livro é" + getPreco());

    }

}
