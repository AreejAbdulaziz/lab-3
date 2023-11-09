import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Store s1=new Store();
        User u1=new User("Areej","roro@gmail.com");
        User u2=new User("Sarah","soso@gmail.com");
        s1.addUser(u1);
        s1.addUser(u2);
        s1.displayUsers();
        Book b1=new Book(30,"life","Ahmed","2234",77.0);
        Book b2=new Book(99,"Science","Norah","3324",99.0);
        s1.addMedia(b1);
        s1.addMedia(b2);
        s1.displayMedia();
//        s1.searchBook("life");
        System.out.println(s1.searchBook("life"));
        Review review1=new Review("Areej",4,"great");
        Review review2=new Review("Norah",3,"good");
        b1.addReview(review1);
        b1.addReview(review2);
        System.out.println(b1.getAverageRating());
        b1.isBestseller();
        System.out.println(b1.isBestseller());
        b2.restock(50);
        b2.getMediaType();
        System.out.println(b2.getMediaType());
        Movie m1=new Movie(120,"Saw","Salma","7677",99);
        Movie m2=new Movie(100,"ggg","Salma","4438",45);
        Movie m3=new Movie(200,"lll","Walaah","9839",120);
        Movie m4=new Movie(160,"kkk","Salma","8787",120);
        ArrayList<Movie> movieCatalog=new ArrayList<>();
        movieCatalog.add(m4);
        movieCatalog.add(m3);
        movieCatalog.add(m2);
        System.out.println(movieCatalog);
        System.out.println(m1.recommendSimilarMovies(movieCatalog)); //عشان الريترن لازم جوا جملة الطباعه
    }
}