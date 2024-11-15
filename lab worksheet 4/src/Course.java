class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;

    public Course(String name, String enrollType, Integer numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Enrollment Type: " + enrollType);
        System.out.println("Number of Students Enrolled: " + numberOfStudentsEnrolled);
    }
}