package dev.grafity.charstreams;

import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:/Vamsi/temp/vid1.mp4");
        File outputFile = new File("C:/Vamsi/temp/vid2.mp4");
        System.out.println("******");
        BufferedOutputStream writer = null;
        try {
            long before = System.currentTimeMillis();
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(inputFile));
            writer = new BufferedOutputStream(new FileOutputStream(outputFile));
            int chInt = reader.read();
            while (chInt != -1) {
                writer.write(chInt);
                chInt = reader.read();
            }
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }


    }

}
