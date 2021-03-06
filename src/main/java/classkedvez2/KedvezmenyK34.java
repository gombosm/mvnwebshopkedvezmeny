package classkedvez2;

public class KedvezmenyK34 extends Kedvezmeny {
    public KedvezmenyK34(String kedvtip, String kedvtipSzoveg, int darabszam) {
        super(kedvtip, kedvtipSzoveg, darabszam);
    }

    @Override
    protected long KedvezmenySzamol(RendeltTermek egyRendeltTermek) {
        long szamoltKedvezmeny = 0;
        if (getKedvtip().equals(egyRendeltTermek.getKedvtip())) {
            szamoltKedvezmeny = (long) (int) (egyRendeltTermek.getRendeltmenny() / getDarabszam()) * egyRendeltTermek.getAr();
        }
        return szamoltKedvezmeny;
    }

    @Override
    public final String toString() {
        return this.getKedvtipSzoveg();
    }
}
