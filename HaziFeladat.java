package hazi_5;

public class HaziFeladat {
    private final int oktatasiHet;
    private final int kapottSzazalek;

    public HaziFeladat(int oktatasiHet, int kapottSzazalek) {
        this.oktatasiHet = oktatasiHet;
        //setKapottSzazalek(kapottSzazalek);
        this.kapottSzazalek=kapottSzazalek;
    }

    public int getOktatasiHet() {
        return oktatasiHet;
    }

//    public void setOktatasiHet(int oktatasiHet) {
//        this.oktatasiHet = oktatasiHet;
//    }

    public int getKapottSzazalek() {
        return kapottSzazalek;
    }

//    public void setKapottSzazalek(int kapottSzazalek) {
//        if (kapottSzazalek <= 100) {
//            this.kapottSzazalek = kapottSzazalek;
//        } else {
//            System.out.println("A kapott százalék nem lehet nagyobb mint 100%");
//        }
//    }
}
