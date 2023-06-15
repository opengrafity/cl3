package dev.grafity;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(40);

        Collection<Integer> ages2 = new ArrayList<>();
        ages2.add(10);
        ages2.add(20);
        ages2.add(40);
        ages2.add(100);
        ages2.add(200);
        ages2.add(300);
        ages2.add(400);


        for(Integer age:ages2){
            System.out.println(age);
        }

        Iterator<Integer> ageItr = ages2.iterator();
         while(ageItr.hasNext()){
             System.out.println(ageItr.next());
         }
    }
}