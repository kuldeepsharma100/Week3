package runtimeanalysis.filereading;

public class FileReaderMain {
    public static void main(String[] args) {
        System.out.println("The time required to read large file using file reader: " + FileReaderDemo.readFile("file.txt"));
        System.out.println("The time required to read large file using Input Stream reader: " + InputStreamReaderdemo.readfile("file.txt"));

    }
}
