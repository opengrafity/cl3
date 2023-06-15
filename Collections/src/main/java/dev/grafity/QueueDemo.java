package dev.grafity;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<String>();
        names.add("Kavitha");
        names.add("Ramesh");
        names.add("Rajesh");
        names.add("Seetha");

        System.out.println(names.poll());
        System.out.println(names);
        System.out.println(names.poll());
        System.out.println(names);
        System.out.println(names.poll());
        System.out.println(names);
        System.out.println(names.poll());
        System.out.println(names);
        System.out.println(names.poll());
    }
}
