import java.util.ArrayList;

class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year, Degree degree) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        if (degree != null) {
            degree.displayInfo();
        }
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo() {
        if (degree != null) {
            degree.displayInfo();
        } else {
            System.out.println("No degree registered.");
        }
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
        System.out.println("Enrolled in course: " + course.getName());
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
        System.out.println("Unenrolled from course: " + course.getName());
    }

    public void listCoursesEnrolled() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (Course course : coursesEnrolled) {
            course.displayInfo();
        }
    }
}
