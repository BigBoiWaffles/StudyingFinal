package FileSystemOperations;

public class TextFile {
    private String name;
    private String content;
    private int size;

    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
        this.size = content.length();
    }

    public String getName() { return name; }
    public String getContent() { return content; }
    public int getSize() { return size; }
}