import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

 /*   University, School, Car жана Person деген класс тузунуз

Алардын свойстваларын ойлоп табыныз

Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек

Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз

Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз     */
        University university1 = new University();
        university1.setName("КНУ им. Ж.Баласагын");
        university1.setDateOfFoundation(LocalDate.of(1957, 2, 23));
        university1.setLocation("Фрунзе кочосу  547");
        university1.setNumbersOfStudents(23000);

        University university2 = new University();
        university2.setName(" Манас К-Т");
        university2.setDateOfFoundation(LocalDate.of(1975, 2, 23));
        university2.setLocation(" Жал-23/30");
        university2.setNumbersOfStudents(30000);

        University university3 = new University();
        university3.setName(" КГУМА");
        university3.setDateOfFoundation(LocalDate.of(1968, 12, 23));
        university3.setLocation(" И.Ахунбаев 92");
        university3.setNumbersOfStudents(40000);

        University[] universities = {university1, university2, university3};
        System.out.println(Arrays.toString(universities));

        System.out.println("\n\t\t\t\t\t\t\t\t~~[  UNIVERSITY  ]~~");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("| Университеттин аты   |   " + university1.getName() + "\t\t|  " + university2.getName() + "\t\t|  " + university3.getName() + "\t\t\t|");
        System.out.println("| Тузулгон жылы        |   " + university1.getDateOfFoundation() + "\t\t\t\t|   " + university2.getDateOfFoundation() + "\t\t|   " + university3.getDateOfFoundation() + " \t\t|");
        System.out.println("| Жайгашкан орду       |   " + university1.getLocation() + "\t\t|  " + university2.getLocation() + "\t\t|  " + university3.getLocation() + "   |");
        System.out.println("| Студенттердин саны   |   " + university1.getNumbersOfStudents() + "\t\t\t\t\t|   " + university2.getNumbersOfStudents() + "\t\t\t|   " + university3.getNumbersOfStudents() + "\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------");







        School school1 = new School();
        school1.setName("№67 мектеп ");
        school1.setLocation("Боконбаев 19");
        school1.setDateOfFoundation(LocalDate.of(1994, 11, 1));
        school1.setNumbersOfPupils(12000);

        School school2 = new School();
        school2.setName("№69 мектеп ");
        school2.setLocation("Фатьянова 53");
        school2.setDateOfFoundation(LocalDate.of(1993, 5, 18));
        school2.setNumbersOfPupils(15000);

        School school3 = new School();
        school3.setName(" №23 мектеп ");
        school3.setLocation("Жибек-Жолу 281");
        school3.setDateOfFoundation(LocalDate.of(1987, 4, 15));
        school3.setNumbersOfPupils(10000);

        School[] schools = {school1, school2, school3};
        System.out.println(Arrays.toString(schools));

        System.out.println("\n\t\t\t\t\t\t\t~~[   SCHOOLS  ]~~");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("| Мектептие аты        |   " + school1.getName() + " \t\t|\t" + school2.getName() + " \t|\t" + school3.getName() + "\t|");
        System.out.println("| Жайгашкан орду       |   " + school1.getLocation() + " \t| \t" + school2.getLocation() + " \t| \t" + school3.getLocation() + "\t|");
        System.out.println("| Тузулгон жылы        |   " + school1.getDateOfFoundation() + " \t\t|\t" + school2.getDateOfFoundation() + " \t\t|\t" + school3.getDateOfFoundation() + "\t\t|");
        System.out.println("| Окуучулардын саны    |   " + school1.getNumbersOfPupils() + "\t\t\t|\t" + school2.getNumbersOfPupils() + "\t\t\t|\t" + school3.getNumbersOfPupils() + "\t\t\t|");
        System.out.println("-------------------------------------------------------------------------------------");




        Car car1 = new Car();
        car1.setName("BMW X5");
        car1.setColor("Grey");
        car1.setDateOfRelease(LocalDate.of(2006, 4, 3));
        car1.setPrice(13999.d);
        car1.setMadeIn("Korea");

        Car car2 = new Car();
        car2.setName("Lamborghini");
        car2.setColor("Red");
        car2.setDateOfRelease(LocalDate.of(2013, 8, 12));
        car2.setPrice(333999.d);
        car2.setMadeIn("USA");

        Car car3 = new Car();
        car3.setName("Toyota camry 50");
        car3.setColor("White");
        car3.setDateOfRelease(LocalDate.of(2019, 4, 3));
        car3.setPrice(5999.d);
        car3.setMadeIn("USA");

        Car car4 = new Car();
        car4.setName("Gelandewagen");
        car4.setColor("Black");
        car4.setDateOfRelease(LocalDate.of(2006, 4, 3));
        car4.setPrice(3000999.d);
        car4.setMadeIn("USA");

        Car[] cars = {car1, car2, car3, car4};
        System.out.print(Arrays.toString(cars)+"\n");







        Person person1 = new Person();
        person1.setFirstName("Nurik");
        person1.setLastName("Asanov");
        person1.setAge(20);
        person1.setNationality("Kyrgyz");
        person1.setWhereWasBorn("Kyrgyzstan");


        Person person2 = new Person();
        person2.setFirstName("Erdal");
        person2.setLastName("Ertugrul");
        person2.setAge(23);
        person2.setNationality("Turkish");
        person2.setWhereWasBorn("Turkey");


        Person person3 = new Person();
        person3.setFirstName("Ivan");
        person3.setLastName("Aleksandrov");
        person3.setAge(22);
        person3.setNationality("Russian");
        person3.setWhereWasBorn("Russia");

        Person person4 = new Person();
        person4.setFirstName("Jon");
        person4.setLastName("Poulker");
        person4.setAge(21);
        person4.setNationality("American");
        person4.setWhereWasBorn("USA");

        Person[] people = {person1,person2,person3,person4};
        for (Person persons : people){
            System.out.println(persons);
        }



    }
}