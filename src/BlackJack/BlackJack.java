package BlackJack;

import java.util.HashMap;

public class BlackJack {
    private HashMap<Player,Integer> players = new HashMap<Player, Integer>();


    public boolean addPlayer (Player newPlayer){
    for(Player p:players.keySet()){
        if (players.containsKey(newPlayer))
            return false;
    }
    players.put(newPlayer,0);
    return true;
    }

}
