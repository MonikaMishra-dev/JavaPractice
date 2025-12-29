package java8.FunctionalInterfaces.consumer;

public class Movie {
    String movieName;
    String actorName;
    String actressName;
    String rating;

    public Movie(String movieName, String actorName, String actressName, String rating) {
        this.movieName = movieName;
        this.actorName = actorName;
        this.actressName = actressName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", actressName='" + actressName + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
