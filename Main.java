public class Main {

    public static void main(String[] args) {

    Course java = new Course("Java Programming", 50);
    Course database = new Course("Database Systems", 40);
    Course web = new Course("Web Development", 35);

    java.displayStatistics();
    database.displayStatistics();
    web.displayStatistics();

    Course.displayUniversityStatistics();

    }
}