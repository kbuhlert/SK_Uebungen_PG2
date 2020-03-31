package EventKalender;

public class EventApp {
    public static void main(String[] args) {
        Event a = new Event("Osterfeier", "Graz", 4.5);
        Event b = new Event("Lets Dance", "Graz", 10.5);
        Event c = new Event("Flohmarkt", "Bruck", 1.5);
        Event d = new Event("Konzert", "Graz", 14.5);
        Event e = new Event("Party", "Hartberg", 1.5);

        EventKalender april2010 = new EventKalender();
        april2010.addEvent(a);
        april2010.addEvent(b);
        april2010.addEvent(c);
        april2010.addEvent(d);
        april2010.addEvent(e);

        System.out.println("Durchschnittspreis in Graz: " + april2010.getAvgPreisByOrt("Graz"));
        System.out.println("Events von 4 bis 14€: " + april2010.getByEintrittspreis(4,14));
        System.out.println("Events in Graz: " + april2010.getByOrt("Graz"));
        System.out.println("Höchstpreis in Graz: " + april2010.getMostexpensiveByOrt("Graz"));
        System.out.println("HashMap Eventzahl nach Ort: " + april2010.getCountEventsByOrt());
    }
}
