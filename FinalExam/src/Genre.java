import java.util.ArrayList;

public class Genre {
    public String name;
    public ArrayList<Movie> genres;

    public Genre(String name, ArrayList<Movie> genres){
        this.name = name;
        this.genres = genres;
    }
    public ArrayList<Movie> getGenres(){
        return genres;
    }

}
