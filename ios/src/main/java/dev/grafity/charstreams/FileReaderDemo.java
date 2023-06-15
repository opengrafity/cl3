package dev.grafity.charstreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        File dishesFile = new File("C:/Vamsi/temp/dishes.txt");
        System.out.println("******");
        try {
            FileReader reader = new FileReader(dishesFile);
            System.out.println("******");
            StringBuilder sb = new StringBuilder();
            int chInt = reader.read();
            while (chInt != -1) {
                sb.append((char) chInt);
                chInt = reader.read();
            }
            System.out.println(sb);
        }catch(FileNotFoundException fe){
            System.out.println("Specified file does not exists");
        }
    }
}
