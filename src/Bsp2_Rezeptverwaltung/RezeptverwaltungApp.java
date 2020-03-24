package Bsp2_Rezeptverwaltung;

public class RezeptverwaltungApp {
    Zutat milch = new Zutat("Milch", 200);
    Zutat mehl = new Zutat("Mehl", 500);
    Zutat eier = new Zutat("Eier", 3);
    Zutat[] zutatenliste = new Zutat[]{milch,mehl,eier};

    Rezept eierkuchen = new Rezept("Eierkuchen",2,zutatenliste);
    

}
