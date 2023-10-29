package ie.atu;

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
}
