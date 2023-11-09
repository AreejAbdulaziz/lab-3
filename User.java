import java.util.ArrayList;

public class User {
    private String username;
    private String email;

    private ArrayList<Media> purchasedMediaList=new ArrayList<>();
    private ArrayList<Media> shoppingCart=new ArrayList<>();

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void addToCart(Media media){
        shoppingCart.add(media);
    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }
    public void checkout(){
        for (Media m: shoppingCart) {
            purchasedMediaList.add(m);
            shoppingCart.remove(m);
        }
    }
}
