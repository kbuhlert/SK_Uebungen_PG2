package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTrial {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> telefonbuch = new HashMap<>();

        telefonbuch.put("Kerstin J", new ArrayList<>());
        telefonbuch.put("Helmut J", new ArrayList<>());
        telefonbuch.put("Jakob J", new ArrayList<>());
        telefonbuch.put("Woody J", new ArrayList<>());

        telefonbuch.get("Helmut J").add("fest: 07191 1234");
        telefonbuch.get("Helmut J").add("mobil: 0664 12345");
        telefonbuch.get("Helmut J").add("arbeit: 0316 380 12234");
        telefonbuch.get("Kerstin J").add("fest: 0316 124556");

        System.out.println(telefonbuch);
        for(String nutzer : telefonbuch.keySet()){          //ich kann über for-schleife auf jeden einzelnen Key zugreifen und den dazugehörigen Wert ausdrucken
            System.out.println(nutzer + ": " + telefonbuch.get(nutzer));
        }

    }
}
