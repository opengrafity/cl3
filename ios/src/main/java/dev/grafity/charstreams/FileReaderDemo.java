package dev.grafity.charstreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        File inputFile = new File("C:/Vamsi/temp/content.txt");
        File outputFile = new File("C:/Vamsi/temp/content2.txt");
        System.out.println("******");
        FileWriter writer = null;
        try {
            FileReader reader = new FileReader(inputFile, StandardCharsets.UTF_8);
            BufferedReader breader = new BufferedReader(reader);
            
            writer = new FileWriter(outputFile,StandardCharsets.UTF_8);
            int chInt = breader.read();
            while (chInt != -1) {
                writer.write(chInt);
                chInt = reader.read();
            }

        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }finally {
            writer.close();
        }
    }
}
