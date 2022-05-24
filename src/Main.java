public class Main {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setFirstName("Test1");
        student1.setLastName("Testov1");
        student1.setDateOfBirth("19 04 1988");
        student1.setSex("male");
        student1.setAge(33);

        Student student2 = new Student();
        student2.setFirstName("Test2");
        student2.setLastName("Testov2");
        student2.setDateOfBirth("1989 12 07");
        student2.setSex("female");
        student2.setAge(30);

        Course course1 = new Course();
        course1.setNomination("English");
        course1.setFIO("Testov1 Test1 Testovich1");
        course1.setID(22);
        course1.setDateOfCreate("20 01 2022");

        Course course2 = new Course();
        course2.setNomination("Innovation technology");
        course2.setFIO("Testov2 Test2 Testovich2");
        course2.setID(23);
        course2.setDateOfCreate("10 12 2021");

        Student[] students = new Student[2];
        students[0]=student1;
        students[1]=student2;

        Course[] courses = new Course[2];
        courses[0]=course1;
        courses[1]=course2;

        Group group = new Group();
        group.setStudents(students);
        group.setCourses(courses);
        group.setDateOfStart("12 04 2022");
        group.setHowManyMonth(9);

        System.out.println(group);



    }
}
