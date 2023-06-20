package dev.grafity.charstreams;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamsDemo {
    public static void main(String[] args) throws IOException {
        List<Employee> emps = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Vamsi/temp/emps.txt"))){
            Employee emp;

                while (true) {
                    emp = (Employee) ois.readObject();
                    emps.add(emp);
                }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch(EOFException ex){
            System.out.println(".");
        }
        System.out.println(emps);
    }
}
