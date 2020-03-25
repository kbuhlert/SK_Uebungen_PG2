package Bsp2_Rezeptverwaltung;

public class RezeptverwaltungApp {
    public static void main(String[] args) {


        Zutat milch = new Zutat("Milch", 200.0);
        Zutat mehl = new Zutat("Mehl", 500.0);
        Zutat eier = new Zutat("Eier", 3.0);
        Zutat[] zutatenliste = new Zutat[]{milch, mehl, eier};

        Rezept eierkuchen = new Rezept("Eierkuchen", 2, zutatenliste);
        eierkuchen.printRezept();
        System.out.println("Das Gesamtgewicht der Eierkuchenbeträgt: " + eierkuchen.gesamtGewicht());
        System.out.println("-----");
        eierkuchen.umrechnen(8);
        eierkuchen.printRezept();

        System.out.println("-----");
        System.out.println("Das Gesamtgewicht der Eierkuchenbeträgt: " + eierkuchen.gesamtGewicht());


    }
}
