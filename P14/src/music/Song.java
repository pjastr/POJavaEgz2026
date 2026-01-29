package music;

public class Song implements Comparable<Song>{

    private double duration;
    private int popularity;

    public Song(double duration, int popularity) {
        this.duration = duration;
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Song{" +
                "duration=" + duration +
                ", popularity=" + popularity +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        int base  = Double.compare(this.duration, o.duration);
        if (base != 0)
            return base;
        return Integer.compare(this.popularity, o.popularity);
    }
}
