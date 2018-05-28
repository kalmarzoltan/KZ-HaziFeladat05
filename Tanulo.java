package hazi_5;

public class Tanulo extends Ember {

    private int csoport;
    private HaziFeladat[] haziTomb;

    public Tanulo(String name, int eletkor, int csoport, HaziFeladat[] haziTomb) {
        super(name, eletkor);
        this.csoport = csoport;
        if (haziTomb == null) {
            this.haziTomb = new HaziFeladat[50];
        } else {
            this.haziTomb = haziTomb;
        }
    }

    public Tanulo(String name, int eletkor, int csoport, HaziFeladat[] haziTomb, String hajszin, int magassag) {
        super(name, eletkor);
        this.csoport = csoport;
        if (haziTomb == null) {
            this.haziTomb = new HaziFeladat[50];
        } else {
            this.haziTomb = haziTomb;
        }
        setHajszin(hajszin);
        setMagassag(magassag);
    }


    public String kiirTanulo() {
        return super.nevEsEletkor() + ", hajszín: " + this.getHajszin() + ", magasság: " + getMagassag();
    }

    public void haziKiír() {
        int házikSzama = 0;
        for (int i = 0; i < haziTomb.length; i++) {
            if (haziTomb[i] != null) {
                házikSzama++;
                System.out.println(
                        "oktatási hét: "
                                + this.haziTomb[i].getOktatasiHet()
                                + ", kapott százalék: "
                                + this.haziTomb[i].getKapottSzazalek());
            }
        }
        System.out.println("A háziTömb mérete: " + haziTomb.length
                + ", a házik száma: " + házikSzama + " db, "
                + ((haziTomb.length) - házikSzama) + " db házi fér még bele");
    }

    public void addHázi(HaziFeladat házifeladat) {
        for (int i = 0; i < haziTomb.length; i++) {
            if (haziTomb[i] == null) {
                haziTomb[i] = házifeladat;
                System.out.println(" " + házifeladat.getOktatasiHet() + " -es feladat hozzáadva a tanulóhoz");
                break;
            }
        }
    }

    public int getCsoport() {

        return csoport;
    }

    public void setCsoport(int csoport) {

        this.csoport = csoport;
    }

    public HaziFeladat[] getHaziTomb() {

        return haziTomb;
    }

    public void setHaziTomb(HaziFeladat[] haziTomb) {

        this.haziTomb = haziTomb;
    }


}
