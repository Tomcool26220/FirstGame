import java.util.Arrays;

public class Student extends Object{

    private String firstName;
    private String lastName;
    private String classe;
    private Note[] notes;

    public Student(){

    }

    public Student(String firstName, String lastName, String classe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classe = classe;
    }

    public Student(String firstName, String lastName, String classe,Note[] notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classe = classe;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Note[] getNotes() {
        return notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classe='" + classe + '\'' +
                ", notes=" + Arrays.toString(notes) +
                '}';
    }
}
