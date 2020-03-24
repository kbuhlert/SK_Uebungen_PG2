package Bsp2_Rezeptverwaltung;

public class Rezept {
    public String name;
    public int personenzahl;
    public Zutat[] zutatenliste = new Zutat[3];

    public Rezept(String name, int personenzahl, Zutat[] zutatenliste) {
        this.name = name;
        this.personenzahl = personenzahl;
        this.zutatenliste = zutatenliste;
    }


    public void printRezept() {
        System.out.println("Rezeptname: " + name);
        System.out.println("Personenzahl: " + personenzahl);
        for (Zutat element : zutatenliste) {
            element.print();
        }
    }

    public void umrechnen(int neuePersonenzahl) {
        for (Zutat element : zutatenliste) {
            element.menge = element.menge / personenzahl * neuePersonenzahl;
        }
    }

    public double gesamtGewicht() {
        double gesamtgewicht = 0.0;
        for (Zutat element : zutatenliste) {
            gesamtgewicht = gesamtgewicht + element.menge;
        }
        return gesamtgewicht;
    }
}
