package ie.atu;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student3 = new Student("", "", "");

        System.out.println("Enter details for first student: ");
        student1.getStudentInfo();

        System.out.println("Enter details of third student: ");
        student3.getStudentInfo();

        student1.displayInfo();
        student3.displayInfo();
    }
}








