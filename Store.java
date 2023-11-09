import java.util.ArrayList;

public class Store {
    private ArrayList<User> users=new ArrayList<>(); //تعتبر انواعهم اوبجكت
    private ArrayList<Media> medias=new ArrayList<>();;

    public void addUser(User user){
        users.add(user);
    }
    public void displayUsers(){
        for(User u: users){
            System.out.println(u.getUsername()+" "+u.getEmail()); //قت لانه برايفت لازم قت عشان اجيبه
        }
    }
    public void addMedia(Media media){
        medias.add(media);
    }
    public void displayMedia(){
        for(Media m: medias){
            System.out.println(m.getAuteur()+" "+m.getISBN()+" "+m.getPrice()+" "+m.getTitle()); //قت لانه برايفت لازم قت عشان اجيبه
        }
    }
    public Media searchBook(String title) //بدور عن الكتاب في الميديا ماعندي للبوك
    {
        for(Media m:medias){
            if(m.getTitle().equals(title))
              return m;

        }
      return null;
    }
}
