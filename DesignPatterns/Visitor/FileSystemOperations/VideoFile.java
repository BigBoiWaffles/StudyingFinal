package FileSystemOperations;

public class VideoFile implements FileElement{
    private String name;
    private String codec;
    private int duration; // in seconds
    private int size;

    public VideoFile(String name, String codec, int duration, int size) {
        this.name = name;
        this.codec = codec;
        this.duration = duration;
        this.size = size;
    }

    @Override
    public String getName() { return name; }
    public String getCodec() { return codec; }
    public int getDuration() { return duration; }

    @Override
    public int getSize() { return size; }

    @Override
    public void accept(FileVisitor fv){
        fv.visit(this);
    }
}
