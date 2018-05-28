package hazi_5;

public class Csoport {
    private Tanulo[] tanulokTomb;

    public Csoport(Tanulo[] tanulokTomb) {
        if (tanulokTomb == null) {
            this.tanulokTomb = new Tanulo[10];
        } else {
            this.setTanulokTomb(tanulokTomb);
        }
    }

    public void addTanulo(Tanulo tanulo) {
        int tanulokSzama = 0;
        for (int i = 0; i < tanulokTomb.length; i++) {
            if (tanulokTomb[i] != null) {
                tanulokSzama++;
            }
        }
        System.out.println(tanulokSzama);
        if (tanulokSzama >= 10) {
            System.out.println("Nincs több hely a csoportban");
        } else {
            for (int i = 0; i < tanulokTomb.length; i++) {
                if (tanulokTomb[i] == null) {
                    tanulokTomb[i] = tanulo;
                    System.out.println("Tanulo: " + tanulo.getName() + ", hozzáadva a csoporthoz");
                    break;
                }
            }
        }
    }

    public void removeTanulo(Tanulo tanulo) {

        for (int i = 0; i < tanulokTomb.length; i++) {
            if(tanulokTomb[i]==tanulo){
                tanulokTomb[i]=null;
                System.out.println(tanulo.kiirTanulo()+" törölve a csoportból");
//                for(int j=i+1; j<tanulokTomb.length;j++){
//                    tanulokTomb[j]=tanulokTomb[j-1];
//                }
            }
        }
    }

    public Tanulo[] getTanulokTomb() {
        return tanulokTomb;
    }

    public void setTanulokTomb(Tanulo[] tanulokTomb) {
        this.tanulokTomb = tanulokTomb;
    }

    public void csoportKiír() {
        int tanulokSzama = 0;
        for (int i = 0; i < tanulokTomb.length; i++) {
            if (tanulokTomb[i] != null) {
                tanulokSzama++;
                System.out.println(
                        "a csoportban benne van: "
                                + this.tanulokTomb[i].getName());
            }
        }
        System.out.println("A csoport mérete: " + tanulokTomb.length
                + ", a benne lévő tanulok száma: " + tanulokSzama + " db, "
                + ((tanulokTomb.length) - tanulokSzama) + " db tanulo fér még bele");
    }
}
