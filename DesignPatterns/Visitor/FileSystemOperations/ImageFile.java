package FileSystemOperations;

import java.io.File;

public class ImageFile implements FileElement{
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

    @Override
    public String getName() { return name; }
    public String getFormat() { return format; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public int getSize() { return size; }

    @Override
    public void accept(FileVisitor fv){
        fv.visit(this);
    }
}