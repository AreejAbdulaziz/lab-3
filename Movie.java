import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    public Movie(int duration,String title,String auteur,String ISBN,double price) {
        super(title,auteur,ISBN,price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user){
        System.out.println("user :"+user.getUsername());
    }
    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        ArrayList<Movie>movies=new ArrayList<>();
        for(Movie m:movieCatalog){
            if(m.getAuteur().equals(getAuteur())&&!m.getTitle().equals(getTitle())){
                movies.add(m);
            }
        }return movies;
    }

    @Override
    public String getMediaType() {
        if(duration>=120){
            return "long movie";

        }else return "movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}
