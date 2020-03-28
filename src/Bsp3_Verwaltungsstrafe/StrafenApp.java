package Bsp3_Verwaltungsstrafe;

public class StrafenApp {
    public static void main(String[] args) {
        Strafen herrMueller = new Strafen("Johann", "Mueller", "G-IS-715");

        herrMueller.strafekosten(100); //Herr Müller ist 100 kmh schneller als erlaubt gefahren
        herrMueller.verbandskasten(false); // Herr Müller hatte keinen Verbandskasten dabei
        herrMueller.alkohol(1.8);     // er hatte einen stark erhöhten Promillewert von 1.8
        herrMueller.sonstiges(20); //er war nicht kooperativ und hat eine Ordnungstrafe in Höhe von 20€ bekommen


        System.out.println(herrMueller.getVorname() + " " + herrMueller.getNachname() + " muss eine Strafe in Höhe von " + herrMueller.getStrafe() + " € zahlen.");
        System.out.println("Anzahl der Strafpunkte: " + herrMueller.getAnzahl());

    }
}
