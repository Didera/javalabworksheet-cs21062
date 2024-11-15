import java.util.ArrayList;

class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name); // Call the constructor of the Person class
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void displayInfo() { // This correctly overrides the abstract method
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
        if (department != null) {
            System.out.println("Department: " + department.getName());
        } else {
            System.out.println("Department: Not Assigned");
        }
    }

    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        } else {
            System.out.println("No department assigned.");
        }
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
        System.out.println("Added course: " + course.getName());
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
        System.out.println("Removed course: " + course.getName());
    }

    public void listCoursesTeaching() {
        System.out.println("Courses taught by " + getName() + ":");
        for (Course course : coursesTeaching) {
            course.displayInfo();
        }
    }
}