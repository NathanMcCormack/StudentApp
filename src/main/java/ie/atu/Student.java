package ie.atu;

import java.util.Scanner; //allows use of scanner
public class Student {
    private String name; //sets these strings private so they cant be changed outside the student class
    private String email;
    private String course;

    //default constructor
    public Student(){
        this.setName(name); //for instances in which the set name would have parameters. forces use to follow these
        this.setEmail(email);
        this.setCourse(course);
    }

    public Student(String name, String email, String course){
        this.name = name; //sets the name variable to the variable in this constructor
        this.email = email;
        this.course = course;
    }


    public void getStudentInfo(){ //user prompt for details
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
       this.name= scanner.nextLine();

        System.out.println("Enter student email: ");
        this.email = scanner.nextLine();

        System.out.println("Enter course: ");
        this.course = scanner.nextLine();
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){ // setters would be used to add restrictions. eg name should have no numbers.
        this.name = name; //when we scan the input it sets this to parameter
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + getName() + ", Email:"+ getEmail() + ", Course: " + getCourse() );
    }
}
