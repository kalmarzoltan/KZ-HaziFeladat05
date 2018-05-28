package hazi_5;

public class Ember {
    private final String name;
    private String hajszin;
    private int magassag;
    private final int eletkor;


    public Ember(String name,int eletkor) {
        this.name = name;
        this.eletkor = eletkor;
    }

    public String getName() {
        return name;
    }


    public String getHajszin() {
        return hajszin;
    }

    public void setHajszin(String hajszin) {
        this.hajszin = hajszin;
    }

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public int getEletkor() {
        return eletkor;
    }


    public String nevEsEletkor() {
        return "Név: " + this.name + " életkora: (" + this.eletkor + ")";
    }

}