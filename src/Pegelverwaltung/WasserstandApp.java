package Pegelverwaltung;

public class WasserstandApp {
    public static void main(String[] args) {
        Wasserstandmanager ws = new Wasserstandmanager();

        ws.addWasserstand(new Wasserstand(3145,"Lahne", 2.3, 3.1, 34567890));
        System.out.println(ws.toString());
        System.out.println(ws.finById(3145));
        System.out.println(ws.findByGewaesser("Lahne"));


    }
}
