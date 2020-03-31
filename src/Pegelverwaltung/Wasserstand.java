package Pegelverwaltung;

public class Wasserstand {
    private int id;
    private String gewaesserName;
    private double messwert;
    private double messwertAlamierung;
    private int sekunden;

    public Wasserstand(int id, String gewaesserName, double messwert, double messwertAlamierung, int sekunden) {
        this.id = id;
        this.gewaesserName = gewaesserName;
        this.messwert = messwert;
        this.messwertAlamierung = messwertAlamierung;
        this.sekunden = sekunden;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public double getMesswert() {
        return messwert;
    }

    public void setMesswert(double messwert) {
        this.messwert = messwert;
    }

    public double getMesswertAlamierung() {
        return messwertAlamierung;
    }

    public void setMesswertAlamierung(double messwertAlamierung) {
        this.messwertAlamierung = messwertAlamierung;
    }

    public int getSekunden() {
        return sekunden;
    }

    public void setSekunden(int sekunden) {
        this.sekunden = sekunden;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", messwert=" + messwert +
                ", messwertAlamierung=" + messwertAlamierung +
                ", sekunden=" + sekunden +
                '}';
    }
}
