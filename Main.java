package Personagens;

public class main {
    public static void main(String args[]) {
      
    	Pessoa sung = new Pessoa("Sung Jin Woo", new Status("100", 10, 50), new Atributos(95, 87, 39, 16, 57, "7"));
    	Pessoa antares = new Pessoa("Antares", new Status("5.000", 250, 150), new Atributos(230, 193, 89, 60, 156, "?"));
    	serabsoluto serab = new serabsoluto("Ser Absoluto", "Hp: 10.000 | Mp: 500 | Fadiga: 300", "Força: ??? \nAgilidade: ??? \nPercepção: ??? \nVitalidade: ??? \nIntelecto: ??? \nPontos de Habilidade: ?");
        
        System.out.println("PERSONAGENS\n\n");
        System.out.println(sung.toString() + "\n\n");
        System.out.println(serab.toString() + "\n\n");
        System.out.println(antares.toString() + "\n\n");
       
    }
}
