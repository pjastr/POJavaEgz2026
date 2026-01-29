package filmmanagementv2;

public class FilmScreening {

    private String cinemaName;
    private Film film;
    private int audienceCount;

    public FilmScreening(String cinemaName, Film film, int audienceCount) throws CloneNotSupportedException {
        this.cinemaName = cinemaName != null ? cinemaName : "";
        this.film = film != null ? film.clone() : new Film(0, "", 0);
        this.audienceCount = audienceCount >=0 ? audienceCount : 0;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName != null ? cinemaName : "";
    }

    public Film getFilm() throws CloneNotSupportedException {
        return film.clone();
    }

    public void setFilm(Film film) throws CloneNotSupportedException {
        this.film = film != null ? film.clone() : new Film(0, "", 0);
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(int audienceCount) {
        this.audienceCount = audienceCount >=0 ? audienceCount : 0;
    }

    @Override
    public String toString() {
        return "FilmScreening{" +
                "cinemaName='" + cinemaName + '\'' +
                ", film=" + film +
                ", audienceCount=" + audienceCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        FilmScreening that = (FilmScreening) o;
        return audienceCount == that.audienceCount && cinemaName.equals(that.cinemaName) && film.equals(that.film);
    }

    @Override
    public int hashCode() {
        int result = cinemaName.hashCode();
        result = 31 * result + film.hashCode();
        result = 31 * result + audienceCount;
        return result;
    }
}
