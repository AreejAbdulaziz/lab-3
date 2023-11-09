import java.util.ArrayList;

public class Book extends Media{

    private int stock;
    private ArrayList<Review> reviews=new ArrayList<>();

    public Book(int stock, String title,String auteur,String ISBN,double price) {
        super(title,auteur,ISBN,price);
        this.stock = stock;
        this.reviews = reviews;
    }


    public void addReview(Review review){
        reviews.add(review);
    }
    public double getAverageRating(){
        double x=0;
        for(Review r:reviews){
            x=x+r.getRating();
        }
        return x/reviews.size();
    }

    public void purchase(User user) {
        user.getPurchasedMediaList().add(this); //يضيف الكتاب عرفناه بكلمة ذس
        if (stock > 0) {
            stock=stock-1;
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity){
        stock=stock+quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()>=4.5) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }
}
