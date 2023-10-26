package mediator;

public interface Mediator {

        void addNewNote(Note note);
        void deleteNote();
        void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void registerComponent(Component component);
    void hideElements(boolean flag);
}
