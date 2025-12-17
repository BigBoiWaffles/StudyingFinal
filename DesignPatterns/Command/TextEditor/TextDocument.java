package TextEditor;

public class TextDocument {
    private StringBuilder content;

    public TextDocument(){
        this.content = new StringBuilder();
    }

    public void insertText(int position, String text) {
        content.insert(position, text);
        System.out.println("Inserted: '" + text + "' at position " + position);
    }

    public void deleteText(int position, int length) {
        content.delete(position, position + length);
        System.out.println("Deleted " + length + " characters from position " + position);
    }

    public void replaceText(int position, int length, String newText) {
        content.replace(position, position + length, newText);
        System.out.println("Replaced text at position " + position);
    }

    public String getContent() {
        return content.toString();
    }

    public void display() {
        System.out.println("Document content: " + content.toString());
    }
}
