package filmmanagement;

public class TestFilmScreening {

    static void main(String[] args) {
        FilmScreening filmScreening = new FilmScreening("Cinema 1", new Film(1, "Film 1", 120), 100);
        System.out.println(filmScreening);

        FilmScreening filmScreening2 = new FilmScreening("Cinema 2", new Film(2, "Film 2", 100), 120);
        System.out.println(filmScreening2);

        FilmScreening filmScreening3 = new FilmScreening("Cinema 1", new Film(1, "Film 1", 120), 100);
        System.out.println(filmScreening3);

        System.out.println(filmScreening.equals(filmScreening2));
        System.out.println(filmScreening.equals(filmScreening3));
        System.out.println(filmScreening.hashCode());
        System.out.println(filmScreening3.hashCode());
    }
}
