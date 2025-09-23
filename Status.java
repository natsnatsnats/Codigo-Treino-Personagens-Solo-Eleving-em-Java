package Personagens;

public class Status {
    String hp;
    int mp;
    int fadiga;
    
    public Status(String hp, int mp, int fadiga) {
        this.hp = hp;
        this.mp = mp;
        this.fadiga = fadiga;
    }
    
    // Getters
    public String getHp() { return hp; }
    public int getMp() { return mp; }
    public int getFadiga() { return fadiga; }
    
    // SET
    public void setHp(String hp) {
    	this.hp = hp;
    }
    public void setMp(int mp) {
    	this.mp = mp;
    }
    public void setFadiga(int fad) {
    	this.fadiga = fad;
    }

    public String toString() {
        return "Hp: " + this.hp + "| " + "Mp: " + this.mp + "| " + "Fadiga: " + this.fadiga;
    }
}
