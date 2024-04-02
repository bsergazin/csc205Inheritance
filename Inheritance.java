import java.util.ArrayList;

/**
 * Inheritance
 */
public class Inheritance {
    static int[] arr = new int[] {1,2,3};

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("name_856"));
        students.add(new Student("name_3"));
        students.add(new Student("name_2"));

        students.sort(new StudentComparator());

        for (Student student : students) {
            System.out.println(student.GetName());
        }






        /*
        System.out.println("Before exception");
        try {
            int value = arr[-1];            
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("After exception");

        Student student = new Student("Student_Name");
        student.gpa = 3.8;
        System.out.println(student.GetName());

        Instructor instructor = new Instructor("Instructor_name");
        instructor.salary = 150000;

        //User user = new User("User_name");

        System.out.println(student instanceof Student);
        System.out.println(student instanceof User);
        
        Circle circle = new Circle(2);
        System.out.println(circle.GetArea());

        Rectangle rectangle = new Rectangle(4 ,5);
        System.out.println(rectangle.GetArea());

        Triangle triangle = new Triangle(4, 6);
        System.out.println(triangle.GetArea());
        */
    }
}