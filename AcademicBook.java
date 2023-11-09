public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(int stock,String title,String auteur,String ISBN,double price) {
        super(stock,title,auteur,ISBN,price);
    }

    @Override
    public String getMediaType() {
        if(getAverageRating()>=4.5)
            return "Bestselling AcademicBook";
        else return "AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
