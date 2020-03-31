package Pegelverwaltung;

import java.util.ArrayList;
import java.util.HashMap;

public class Wasserstandmanager {
    private ArrayList<Wasserstand> wasserstandListe = new ArrayList<>();

    public void addWasserstand (Wasserstand a){
        wasserstandListe.add(a);
    }

    public Wasserstand finById (int id){
        for(Wasserstand w : wasserstandListe){
            if(w.getId() == id){
                return w;
            }
        }return null;
    }

    public ArrayList<Wasserstand> findByGewaesser (String gewaesserName){
        ArrayList<Wasserstand> gewaesserListe = new ArrayList<>();
        for (Wasserstand w:wasserstandListe){
            String gewaesser = w.getGewaesserName();
            if(gewaesser.equals(gewaesserName)){
                gewaesserListe.add(w);
            }
        }return gewaesserListe;
    }

    public Wasserstand findHoechstWasserstand (String gewaesserName){
        ArrayList<Wasserstand> gewaesserListe = findByGewaesser(gewaesserName);
        double wasserst = 0;
        for(Wasserstand w:gewaesserListe){
            if(wasserst<w.getMesswert()){
                wasserst = w.getMesswert();
            }
        }
        for(Wasserstand w:gewaesserListe){
            if(wasserst == w.getMesswert()){
                return w;
            }
        } return null;
    }

    public HashMap<String,Double> getSummeWasserAlleGewaesser(){
        HashMap<String,Double> summeWasserstaende = new HashMap<>();
        for(Wasserstand w:wasserstandListe){
            double summe;
            if(summeWasserstaende.containsKey(w.getGewaesserName())){
                 summe = summeWasserstaende.get(w.getGewaesserName());
                 summe = summe + w.getMesswert();
                 summeWasserstaende.put(w.getGewaesserName(),summe);
            }else{summeWasserstaende.put(w.getGewaesserName(),w.getMesswert());}
        }
        return summeWasserstaende;
    }

    @Override
    public String toString() {
        return "Wasserstandmanager{" +
                "wasserstandListe=" + wasserstandListe +
                '}';
    }
}
