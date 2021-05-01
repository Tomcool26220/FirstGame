public class Note {

    private String matiere;
    private int note;

    public Note(){

    }

    public Note(String matiere, int note) {
        this.matiere = matiere;
        this.note = note;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "matiere='" + matiere + '\'' +
                ", note=" + note +
                '}';
    }
}
