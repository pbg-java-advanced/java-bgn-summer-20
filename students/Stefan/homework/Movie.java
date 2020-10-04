package homework;

public class Movie {
    private String movieName;
    private String movieProducer;
    private double movieLength;
    private String movieGenre;
    private int movieYear;
    private double moviePrice;

    public Movie(String movieName, String movieProducer, double movieLength, String movieGenre, int movieYear, double moviePrice) {
        this.movieName = movieName;
        this.movieProducer = movieProducer;
        this.movieLength = movieLength;
        this.movieGenre = movieGenre;
        this.movieYear = movieYear;
        this.moviePrice = moviePrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieProducer() {
        return movieProducer;
    }

    public void setMovieProducer(String movieProducer) {
        this.movieProducer = movieProducer;
    }

    public double getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(double movieLength) {
        this.movieLength = movieLength;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }
}
