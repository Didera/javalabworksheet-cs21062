public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Departments
        Department softwareEngDept = new Department("Software Engineering");

        // Create Degree
        Degree computerScience = new Degree("Computer Science", 120);

        // Create Courses
        Course oopCourse = new Course("Object-Oriented Programming", "Mandatory", 30);

        // Add Course to Degree
        computerScience.offerCourse(oopCourse);

        // Create Lecturer
        Lecturer lecturer1 = new Lecturer("Dr. Smith", "Professor", softwareEngDept);
        lecturer1.addCourse(oopCourse);

        // Create Student
        Student student1 = new Student("Alice", "S12345", "2nd Year", computerScience);
        student1.enrollCourse(oopCourse);

        // Display Information
        softwareEngDept.displayInfo();
        computerScience.displayInfo();
        oopCourse.displayInfo();
        lecturer1.displayInfo();
        student1.displayInfo();
    }
}