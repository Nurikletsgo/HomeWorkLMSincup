import java.time.LocalDate;

public class University {
   private String name;
   private String location;
   private   LocalDate dateOfFoundation;
   private int numbersOfStudents;

    public University() {
    }

    public University(String name, String location, LocalDate dateOfFoundation, int numbersOfStudents) {
        this.name = name;
        this.location = location;
        this.dateOfFoundation = dateOfFoundation;
        this.numbersOfStudents = numbersOfStudents;
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

    public int getNumbersOfStudents() {
        return numbersOfStudents;
    }

    public void setNumbersOfStudents(int numbersOfStudents) {
        this.numbersOfStudents = numbersOfStudents;
    }

    @Override
    public String toString() {
        return "\n{  University name = " + name+"; location = "+location+
                ";  dateOfFoundation = "+dateOfFoundation+";  numbersOfStudents = " + numbersOfStudents+"  }";
    }
}
