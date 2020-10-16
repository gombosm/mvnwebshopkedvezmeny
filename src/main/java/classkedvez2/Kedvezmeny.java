package classkedvez2;

public abstract class Kedvezmeny {
    private String kedvtip;         // "K12", "K23"
    private String kedvtipSzoveg;   // "(K12) megapack -6000", "(K23) 2=3: kettőt fizet, hármat kap"
    private int darabszam;          // 3;
    private int kartonszam;         // 12;
    private long egykedv;           // 6000;

    private long kedvErtek;

    public Kedvezmeny(String kedvtip, String kedvtipSzoveg, int darabszam) {
        this.kedvtip = kedvtip;
        this.kedvtipSzoveg = kedvtipSzoveg;
        this.darabszam = darabszam;
    }

    public Kedvezmeny(String kedvtip, String kedvtipSzoveg, int kartonszam, long egykedv) {
        this.kedvtip = kedvtip;
        this.kedvtipSzoveg = kedvtipSzoveg;
        this.kartonszam = kartonszam;
        this.egykedv = egykedv;
    }

    protected abstract long KedvezmenySzamol(RendeltTermek egyRendeltTermek);

    public String getKedvtip() {
        return kedvtip;
    }

    public String getKedvtipSzoveg() {
        return kedvtipSzoveg;
    }

    public int getDarabszam() {
        return darabszam;
    }

    public int getKartonszam() {
        return kartonszam;
    }

    public long getEgykedv() {
        return egykedv;
    }

    public long getKedvErtek() {
        return kedvErtek;
    }

    public void setKedvErtekNovel(long kedvErtek) {
        this.kedvErtek += kedvErtek;
    }

    @Override
    public abstract String toString();
}
