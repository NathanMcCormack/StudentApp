package ie.atu;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("");
        Student student3 = new Student("", "", "");

        System.out.println("Enter details of first student: ");
        student1.getStudentInfo();

        System.out.println("Enter details of second student: ");
        student2.getStudentInfo();

        System.out.println("Enter details of third student: ");
        student3.getStudentInfo();

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}








