package FileSystemOperations;

public class VirusScanVisitor implements FileVisitor{
    @Override
    public void visit(VideoFile videoFile) {
        System.out.println("Scanning " + videoFile.getName() + " - Medium risk (Video File)");
    }

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning " + textFile.getName() + " - Low risk (Text File)");
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.println("Scanning " + imageFile.getName() + " - Low risk (Image File)");
    }

    @Override
    public void visit(ExecutableFile executableFile){
        System.out.println("Scanning " + executableFile.getName() + " - HIGH RISK (Executable File)");
    }

}
