package Questao3;

abstract  class Animal {
 protected String  nome , cor;

public Animal(String nome, String cor) {
    this.nome = nome;
    this.cor = cor;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}
 
abstract void fazerSom();
}
