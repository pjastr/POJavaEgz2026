package football;

public record Player(String name, String club, int goals)  implements Comparable<Player>{

    @Override
    public int compareTo(Player obj) {
        int base = Integer.compare(this.goals, obj.goals);
        if (base != 0)
            return base;
        return obj.name.compareTo(this.name);
    }
}
