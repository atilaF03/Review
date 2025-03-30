package Questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        while (true) {
            informações();
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("adicionar novo livro ");
                    String titulo = sc.nextLine();
                    System.out.println("digite o autor");
                    String autor = sc.nextLine();
                    System.out.println("digite o ano de publicação");
                    int setAnoPublicacao = sc.nextInt();
                    System.out.println("digite o preço do livro");
                    double preco = sc.nextDouble();
                    livros.add(new Livro(titulo, autor, setAnoPublicacao, preco));
                    System.out.println("o livro foi cadastrado com sucesso! ");
                    break;
                case 2:
                    if (livros.isEmpty()) {
                        System.out.println("a lista esta vazia");
                    } else {
                        System.out.println("\n === LIVROS CADASTRADOS ===");
                        for (Livro livro : livros) {
                            livro.exibirInformacao();
                            System.out.println("---------------------------");
                        }
                    }

                    break;
                case 3:
                    System.out.println(" DIgite o título do livro a se alternado");
                    String tituloAlterar = sc.nextLine();
                    Livro livroEncontrado = null;
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloAlterar)) {
                            livroEncontrado = livro;
                        }
                    }
                    if (livroEncontrado != null) {
                        livroEncontrado.exibirInformacao();

                        System.out.print("\nDigite o novo título: ");
                        livroEncontrado.setTitulo(sc.nextLine());
                        System.out.println(" Digite o novo autor:");
                        livroEncontrado.setAutor(sc.nextLine());
                        System.out.println("digite o noco ano de publicacao");
                        livroEncontrado.setAnoPublicacao(sc.nextInt());
                        System.out.println("digite o novo preço:");
                        livroEncontrado.setPreco(sc.nextDouble());
                        sc.nextLine();
                        System.out.println(" informaçoes do livro atualizadas com sucesso!");

                    } else {
                        System.out.println(" livro não encotrado");
                    }
                    break;
                case 4:
                    System.out.println(" digite o titulo a ser removido");
                    String tituloRemover = sc.nextLine();
                    boolean removido = false;
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloRemover)) {
                            livros.remove(livro);
                            removido = true;
                            System.out.println("livro removido com sucesso !");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println(" livro não encontrado ");
                    }
                    break;
                case 5:
                    System.out.println(" livro não encotrado");
                    sc.close();
                    return;
                default:
                
                    break;
            }

        }

    }

    public static void informações() {
        System.out.println("======Menu======");
        System.out.println("1- adicionar um livro");
        System.out.println("2 Listar todos os livros");
        System.out.println("3 Alterar as informações de um livro");
        System.out.println("4 Remover um livro");
        System.out.println("5 sair");
        System.out.println("Escolha uma opção: ");
    }
}
