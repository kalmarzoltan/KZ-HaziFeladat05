package hazi_5;

public class Main {
    public static void main(String[] args) {
        Ember ember = new Ember("Sanya-1", 31);
        ember.setHajszin("barna");
        ember.setMagassag(178);
        System.out.println(ember.nevEsEletkor());
        System.out.println("----------------------------------------------------------------");

        HaziFeladat h1 = new HaziFeladat(1, 25);
        HaziFeladat h2 = new HaziFeladat(2, 50);
        HaziFeladat h3 = new HaziFeladat(3, 100);
        HaziFeladat h4 = new HaziFeladat(4, 99);
        HaziFeladat h5 = new HaziFeladat(5, 11);

        HaziFeladat[] haziTomb = new HaziFeladat[50];
        haziTomb[0] = h1;
        haziTomb[1] = h2;
        haziTomb[2] = h3;
        Tanulo tanuloProba = new Tanulo("tanuloProba", 33, 1, haziTomb);
        tanuloProba.setHajszin("barna");
        tanuloProba.setMagassag(178);
        Tanulo tanuloSanya0 = new Tanulo("tanuloSanya0", 33, 1, haziTomb, "barna", 178);
        Tanulo tanuloSanya1 = new Tanulo("tanuloSanya1", 33, 1, haziTomb, "barna", 178);
        Tanulo tanuloSanya2 = new Tanulo("tanuloSanya2", 33, 1, haziTomb, "barna", 178);
        Tanulo tanuloSanya3 = new Tanulo("tanuloSanya3", 33, 1, haziTomb, "barna", 178);
        System.out.println(tanuloSanya0.kiirTanulo());
        tanuloSanya0.addHázi(h4);
        System.out.println(tanuloSanya0.kiirTanulo());
        tanuloSanya0.haziKiír();
        tanuloSanya0.addHázi(h5);
        tanuloSanya0.haziKiír();
        System.out.println("----------------------------------------------------------------");
        System.out.println("A tanuloSanya háziTömbjének mérete: " + tanuloSanya0.getHaziTomb().length);
        System.out.println("----------------------------------------------------------------");
        Csoport csoport = new Csoport(null);
        csoport.addTanulo(tanuloSanya0);
        csoport.addTanulo(tanuloSanya1);
        csoport.addTanulo(tanuloSanya2);
        csoport.addTanulo(tanuloSanya0);
        csoport.addTanulo(tanuloSanya1);
        csoport.addTanulo(tanuloSanya3);
        csoport.addTanulo(tanuloSanya0);
        csoport.addTanulo(tanuloSanya1);
        csoport.addTanulo(tanuloSanya2);
        csoport.addTanulo(tanuloSanya0);
        csoport.addTanulo(tanuloSanya1);
        csoport.addTanulo(tanuloSanya2);


        csoport.csoportKiír();
        System.out.println("----------------------------------------------------------------");
        csoport.removeTanulo(tanuloSanya3);
        csoport.csoportKiír();
    }
}
