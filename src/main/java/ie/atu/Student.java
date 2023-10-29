package ie.atu;

import java.util.Scanner; //allows use of scanner
public class Student {
    private String Name;
    private String Email;
    private String Course;

    //default constructor
    public Student(){
        this.Name = "";
        this.Email = "";
        this.Course = "";
    }

    public Student(String Name, String Email, String Course){
        this.Name = Name;
        this.Email = Email;
        this.Course = Course;
    }


    public void getStudentInfo(){ //user prompt for details
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        this.Name = scanner.nextLine();

        System.out.println("Enter student email: ");
        this.Email = scanner.nextLine();

        System.out.println("Enter course: ");
        this.Course = scanner.nextLine();
    }

    //getters and setters
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getCourse(){
        return Course;
    }

    public void setCourse(String Course){
        this.Course = Course;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + Name+ ", Email:"+ Email + ", Course: " + Course );
    }
}
