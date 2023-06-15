package dev.grafity;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Geetha");
        names.add("Kavitha");
        names.add("Seetha");
        names.add("Raja");
        names.add("Navaneetha");
        names.add("Prakash");
        names.add("Ravi");
        ListIterator<String> namesItr =  names.listIterator();

        String name = null;
        System.out.println(names);
        while(namesItr.hasNext()){
            name = namesItr.next();
            if(name.length()<5){
                namesItr.remove();
            }
        }

        while(namesItr.hasPrevious()){
            name = namesItr.previous();
            if (name.equals("Navaneetha")) {
                namesItr.set("Lakshmi");
            }
        }

        System.out.println(names);
    }
}

