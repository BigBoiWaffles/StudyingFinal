package FileSystemOperations;

public interface FileElement {
    String getName();
    int getSize();
    void accept(FileVisitor fileVisitor);
}
