public class Course {

    // Instance variables for each course
    private String courseName;
    private int numberOfStudents;

    // Static variable shared by all Courses
    private static int totalStudents = 0;

    public Course(String courseName, int numberOfStudents) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;

        totalStudents += numberOfStudents;
    }

    public void displayStatistics() {

        double averageAttendance = numberOfStudents * 0.90;


        System.out.println("Course: " + courseName);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Average Attendance: " + averageAttendance); 

    }

    public static void displayUniversityStatistics() {
        System.out.println("Total Students Across All Courses: " + totalStudents);
    }
    
    
}
