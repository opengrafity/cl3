package dev.grafity.charstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("C:/Vamsi/temp/application.properties"));

        System.out.println(prop.get("username"));
    }
}
