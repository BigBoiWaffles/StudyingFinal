package FileSystemOperations;

public class TextFile implements FileElement{
    private String name;
    private String content;
    private int size;

    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
        this.size = content.length();
    }

    @Override
    public String getName() { return name; }
    public String getContent() { return content; }

    @Override
    public int getSize() { return size; }

    @Override
    public void accept(FileVisitor fv){
        fv.visit(this);
    }
}