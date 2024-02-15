import java.time.LocalDate;

public class Car {
    private  String name;
    private String color;
    private LocalDate dateOfRelease;
    private double price;
    private String madeIn;

    public Car() {
    }

    public Car(String name, String color, LocalDate dateOfRelease, double price, String madeIn) {
        this.name = name;
        this.color = color;
        this.dateOfRelease = dateOfRelease;
        this.price = price;
        this.madeIn = madeIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(LocalDate dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "\n_________________________________\n\t~~~ Car ~~~ " +
                "\n\tName = " + name +"\n\tColor = " + color
                +"\n\tDate Of Release = " + dateOfRelease +
                "\n\tPrice=" + price + "\n\tMade in = " + madeIn  + "\n_________________________________";
    }
}
