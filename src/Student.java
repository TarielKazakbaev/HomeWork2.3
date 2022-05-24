public class Student {
    private String dateOfBirth;
    private String lastName;
    private String firstName;
    private String sex;
    private int age;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return  "\n"+
                "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "dateOfBirth: " + dateOfBirth + "\n" +
                "sex: " + sex + "\n" +
                "age: " + age + "\n"+ " ";
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
