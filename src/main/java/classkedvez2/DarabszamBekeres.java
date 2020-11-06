package classkedvez2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DarabszamBekeres {
    // darabszam bekeres
    private List<RendeltTermek> rendeltTermekList = new ArrayList<>();

    public DarabszamBekeres() {
    }

    public int DarabBeker(List<RendelhetoTermek> rendelhetoTermekList) {
    // public void DarabBeker(List<RendelhetoTermek> rendelhetoTermekList) {

        System.out.println();
        System.out.println("Kérem termékenként adja meg a rendelt mennyiséget (adjon 0 darabot, ha nem kéri): ");
        System.out.println("Rendelhető termékek");
        int rendeltMenny = 0;
        int osszMennyiseg = 0;

        Scanner scanner = new Scanner(System.in);

        for (RendelhetoTermek rendelhetoTermek : rendelhetoTermekList) {
            // System.out.println(rendelhetoTermek.getNev() + " (Ár: " + rendelhetoTermek.getAr() + ", Kedv.tipus: " + rendelhetoTermek.getKedvtip() + ")");
            System.out.println(rendelhetoTermek.toString());

            try {
                rendeltMenny = scanner.nextInt();
            } catch (InputMismatchException ex) {
                throw new InputMismatchException("Hibás egész számot adott meg!");
            }

            if (rendeltMenny > 0) {
                rendeltTermekList.add(new RendeltTermek(rendelhetoTermek.getNev(), rendelhetoTermek.getAr(), rendelhetoTermek.getKedvtip(), rendeltMenny));
                osszMennyiseg += rendeltMenny;
            } else {
                if (rendeltMenny < 0) {
                } else {
                    if (rendeltMenny == 0) {
                    }
                }
            }
        }
        return osszMennyiseg;
    }

    public List<RendeltTermek> getRendeltTermekList() {
        // uj listat adok vissza
        return new ArrayList<>(rendeltTermekList);
    }
}
