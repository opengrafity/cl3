package dev.grafity.charstreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1,"Kumar",2500000.0));
        emps.add(new Employee(2,"Raja",12500000.0));
        emps.add(new Employee(3,"Ramesh",500000.0));
        emps.add(new Employee(4,"Geetha",20500000.0));
        emps.add(new Employee(5,"Seetha",22500000.0));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Vamsi/temp/emps.txt"))){
            for(Employee emp:emps){
                oos.writeObject(emp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
