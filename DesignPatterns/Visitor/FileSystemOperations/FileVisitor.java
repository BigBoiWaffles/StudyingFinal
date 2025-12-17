package FileSystemOperations;

public interface FileVisitor {
    void visit(VideoFile videoFile);
    void visit(TextFile textFile);
    void visit(ImageFile imageFile);
    void visit(ExecutableFile executableFile);
}
