package classkedvez2;

public class KedvezmenyK12 extends Kedvezmeny {
    public KedvezmenyK12(String kedvtip, String kedvtipSzoveg, int kartonszam, long egykedv) {
        super(kedvtip, kedvtipSzoveg, kartonszam, egykedv);
    }

    @Override
    protected long KedvezmenySzamol(RendeltTermek egyRendeltTermek) {
        long szamoltKedvezmeny = 0;
        if (getKedvtip().equals(egyRendeltTermek.getKedvtip())) {
            szamoltKedvezmeny = (long) (int) (egyRendeltTermek.getRendeltmenny() / getKartonszam()) * getEgykedv();
        }
        return szamoltKedvezmeny;
    }

    @Override
    public final String toString() {
        return this.getKedvtipSzoveg();
    }
}
