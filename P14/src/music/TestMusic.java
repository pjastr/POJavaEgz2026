package music;

import java.util.Arrays;

public class TestMusic {

    static void main(String[] args) {
        Song song1 = new Song(100, 10);
        Song song4  = new Song(400, 40);
        Song song2 = new Song(200, 20);
        Song song3 = new Song(300, 30);
        Song[] songs = {song1, song2, song3};
        System.out.println(median(songs));
    }

    public static <T extends Comparable<T>> T median(T[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array cannot be null or empty");

        Arrays.sort(arr);
        return arr[(arr.length-1) / 2];
    }
}
