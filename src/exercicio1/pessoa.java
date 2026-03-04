package exercicio1;

public class pessoa {
    private String nome;

    private int idade;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public pessoa() {}
    @Override
    public String toString() {return "Nome: " + nome + "Idade: " + idade;}
}
