class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

public class PassByValueTest {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void changeName(Student s) {
        s.name = "Changed";
    }

    public static void replaceStudent(Student s) {
        s = new Student("New Student");
    }

    public static void main(String[] args) {
        System.out.println("\tMemory Lab");

        // Test swap
        int x = 5, y = 10;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap: x = " + x + ", y = " + y); // Values remain unchanged

        // Test changeName
        Student student1 = new Student("Original");
        System.out.println("Before changeName: " + student1.name);
        changeName(student1);
        System.out.println("After changeName: " + student1.name); // Name changes to "Changed"

        // Test replaceStudent
        Student student2 = new Student("Second Student");
        System.out.println("Before replaceStudent: " + student2.name);
        replaceStudent(student2);
        System.out.println("After replaceStudent: " + student2.name); // Name "Second Student"
    }
}
