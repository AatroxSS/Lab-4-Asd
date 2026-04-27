public class Student {
    private String lastName;
    private String firstName;
    private int groupNumber;
    private String faculty;

    public Student(String lastName, String firstName, int groupNumber, String faculty) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.groupNumber = groupNumber;
        this.faculty = faculty;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String toString() {
        return String.format("%d | %s %s | %s", groupNumber, lastName, firstName, faculty);
    }
}
