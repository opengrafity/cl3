package dev.grafity;

import java.util.Deque;
import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args) {
        Deque<String> names = new LinkedList<>();
        names.addFirst("Kavitha");
        names.addFirst("Geetha");
        names.addFirst("Latha");
        names.addFirst("Seetha");

        System.out.println(names.removeFirst());
        System.out.println(names.removeFirst());
        System.out.println(names.removeFirst());
        System.out.println(names.removeFirst());
        System.out.println(names.removeFirst());
    }
}
