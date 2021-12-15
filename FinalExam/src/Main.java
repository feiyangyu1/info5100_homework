import java.lang.management.MonitorInfo;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

    public static void main(String[] args) {
	  int[][] room = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
      Roomba robot = new Roomba(room);

      String[]  strs = {"eat","tea","tan","ate","nat","bat"};
      List<List<String>> a  = Q2.anagramGroup(strs);
      System.out.println(a);

      int[] nums= {1,2,3};
      System.out.println(Q3.equalSum(nums,3));

       ArrayList<String> alist = new ArrayList<String>();
       alist.add("aa");
       alist.add("ab");
        ArrayList<String> blist = new ArrayList<String>();
        alist.add("ba");
        alist.add("bb");
        ArrayList<String> clist = new ArrayList<String>();
        alist.add("ca");
        alist.add("cb");
        ArrayList<String> dlist = new ArrayList<String>();
        alist.add("da");
        alist.add("db");
       Movie amovie = new Movie("a", new GregorianCalendar(1999, Calendar.JANUARY,10),
              alist, "BJACK");
        Movie bmovie = new Movie("b", new GregorianCalendar(2002, Calendar.JULY,18),
                alist, "AJACK");
        Movie cmovie = new Movie("c", new GregorianCalendar(2010, Calendar.FEBRUARY,9),
                alist, "AJACK");
        Movie dmovie = new Movie("d", new GregorianCalendar(2020, Calendar.DECEMBER,20),
                alist, "AJACK");
        ArrayList<Movie> aGenreList = new ArrayList<Movie>();
        aGenreList.add(amovie);
        aGenreList.add(dmovie);
        ArrayList<Movie> bGenreList = new ArrayList<Movie>();
        bGenreList.add(bmovie);
        bGenreList.add(cmovie);
        Genre agenre = new Genre("agenre", aGenreList);
        Genre bgenre = new Genre("bgenre", bGenreList);
        ArrayList<Genre> NetflixList = new ArrayList<Genre>();
        NetflixList.add(agenre);
        NetflixList.add(bgenre);
        Netflix netflix = new Netflix("netflix", NetflixList);

        System.out.println("---------");

        netflix.netflixList.stream()
                .flatMap(genre -> genre.getGenres().stream())
                .filter(movie -> movie.releaseDate.getWeekYear() <= 2000)
                .map(movie -> movie.title = "(Classic)" + movie.title)
                .forEach(System.out::println);
        System.out.println("---------");


        netflix.netflixList.stream()
                .flatMap(genre -> genre.getGenres().stream())
                .sorted((m1,m2) -> m2.releaseDate.compareTo(m1.releaseDate))
                .limit(3)
                .forEach(movie -> System.out.println(movie.title));
        System.out.println("---------");


        IntPredicate aPredicate = i -> i<2000;
        IntPredicate BPredicate = i -> i>1990;

        netflix.netflixList.stream()
                .flatMap(genre -> genre.getGenres().stream())
                .filter(movie -> aPredicate.and(BPredicate).test(movie.releaseDate.getWeekYear()))
                .forEach(movie -> System.out.println(movie.title));
        System.out.println("---------");

        Function<Movie, String> addYearToTitle = (Movie movie) -> {
            int year = movie.releaseDate.get(1);
            movie.title = year + ""+movie.title;
            return movie.title;
        };
        System.out.println(addYearToTitle.apply(amovie));
        System.out.println(addYearToTitle.apply(bmovie));
        System.out.println(addYearToTitle.apply(cmovie));
        System.out.println(addYearToTitle.apply(dmovie));


        System.out.println("---------");


        netflix.netflixList.stream()
                .flatMap(genre -> genre.getGenres().stream())
                .sorted((m1,m2) -> {
                   return m1.title.compareTo(m2.title);
                })
                .forEach(movie -> System.out.println(movie.title));


    }


}
