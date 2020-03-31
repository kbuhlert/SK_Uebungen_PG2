package Bestellverwaltung;

public class BestellApp {
    public static void main(String[] args) {
        Bestellzeile a = new Bestellzeile("Zucker",2,"Lebensmittel", 2.2);
        Bestellzeile b = new Bestellzeile("Kartoffeln",1,"Lebensmittel", 1.5);
        Bestellzeile c = new Bestellzeile("Saft",5,"Lebensmittel", 7.5);
        Bestellzeile d = new Bestellzeile("Hammer",1,"Werkzeug", 5.0);
        Bestellzeile e = new Bestellzeile("Lauch",3,"Lebensmittel", 3);
        Bestellzeile f = new Bestellzeile("Hobel",1,"Werkzeug", 15.0);
        Bestellzeile g = new Bestellzeile("Puppe",1,"Spielzeug", 25.0);
        Bestellzeile h = new Bestellzeile("Buch",4,"Spielzeug", 37.5);

        Bestellung huberKarl = new Bestellung("#1546");
        huberKarl.addBestellzeile(a);
        huberKarl.addBestellzeile(b);
        huberKarl.addBestellzeile(c);
        huberKarl.addBestellzeile(d);
        huberKarl.addBestellzeile(e);
        huberKarl.addBestellzeile(f);
        huberKarl.addBestellzeile(g);
        huberKarl.addBestellzeile(h);

        huberKarl.printBestellung();
        System.out.println("Kosten" + huberKarl.getKosten());
        System.out.println("HashMap" + huberKarl.getAnzahljeProduktkategorie());
    }
}
