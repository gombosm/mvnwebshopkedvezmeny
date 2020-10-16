package classkedvez2;

public class RendeltTermek extends RendelhetoTermek {
    // nem lehet static, mert a listaba csak az utolso peldany (new) ertekei kerulnenek!
    // private static int rendeltmenny;
    private int rendeltmenny;

    public RendeltTermek(String nev, long ar, String kedvtip, int rendeltmenny) {
        super(nev, ar, kedvtip);
        this.rendeltmenny = rendeltmenny;
    }

    public int getRendeltmenny() {
        return rendeltmenny;
    }

    public String toString() {
        return "Rendelt termék: " + getRendeltmenny() + " db " + getNev() + " (egységár: " + getAr() + ", kedv.típus: " + getKedvtip() + ")";
    }
}
