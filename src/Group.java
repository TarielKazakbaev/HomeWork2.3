import java.util.Arrays;

public class Group {
    private Student[] students;
    private Course[] courses;
    private String dateOfStart;

    @Override
    public String toString() {
        return "Group " + "\n"+
                "students: " + Arrays.toString(students) +"\n"+
                " "+"\n"+
                "courses: " + Arrays.toString(courses) +"\n"+
                "dateOfStart: " + dateOfStart + "\n" +
                "howManyMonth: " + howManyMonth ;
    }

    private int howManyMonth;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public int getHowManyMonth() {
        return howManyMonth;
    }

    public void setHowManyMonth(int howManyMonth) {
        this.howManyMonth = howManyMonth;
    }
}
