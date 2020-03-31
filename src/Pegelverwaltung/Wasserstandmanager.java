package Pegelverwaltung;

import java.util.ArrayList;

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
            if(gewaesser.equals(w.getGewaesserName())){
                gewaesserListe.add(w);
            }
        }return gewaesserListe;
    }

    @Override
    public String toString() {
        return "Wasserstandmanager{" +
                "wasserstandListe=" + wasserstandListe +
                '}';
    }
}
