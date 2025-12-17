package FileSystemOperations;

public class ImageFile {
    private String name;
    private String format; // jpg, png, etc.
    private int width;
    private int height;
    private int size;

    public ImageFile(String name, String format, int width, int height, int size) {
        this.name = name;
        this.format = format;
        this.width = width;
        this.height = height;
        this.size = size;
    }

    public String getName() { return name; }
    public String getFormat() { return format; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getSize() { return size; }
}