import java.util.Date;

public class Reparation {
    int id;
    Date date;
    double price;
    public Reparation(int id, Date date, double price) {
        this.id = id;
        this.date = date;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
}
