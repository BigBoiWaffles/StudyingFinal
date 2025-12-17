package FileSystemOperations;

public class CompressionVisitor implements FileVisitor{
    @Override
    public void visit(VideoFile videoFile) {
        int originalSize = videoFile.getSize();
        int compressedSize = (int)(originalSize * 0.1);
        System.out.println(videoFile.getName() + ": " + originalSize + " -> " +
                compressedSize + " bytes (10% compression)");
    }

    @Override
    public void visit(TextFile textFile) {
        int originalSize = textFile.getSize();
        int compressedSize = (int)(originalSize * 0.7); // 70% compression
        System.out.println(textFile.getName() + ": " + originalSize + " -> " +
                compressedSize + " bytes (70% compression)");
    }

    @Override
    public void visit(ImageFile imageFile) {
        int originalSize = imageFile.getSize();
        int compressedSize = (int)(originalSize * 0.20);
        System.out.println(imageFile.getName() + ": " + originalSize + " -> " +
                compressedSize + " bytes (20% compression)");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        int originalSize = executableFile.getSize();
        int compressedSize = (int)(originalSize * 0.30);
        System.out.println(executableFile.getName() + ": " + originalSize + " -> " +
                compressedSize + " bytes(30% compression)");
    }
}
