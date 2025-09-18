package Personagens;

public class Pessoa {
    String nome;
    Status status;
    Atributos atributos;
    
    public Pessoa(String nome, Status status, Atributos atributos) {
        this.nome = nome;
        this.status = status;
        this.atributos = atributos;
    }
    
    public String toString() {
        return "=== " + this.nome + " ===\n" + "\n" +
        	   "=== " + "Status" + " ===" + "\n" + this.status + "\n" + "\n" +
               "=== " + "Atributos" + " ===" + "\n" + this.atributos;
    }
}
