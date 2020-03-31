package Bestellverwaltung;

public class Bestellzeile {
    private String name;
    private int menge;
    private String produktkategorie;
    private double preis;

    public Bestellzeile(String name, int menge, String produktkategorie, double preis) {
        this.name = name;
        this.menge = menge;
        this.produktkategorie = produktkategorie;
        this.preis = preis;
    }

    public double getKosten(){
        double kosten = 0;
        kosten = menge*preis;
        return kosten;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public String getProduktkategorie() {
        return produktkategorie;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                ", produktkategorie='" + produktkategorie + '\'' +
                ", preis=" + preis +
                '}';
    }
}
