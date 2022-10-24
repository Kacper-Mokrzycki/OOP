class StickyNotes {
    private String note_title;
    private int number_of_word_in_notes;

    public StickyNotes(String note_title, int number_of_word_in_notes) {
        this.note_title = note_title;
        this.number_of_word_in_notes = number_of_word_in_notes;
    }

    @Override
    public String toString() {
        return "StickyNotes{" +
                "note_title='" + note_title + '\'' +
                ", number_of_word_in_notes=" + number_of_word_in_notes +
                '}';
    }

    public String getNote_title() {
        return note_title;
    }

    public void setNote_title(String note_title) {
        this.note_title = note_title;
    }

    public int getNumber_of_word_in_notes() {
        return number_of_word_in_notes;
    }

    public void setNumber_of_word_in_notes(int number_of_word_in_notes) {
        this.number_of_word_in_notes = number_of_word_in_notes;
    }

    public String showNote() {
        return this.note_title;
    }}



public class Main {


    public static void main(String[] args) {
                StickyNotes note1 = new StickyNotes("Notes from PO classes", 199);
                StickyNotes note2 = new StickyNotes("To_buy", 48)

    }
}