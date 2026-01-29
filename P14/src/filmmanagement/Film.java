package filmmanagement;

public class Film {
    private int filmId;
    private String title;
    private int duration;

    public Film(int filmId, String title, int duration) {
        this.filmId = filmId >=0 ? filmId : 0;
        this.title = title != null ? title : "";
        this.duration = duration >=0 ? duration : 0;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId >=0 ? filmId : 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title != null ? title : "";
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration >=0 ? duration : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;
        return filmId == film.filmId && duration == film.duration && title.equals(film.title);
    }

    @Override
    public int hashCode() {
        int result = filmId;
        result = 31 * result + title.hashCode();
        result = 31 * result + duration;
        return result;
    }
}
