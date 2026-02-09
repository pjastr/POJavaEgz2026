package football;

import java.util.ArrayList;

public class TestPlayer {

    static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("John", "AA", 60));
        players.add(new Player("Jane", "ZZ", 60));
        players.add(new Player("Annam", "WW", 60));
        players.add(new Player("Jennie", "ZZ", 34));
        players.add(new Player("Jane", "ZZ", 77));
        players.sort(null);
        for(var elem: players){
            System.out.println(elem);
        }

    }
}
