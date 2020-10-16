package classkedvez2;

// import java.util.ArrayList;

import java.util.List;

public class MainKosar {

    // private static List<RendelhetoTermek> rendelhetoTermekList = new ArrayList<>();
    // private static List<RendeltTermek> rendeltTermekList = new ArrayList<>();

    public static void main(String[] args) {
        List<Kedvezmeny> kedvezmenyList;
        List<RendelhetoTermek> rendelhetoTermekList;
        List<RendeltTermek> rendeltTermekList;
        // long kosarAr;
        // int bekertMennyiseg;
        // int rendeltMenny;
        int osszMennyiseg;
        long eredetiOsszAr = 0;

        long kedvErtek = 0;
        String kedvTipus = null;

        // rendelheto aruk feltoltese
        TermekFeltoltes termekFeltoltes = new TermekFeltoltes();
        termekFeltoltes.TermekKezdetiFeltoltes();
        rendelhetoTermekList = termekFeltoltes.getRendelhetoTermekList();

        // kedvezmenyek feltoltese
        KedvezmenyFeltoltes kedvezmenyFeltoltes = new KedvezmenyFeltoltes();
        kedvezmenyFeltoltes.KedvezmenyKezdetiFeltoltes();
        kedvezmenyList = kedvezmenyFeltoltes.getKedvezmenyList();

        // alkalmazhato kedvezmenyek kiirasa
        System.out.println();
        System.out.println("Alkalmazható kedvezmények");
        int i = 0;
        for (Kedvezmeny egyKedvezmeny : kedvezmenyList) {
            System.out.println(++i + ". " + egyKedvezmeny.getKedvtipSzoveg());
        }

        // darabszam bekeres
        DarabszamBekeres darabszamBekeres = new DarabszamBekeres();
        osszMennyiseg = darabszamBekeres.DarabBeker(rendelhetoTermekList);
        // darabszamBekeres.DarabBeker(rendelhetoTermekList);
        rendeltTermekList = darabszamBekeres.getRendeltTermekList();

        System.out.println();

        // kedvezmeny szamolas
        // if (osszMennyiseg == 0) {
        if (rendeltTermekList.size() == 0) {
            System.out.println("Kosár tartalma: üres");
        } else {

            System.out.println("Kosár tartalma: ");

            for (RendeltTermek egyrend : rendeltTermekList) {

                // bekertMennyiseg = egyrend.getRendeltmenny();

                // eredetiAr += bekertMennyiseg * egyrend.getAr();
                eredetiOsszAr += egyrend.getRendeltmenny() * egyrend.getAr();

                long kiirkedvErtek = 0;
                String kiirkedvTipus = null;

                for (Kedvezmeny egykedvezmeny : kedvezmenyList) {

                    // KedvezmenyK23 kedvk23 = new KedvezmenyK23();
                    // long egyKedvK23Ertek = kedvk23.KedvezmenySzamol(egyrend);
                    // kedvK23Ertek += egykedvK23Ertek;
                    // kedvK23Tipus = kedvk23.toString();

                    // KedvezmenyK12 kedvk12 = new KedvezmenyK12();
                    // long egykedvK12Ertek = kedvk12.KedvezmenySzamol(egyrend);
                    // kedvK12Ertek += egykedvK12Ertek;
                    // kedvK12Tipus = kedvk12.toString();

                    long egykedvErtek = egykedvezmeny.KedvezmenySzamol(egyrend);

                    if (egykedvErtek > 0) {
                        // eltesszuk, hogy melyik kedvezmenynel szamoltunk erteket
                        kiirkedvErtek = egykedvErtek;
                        kiirkedvTipus = egykedvezmeny.getKedvtipSzoveg();
                        // kedvezmeny ertek halmozasa hasonlitashoz
                        egykedvezmeny.setKedvErtekNovel(egykedvErtek);
                    }
                }
                if (kiirkedvErtek > 0) {
                    System.out.println(egyrend.toString() +
                            " (számolt ár: " + egyrend.getRendeltmenny() * egyrend.getAr() + "," +
                            " számolt kedvezmény: " + kiirkedvTipus + ": " + kiirkedvErtek + ")");
                } else {
                    System.out.println(egyrend.toString() +
                            " (számolt ár: " + egyrend.getRendeltmenny() * egyrend.getAr() + ")");
                }
            }
            // melyik kedvezmenyt ervenyesitjuk (ha van)
            /* if (kedvK23Ertek + kedvK12Ertek > 0) {
                if (kedvK23Ertek < kedvK12Ertek) {
                    kedvOsszErtek = kedvK12Ertek;
                    kedvTipus = kedvK12Tipus;
                } else {
                    kedvOsszErtek = kedvK23Ertek;
                    kedvTipus = kedvK23Tipus;
                }
            }
  */
            for (Kedvezmeny egyKedvezmeny : kedvezmenyList) {
                if (egyKedvezmeny.getKedvErtek() > kedvErtek) {
                    kedvErtek = egyKedvezmeny.getKedvErtek();
                    kedvTipus = egyKedvezmeny.getKedvtipSzoveg();
                }
            }

            // kosarAr = eredetiAr - kedvOsszErtek;

            System.out.println();
            if (kedvErtek > 0) {
                System.out.println("Kosárban rendelt termék összesen: " + osszMennyiseg + " db (alkalmazott kedvezmény: " + kedvTipus + ", érték: " + kedvErtek + ")");
            } else {
                System.out.println("Kosárban rendelt termék összesen: " + osszMennyiseg);
            }
            System.out.println("Kosár eredeti ár: " + eredetiOsszAr);
            if (kedvErtek > 0) {
                System.out.println("Kosár kedvezményes ár: " + " (" + eredetiOsszAr + " - " + kedvErtek + ") = " + (eredetiOsszAr - kedvErtek));
                System.out.println("Kosár kedvezmény típusa: " + kedvTipus);
            } else {
                System.out.println("Kosár kedvezményes ár: " + eredetiOsszAr);
                System.out.println("Nincs kedvezmény alkalmazva");
            }

        }

    }
}
