package Bestellverwaltung;

import java.util.ArrayList;
import java.util.HashMap;

public class Bestellung {
    private String bestellnr;
    private ArrayList<Bestellzeile> bestellListe = new ArrayList<>();

    public Bestellung(String bestellnr) {
        this.bestellnr = bestellnr;
    }

    public void addBestellzeile(Bestellzeile b){
        bestellListe.add(b);
    }

    public void printBestellung(){
        System.out.println("Bestellnumer: " + bestellnr);
        System.out.println("Bestellzeilen: ");
        for (Bestellzeile zeile:bestellListe) {
            System.out.println(zeile);
        }
    }

    public double getKosten (){
        double kosten = 0;
        for(Bestellzeile zeile:bestellListe){
           kosten = kosten + zeile.getKosten();
        }
        return kosten;
    }

    public HashMap<String,Integer> getAnzahljeProduktkategorie(){
        HashMap<String,Integer> kategorieHashM = new HashMap<>();
        for(Bestellzeile bestellung:bestellListe){
            if(kategorieHashM.containsKey(bestellung.getProduktkategorie())){
                Integer aktuelleMenge = kategorieHashM.get(bestellung.getProduktkategorie());//die Menge die dem Key 'Produktkategorie' im HashMap zugeordnet ist
                aktuelleMenge = aktuelleMenge + bestellung.getMenge();//neuer Mengenwert. Die Menge der Bestellung aus Bestellliste (ArrayList) wird zugerechnet
                kategorieHashM.put(bestellung.getProduktkategorie(), aktuelleMenge);//gibt neue Menge zum Key 'Produktkategorie' in den HashMap
            }else {kategorieHashM.put(bestellung.getProduktkategorie(),bestellung.getMenge());}
        }
        return kategorieHashM;
    }

    public String getBestellnr() {
        return bestellnr;
    }

    public ArrayList<Bestellzeile> getBestellListe() {
        return bestellListe;
    }
}
