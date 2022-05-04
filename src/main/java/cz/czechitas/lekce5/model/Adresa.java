package cz.czechitas.lekce5.model;

public class Adresa {
    private String uliceACisla;
    private String obec;
    private int psc;

    public Adresa() {
    }

    public Adresa(String uliceACisla, String obec, int psc) {
        this.uliceACisla = uliceACisla;
        this.obec = obec;
        this.psc = psc;
    }

    public String getUliceACisla() {
        return uliceACisla;
    }

    public void setUliceACisla(String uliceACisla) {
        this.uliceACisla = uliceACisla;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public int getPsc() {
        return psc;
    }

    public void setPsc(int psc) {
        this.psc = psc;
    }

    @Override
    public String toString() {
        return uliceACisla + ", " + obec + ", " + psc;
    }
}
