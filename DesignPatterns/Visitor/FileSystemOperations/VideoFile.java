package FileSystemOperations;

public class VideoFile {
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

    public String getName() { return name; }
    public String getCodec() { return codec; }
    public int getDuration() { return duration; }
    public int getSize() { return size; }
}
