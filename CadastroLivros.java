package Questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLivros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        
        while (true) {
            // Exibe o menu de opções
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar um novo livro");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Alterar as informações de um livro");
            System.out.println("4. Remover um livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha após a opção

            switch (opcao) {
                case 1: // Adicionar um novo livro
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite o preço do livro: R$ ");
                    double preco = scanner.nextDouble();
                    livros.add(new Livro(titulo, autor, ano, preco));
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2: // Listar todos os livros
                    if (livros.isEmpty()) {
                        System.out.println("Não há livros cadastrados.");
                    } else {
                        System.out.println("\n=== LIVROS CADASTRADOS ===");
                        for (Livro livro : livros) {
                            livro.exibirInformacao();
                            System.out.println("-----------------------------");
                        }
                    }
                    break;

                case 3: // Alterar as informações de um livro
                    System.out.print("Digite o título do livro a ser alterado: ");
                    String tituloAlterar = scanner.nextLine();
                    Livro livroEncontrado = null;
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloAlterar)) {
                            livroEncontrado = livro;
                            break;
                        }
                    }

                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: ");
                        livroEncontrado.exibirInformacao();

                        System.out.print("\nDigite o novo título: ");
                        livroEncontrado.setTitulo(scanner.nextLine());
                        System.out.print("Digite o novo autor: ");
                        livroEncontrado.setAutor(scanner.nextLine());
                        System.out.print("Digite o novo ano de publicação: ");
                        livroEncontrado.setAnoPublicacao(scanner.nextInt());
                        System.out.print("Digite o novo preço: R$ ");
                        livroEncontrado.setPreco(scanner.nextDouble());
                        scanner.nextLine();  // Consumir a quebra de linha

                        System.out.println("Informações do livro atualizadas com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 4: // Remover um livro
                    System.out.print("Digite o título do livro a ser removido: ");
                    String tituloRemover = scanner.nextLine();
                    boolean removido = false;
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloRemover)) {
                            livros.remove(livro);
                            removido = true;
                            System.out.println("Livro removido com sucesso!");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 5: // Sair
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}