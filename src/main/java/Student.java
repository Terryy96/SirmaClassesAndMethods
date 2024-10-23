import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String hometown;
    private String age;

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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = String.valueOf(age);
    }

    public Student (String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = String.valueOf(age);
        this.hometown = hometown;
    }

       public void studentInfo() {
            System.out.println(this.firstName + " " +  this.lastName + " " + this.age + " " + this.hometown);

   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();



        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
               break;
            }

            String[] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String hometown = studentData[3];

            // Create a new Student object and add it to the list
            Student student = new Student(firstName, lastName, age, hometown);
            students.add(student);
        }
        String city = scanner.nextLine();


        for (Student student : students) {
            if (student.getHometown().equalsIgnoreCase(city)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge() + " years old.");
            }
        }
    }
}
