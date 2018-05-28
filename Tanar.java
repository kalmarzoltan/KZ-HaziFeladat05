package hazi_5;

public final class Tanar extends Ember {
    private Csoport csoport;
    private final String oktProgNyelv;

    public Tanar(String name, int eletkor, Csoport csoport, String oktProgNyelv) {
        super(name, eletkor);
        this.csoport = csoport;
        this.oktProgNyelv = oktProgNyelv;
    }

    public Tanar(String name, int eletkor, Csoport csoport, String oktProgNyelv, String hajszin, int magassag) {
        super(name, eletkor);
        this.csoport = csoport;
        this.oktProgNyelv = oktProgNyelv;
        setHajszin(hajszin);
        setMagassag(magassag);
    }

    public Csoport getCsoport() {
        return csoport;
    }

    public void setCsoport(Csoport csoport) {
        this.csoport = csoport;
    }

    public String getOktProgNyelv() {
        return oktProgNyelv;
    }

    public String kiirTanar() {
        return nevEsEletkor() + " csoport: "
                + this.csoport + ", oktatott nyelv: "
                + this.oktProgNyelv
                + ", hajszín: " + this.getHajszin()
                + ", magasság: " + getMagassag();
    }
}
