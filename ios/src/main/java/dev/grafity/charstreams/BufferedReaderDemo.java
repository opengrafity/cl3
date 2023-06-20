package dev.grafity.charstreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Vamsi/temp/largetext.txt"));
        String line = null;
        long before = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        while((line = reader.readLine())!=null){
            sb.append(line);
        }
        long after = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println(after-before);
    }
}
