package dev.grafity.charstreams;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        String myWish = "Vandhematharam";
        double dh =  15.23;
        PrintStream writer = new PrintStream("C:/Vamsi/temp/print.txt");
        writer.println(dh);
    }
}
