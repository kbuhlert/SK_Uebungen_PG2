package EventKalender;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
   ArrayList<Event> events = new ArrayList<Event>();

   public void addEvent (Event event){
       events.add(event);
   }

   public Event getByTitle (String title){
       for(Event event : events){
           if(event.getTitle().equals(title)){
               return event;
           }
       }return null;
   }

    public ArrayList<Event> getByOrt(String ort) {
       ArrayList<Event> nachOrt = new ArrayList<Event>();
       for(Event event : events){
           if(event.getOrt().equals(ort)){
               nachOrt.add(event);
           }
       }
        return nachOrt;
    }
    public ArrayList<Event> getByEintrittspreis(double min, double max) {
        ArrayList<Event> nachPreis = new ArrayList<Event>();
        for(Event event : events){
        if (event.getEintrittspreis()>= min && event.getEintrittspreis()<= max){
            nachPreis.add(event);
        }
        }return nachPreis;
    }
    public Event getMostexpensiveByOrt (String ort) {
        ArrayList<Event> mostExpensiveImOrt = getByOrt(ort);
        double preisvergleich = 0;
        for (Event event : mostExpensiveImOrt) {                //sucht den höchsten Preis und speichert ihn als preisvergleich
            if (preisvergleich <= event.getEintrittspreis()) {
                preisvergleich = event.getEintrittspreis();
            }
        }
        for (Event event : mostExpensiveImOrt) {                //vergleicht jetzt die Eventpreise im Array und gibt das Events mit höchstem Preis aus
            if (preisvergleich == event.getEintrittspreis()) {
                return event; }
            }return null;
    }

    public double getAvgPreisByOrt (String ort){
        ArrayList<Event> avgPreisImOrt = getByOrt(ort);
        double avgPreisOrt=0;
        int count = 0;
       for (Event event:avgPreisImOrt){
           avgPreisOrt = avgPreisOrt +event.getEintrittspreis();
           count++;
       }
       avgPreisOrt = avgPreisOrt/count;
       return avgPreisOrt;
    }

    public HashMap<String,Integer> getCountEventsByOrt (){
       HashMap<String, Integer> eventsImOrtMap = new HashMap<>();
       for(Event event:events){
           int eventzahl = 0;
           if(eventsImOrtMap.containsKey(event.getOrt())){
               eventzahl = eventsImOrtMap.get(event.getOrt()) + 1;
               eventsImOrtMap.put(event.getOrt(),eventzahl);
           }else{eventsImOrtMap.put(event.getOrt(),1);}
       }
       return eventsImOrtMap;
    }

    @Override
    public String toString() {
        return "EventKalender{" +
                "events=" + events +
                '}';
    }
}
