import java.time.LocalDate;
import java.util.Date;

public class Books {
    private String name;
    private String author;
    Establishment establishment;
    private LocalDate date;
    private int pageNumber;
    private int price;
    public Books (String name, String author,Establishment establishment1,LocalDate date){
        this.name = name;
        this.author = author;
        establishment= establishment1;
        this.date = date;

    }
    public String toString(){
        return name + " (" + author + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEstablishment() {
        return establishment.getName();
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
