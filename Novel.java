public class Novel extends Book {
    private String genre;

    public Novel(int stock,String title,String auteur,String ISBN,double price) {
        super(stock,title,auteur,ISBN,price);
    }

    @Override
    public String getMediaType() {
        if(getAverageRating()>=4.5)
            return "Bestselling Novel";
        else return "Novel";
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
