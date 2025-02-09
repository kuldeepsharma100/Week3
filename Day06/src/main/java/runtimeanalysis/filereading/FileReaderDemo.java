package runtimeanalysis.filereading;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {
    public static long readFile(String filePath){

        long startTime = System.nanoTime();
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String st;
            while((st = br.readLine())!=null){

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        long endTime = System.nanoTime();

        return (endTime-startTime);

    }
}
