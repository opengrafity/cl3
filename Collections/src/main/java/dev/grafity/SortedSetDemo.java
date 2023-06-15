package dev.grafity;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> ages = new TreeSet<>();
        ages.add(10);
        ages.add(5);
        ages.add(15);
        ages.add(56);
        ages.add(32);
        ages.add(62);
        ages.add(18);
        System.out.println(ages.ceiling(50));
        SortedSet<Integer> eligibleForVote = ages.tailSet(18);
        System.out.println(eligibleForVote);
        ages.add(78);
        System.out.println(ages);
        System.out.println(eligibleForVote);

        SortedSet<String> names = new TreeSet<>();
        names.add("Krishna");
        names.add("Kaveri");
        names.add("Ganga");
        names.add("Yamuna");
        names.add("Ganga");
        System.out.println(names.first());
    }
}
