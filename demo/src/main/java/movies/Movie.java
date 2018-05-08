package movies;

public class Movie {

  private long id;
  private String title;
  private String director;
  private String cast;

  public Movie(long id, String title, String director, String cast) {
    this.id = id;
    this.title = title;
    this.director = director;
    this.cast = cast;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDirector() {
    return director;
  }

  public String getCast() {
    return cast;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void getDirector(String director) {
    this.director = director;
  }

  public void getCast(String Cast) {
    this.cast = cast;
  }
}
