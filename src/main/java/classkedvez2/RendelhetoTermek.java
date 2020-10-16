package classkedvez2;

public class RendelhetoTermek {

    // nem lehet static egyik sem, mert a listaba csak az utolso peldany (new) ertekei kerulnenek!
    // private static String nev;
    private String nev;
    private long ar;
    private String kedvtip;

    public RendelhetoTermek(String nev, long ar, String kedvtip) {
        this.nev = nev;
        this.ar = ar;
        this.kedvtip = kedvtip;
    }

    public String getNev() {
        return this.nev;
    }

    public long getAr() {
        return this.ar;
    }

    public String getKedvtip() {
        return this.kedvtip;
    }

    public String toString() {
        return "Rendelhető termék: " + getNev() + " (egységár: " + getAr() + ", kedv.típus: " + getKedvtip() + ")";
    }
}
