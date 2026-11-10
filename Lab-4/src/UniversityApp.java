public class UniversityApp {

    static class Student {
        String name;
        int id;

        static int studentCount = 0;

        public Student(String name) {
            this.name = name;
            studentCount++;
            this.id = studentCount;
        }
    }

    public static void main(String[] args) {
        System.out.println("\tUniversity Counter");

        Student lastStudent = null;

        for (int i = 1; i <=5; i++) {
            lastStudent = new Student("Student " + i);
        }

        if (lastStudent != null) {
            System.out.println("ID last student: " + lastStudent.id);
        }
        System.out.println("Total students: " + Student.studentCount);
    }
}
