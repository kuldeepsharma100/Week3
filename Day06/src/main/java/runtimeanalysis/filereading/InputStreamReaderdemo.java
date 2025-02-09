package runtimeanalysis.filereading;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderdemo {
    public static long readfile(String filePath){

        long startTime = System.nanoTime();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            while (br.readLine() != null) {

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.nanoTime();

    return (endTime-startTime);

    }
}

