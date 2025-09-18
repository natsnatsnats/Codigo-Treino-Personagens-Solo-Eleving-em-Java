package Personagens;

public class Atributos {
    int forca;
    int agilidade;
    int percepcao;
    int vitalidade;
    int intelecto;
    String pontosdehabi;
    
    public Atributos(int forca, int agilidade, int percepcao, int vitalidade, int intelecto, String pontosdehabi) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.percepcao = percepcao;
        this.vitalidade = vitalidade;
        this.intelecto = intelecto;
        this.pontosdehabi = pontosdehabi;
    }
    
    // Getters
    public int getForca() { return forca; }
    public int getAgilidade() { return agilidade; }
    public int getPercepao() { return percepcao; }
    public int getVitalidade() { return vitalidade; }
    public int getIntelecto() { return intelecto; }
    public String getPontosdehabi() { return pontosdehabi; }
    
    public String toString() {
        return "Força: " + this.forca + "\nAgilidade: " + this.agilidade + "\nPercepção: " + this.percepcao + "\nVitalidade: " + this.vitalidade + "\nIntelecto: " + this.intelecto + "\nPontos de Habilidade: " + this.pontosdehabi;
    }
}
