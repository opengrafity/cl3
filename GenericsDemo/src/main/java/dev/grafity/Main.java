package dev.grafity;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SearchUtils<Integer> searchUtils = new SearchUtils<>();
        Integer[] values = new Integer[]{15,32,95,64,58,3,52,23,28};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key to search");
        Integer key = Integer.parseInt(sc.nextLine());
        int index = searchUtils.search(values,key);
        if(index >= 0){
            System.out.println("Key found at "+index);
        }else{
            System.out.println("Key not found");
        }

        SearchUtils<String> searchStrUtils = new SearchUtils<>();
        String[] valueStrs = new String[]{"Raja","Ramu","Seetha","Geetha"};
        System.out.println("Enter a key to search");
        String keyStr = sc.nextLine();
        searchStrUtils.search(valueStrs,keyStr);

    }
}