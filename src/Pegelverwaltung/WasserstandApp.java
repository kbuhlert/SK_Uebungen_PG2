package Pegelverwaltung;

public class WasserstandApp {
    public static void main(String[] args) {
        Wasserstandmanager ws = new Wasserstandmanager();

        ws.addWasserstand(new Wasserstand(3145,"Lahne", 2.3, 3.1, 3456));
        ws.addWasserstand(new Wasserstand(3146,"Lahne", 3.3, 3.1, 3460));
        ws.addWasserstand(new Wasserstand(3147,"Donau", 4.3, 5.1, 3480));
        System.out.println(ws.toString());
        System.out.println(ws.finById(3145));
        System.out.println("Gewaesser nach Name: " + ws.findByGewaesser("Lahne"));
        System.out.println("Höchstwasser: " + ws.findHoechstWasserstand("Lahne"));
        System.out.println("Wasserstandssummen: " + ws.getSummeWasserAlleGewaesser());



    }
}
