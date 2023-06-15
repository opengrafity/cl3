package dev.grafity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> ages = new LinkedList<>();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(1,15);
        System.out.println(ages);
        ages.remove(2);
        System.out.println(ages);
        System.out.println(ages.get(1));
        for(int i=0;i<ages.size();i++){
            System.out.println(ages.get(i));
        }
    }
}
