1, Ez a feladat a jelenlegi tanfolyamcsoportot modellezi 
  
  A, Készítsen egy Ember osztályt
      -legyen nev, hajSzin, magassag, eletkor adata
      -legyen konstruktora amelyben a paraméterként kapott értékekkel inicializálja a nev, eletkor  adattagot
      -legyen egy metódusa ami kiirja a nevét, eletkorát Pl: "Név: Pelda Nev (29)"
      -legyen final kulcsszóval ellátva az összes olyan adattag amit pédányosítás után nem szeretnénk módosítani 
      -legyen setter/getter az összes olyan adattagra, amit a példányosítás után módosítani szeretnénk

  B, Készítsen egy Tanár osztályt, amely az Ember osztály leszármazottja
      -legyen csoport, oktProgNyelv adata 
       (az egyszerűség kedvéért a csoportAholOktat értékei: 1 vagy 2, 1 -es vagy 2 -es csoporti, ez majd a példányosításnál kell)
      -legyen final az összes olyan adattagja, amit pédányosítás után nem szeretnénk módosítani
      -legyen konstruktora, amely a négy paraméterben kapott adattal inicializálja
      -legyen kiir metódusa Pl: "Név: Pelda Nev (29), csoport: 1, oktatott programozási nyelv: Java"
      -legyen setter/getter az összes azokra az adattagokra, amit példányosítás után módosítani szeretnénk
      -az osztály a továbbiakban, ne legyen leszármaztatható

  C, Készítsen egy Tanulo osztályt, amely az Ember osztály leszármazottja
      -legyen csoport adata és egy haziFeladat tömb amiben HaziFeladat osztalyokat tárolunk
       (maximum 50 db házi feladat tárolására van lehetőség, ezért ezt ellenőrizni kell)
      -legyen konstruktora, amely a négy paraméterben kapott adattal inicializálja
      -legyen egy kiir metódusa Pl: "Név: Pelda Nev (22)" 
      -legyen egy addHaziFeladat metódusa amivel hozzátudunk adni a haziFeladat tömbhöz
      -legyen egy haziKiir metódusa, ami egymás alá kiirja a házi feladatok Pl: "1 hét, eredmény: 98%"
      -legyen setter/getter az összes adattagra

  D, Készítsen egy HaziFeladat osztályt
    -legyen okatatasiHet, kapottSzazalek adata
    -legyen konstruktora, amelyben a paraméterként kapott értékkel inicializálja a kettő adattagját
     (a kapottSzazalek adattag beállításakor vizsgálja hogy 100% nál többet ne adhasson meg)
    -legyen setter/getter az összes adattagra

  E, Hozzon létre egy Tanar osztályt ( az adatok természetesen lehetnek kitaláltak )

  F, Hozzon létre hat Tanulo osztályt ( az adatok itt is lehetnek kitaláltak )

  G, Irassa ki a példányosított Tanár és Tanulo osztályokat a kiir metódusuk segítségével

  H, Bővitse ki a Tanar és a Tanulo osztály kiir metódusait, hogy a hajSzin és a magassag adattagok is kiirásra kerüljenek

  I, Házi feladat:
	 a, HaziFeladat osztály adattagjai legyenek final -ek.
	 b, A tömb 50 elem tárolására legyen képes, nézzétek meg, hogy mennyi a tomb.length értéke
  
     c, A Tanár osztály csoportAholOktat adattagja egy Csoport osztály legyen, aminek legyen egy tömb adattagja,
     ahol tárolni tudunk 10 db Tanulót.
     Tudjunk a Csoport osztályhoz hozzáadni tanulókat és ha van kedv és idő akkor eltávolítani is.

    Előszőr készítsünk egy Tanulo osztályt

    Csoport
     Tanulo[] tanuloLista
    --------------
     addTanulo()
     removeTanulo()

    Miután ez megvan, alakítsuk át a Tanar osztályt
    A csoportAholOktat adattag később is beállítható legyen 
    
    Tanar
     Csoport csoportAholOktat
    --------------
     getter/setter
	 
	
	 dandiroland
     
