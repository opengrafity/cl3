package dev.grafity;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Vamsi/temp/");
       /* System.out.println(file.exists());
        if(file.exists()){
            System.out.println("File is already available");
        }else{
            file.createNewFile();
        }*/
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.length());
        File tempFile = File.createTempFile("cl3_temp",".txt",file);
        tempFile.deleteOnExit();
        System.out.println(tempFile.getAbsolutePath());
        /*File[] files= file.listFiles();
        for(File fileObj:files){
            if(fileObj.isFile()){
                System.out.println(fileObj.getName()+ "<--->"+fileObj.length());
                if(fileObj.length() == 0) {
                    fileObj.delete();
                }
            }
        }*/
    }
}