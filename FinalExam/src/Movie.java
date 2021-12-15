import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Movie {
    public String title;
    public GregorianCalendar releaseDate;
    public ArrayList<String> actorList;
    public String director;

    public Movie(String title, GregorianCalendar releaseDate, ArrayList<String> actorList, String director){
        this.title = title;
        this.releaseDate = releaseDate;
        this.actorList = actorList;
        this.director = director;
    }

}
