package dev.grafity.charstreams;

import java.io.*;

public class FileInpurStreamDemo {
    public static void main(String[] args) {
        File file = new File("C:/Vamsi/temp/multibytechars.txt");
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream(file);
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("");
        Reader reader = null;
        try{
            reader = new FileReader("C:/Vamsi/temp/multibytechars.txt");
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("");
        InputStream inStream = null;
        try{
            reader = new FileReader("C:/Vamsi/temp/multibytechars.txt");
            int byteData;
            while ((byteData = reader.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
