import java.util.ArrayList;

class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void displayInfo() {
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
        System.out.println("Offered course: " + course.getName());
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
        System.out.println("Withdrawn course: " + course.getName());
    }

    public void listCoursesOffering() {
        System.out.println("Courses offered in " + name + ":");
        for (Course course : coursesOffering) {
            course.displayInfo();
        }
    }
}
