package problemstatements.challengeproblems.stringbufferandbuilder;

public class ConcatenateTextMain {
    public static void main(String[] args) {
        ConcatenateText.compareStringConcatenation();
        int count = ConcatenateText.countWordsUsingFileReader("file4.txt");
        int count1 = ConcatenateText.countWordsUsingInputStreamReader("file4.txt");
        System.out.println(" Word count using file reader " +count);
        System.out.println(" Word count using InputStreamReader" +count1);
        ConcatenateText.compareFileReading("file4.txt");
    }
}
