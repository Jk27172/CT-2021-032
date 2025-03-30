package Q_05;

public class Main {
    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer("Dr.Nihal", "Structured Programming");

        Course course = new Course("Structured Programming", "CTEC 12073",lecturer);

        Student student = new Student("Janani H.M.T.K", "BICT", course.getCourseName());

        System.out.println("Course Details:");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());

        System.out.println("\n");

        System.out.println("Student Details:");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Following Course: " + student.getCourseFollowing());
    }
}
