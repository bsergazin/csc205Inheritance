import java.time.LocalDate;
enum Class {CS, DSA, MATH, BIO};

abstract public class User {
    static int globalId;
    String Name;
    LocalDate dob;
    int id;
    
    Class[] classes;
    String email;

    public User(String Name) {
        //System.out.println("Called the User Constructor");
        this.Name = Name;
        this.id = ++globalId;
    }

    public String GetName() {
        return this.Name;// + "_user";
    }
}
