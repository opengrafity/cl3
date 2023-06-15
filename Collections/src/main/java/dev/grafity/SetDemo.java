package dev.grafity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Employee> emps = new LinkedHashSet<>();
        Employee empOne = new Employee(1,"Raja","10-JAN-1989");
        Employee empTwo = new Employee(2,"Ramu","10-JAN-1989");
        emps.add(empOne);
        emps.add(empTwo);
        emps.add(new Employee(30,"Ramesh","10-JAN-1989"));
        emps.add(new Employee(4,"Kumar","10-JAN-1989"));
        emps.add(new Employee(5,"Kalyan","10-JAN-1989"));
        emps.add(new Employee(6,"Kiran","10-JAN-1989"));
        emps.add(new Employee(7,"Prakash","10-JAN-1989"));
        emps.add(new Employee(8,"Prathap","10-JAN-1989"));
        System.out.println(emps);
    }
}
