package Personagens;

public class serabsoluto {
    String nome;
    String statuss;
    String atributos;
    
    public serabsoluto(String nome, String statuss, String atributos) {
        this.nome = nome;
        this.statuss = statuss;
        this.atributos = atributos;
    }
    
    public String toString() {
    	return "=== " + this.nome + " ===\n" + "\n" +
         	   "=== " + "Status" + " ===" + "\n" + this.statuss + "\n" + "\n" +
               "=== " + "Atributos" + " ===" + "\n" + this.atributos;
     }
}
