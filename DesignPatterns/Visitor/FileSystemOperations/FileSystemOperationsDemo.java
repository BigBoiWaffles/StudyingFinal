package FileSystemOperations;

import java.util.ArrayList;

public class FileSystemOperationsDemo {
    public static void main(String[] args){
        ArrayList<FileElement> files = new ArrayList<>();
        files.add(new TextFile("doc.txt", "Hello World"));
        files.add(new ExecutableFile("app.exe", "Windows", 5000));

        FileVisitor scanner = new VirusScanVisitor();
        for (FileElement file : files){
            file.accept(scanner);
        }

        FileVisitor scanner2 = new CompressionVisitor();
        for (FileElement file : files){
            file.accept(scanner2);
        }
    }
}
