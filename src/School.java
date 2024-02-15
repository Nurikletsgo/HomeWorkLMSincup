import java.time.LocalDate;

public class School {
    private String name;
    private String location;
    private LocalDate dateOfFoundation;
    private int numbersOfPupils;

    public School() {
    }

    public School(String name, String location, LocalDate dateOfFoundation, int numbersOfPupils) {
        this.name = name;
        this.location = location;
        this.dateOfFoundation = dateOfFoundation;
        this.numbersOfPupils = numbersOfPupils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(LocalDate dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public int getNumbersOfPupils() {
        return numbersOfPupils;
    }

    public void setNumbersOfPupils(int numbersOfPupils) {
        this.numbersOfPupils = numbersOfPupils;
    }

    @Override
    public String toString() {
        return "\n[ School : | name  = " + name  + ",\t location = " + location  +
                ",\t dateOfFoundation = " + dateOfFoundation + ",\t numbersOfPupils = " + numbersOfPupils + " |  ]";
    }
}
