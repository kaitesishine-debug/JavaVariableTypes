public class Course {

    // Instance variables for each course
    private String courseName;
    private int numberOfStudents;

    // Static variable shared by all Courses
    private static int totalStudents = 0;

    //Constructor initializes the course details
    public Course(String courseName, int numberOfStudents) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;

        totalStudents += numberOfStudents;
    }

    // Displays statistics for an individual course
    public void displayStatistics() {

        // Uses double to store the calculated attendance value
        double averageAttendance = numberOfStudents * 0.90;


        System.out.println("Course: " + courseName);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Average Attendance: " + averageAttendance); 

    }

    // Displays statistics for all courses in the university
    public static void displayUniversityStatistics() {
        System.out.println("Total Students Across All Courses: " + totalStudents);
    }
    
    
}
