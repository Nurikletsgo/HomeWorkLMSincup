public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private  String whereWasBorn;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String nationality, String whereWasBorn) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.whereWasBorn = whereWasBorn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getWhereWasBorn() {
        return whereWasBorn;
    }

    public void setWhereWasBorn(String whereWasBorn) {
        this.whereWasBorn = whereWasBorn;
    }

    @Override
    public String toString() {
        return "--------------------------------------------------------------------------------------------------------------------" +
                "\n |Person| { firstName = '" + firstName + "', lastName = '" + lastName +
                "', age=" + age + ", nationality= '" + nationality + "', was born in  = '" + whereWasBorn +"'  }" +
                "\n--------------------------------------------------------------------------------------------------------------------";
    }
}
