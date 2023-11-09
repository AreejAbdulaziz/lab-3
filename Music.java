import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String Artist;


    public Music(String artist,String title,String auteur,String ISBN,double price) {
        super(title,auteur,ISBN,price);
        Artist = artist;
    }

    public void listen(User user){
        System.out.println("user :"+user.getUsername());
}
public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog){
ArrayList<Music>playList=new ArrayList<>();
        for(Music m:musicCatalog){
            if(m.Artist.equals(Artist)){
                playList.add(m);
            }
        }return playList;
}

    public String getMediaType() {
        if(getPrice()>=10)
            return "premium music";
        else return "music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "Artist='" + Artist + '\'' +
                '}';
    }
}
