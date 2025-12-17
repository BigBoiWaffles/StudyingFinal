package FileSystemOperations;

public class ExecutableFile implements FileElement{
    private String name;
    private String platform; // Windows, Mac, Linux
    private int size;

    public ExecutableFile(String name, String platform, int size) {
        this.name = name;
        this.platform = platform;
        this.size = size;
    }

    @Override
    public String getName() { return name; }
    public String getPlatform() { return platform; }

    @Override
    public int getSize() { return size; }

    @Override
    public void accept(FileVisitor fileVisitor){
        fileVisitor.visit(this);
    }
}
