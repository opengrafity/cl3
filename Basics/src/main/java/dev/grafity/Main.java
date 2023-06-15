package dev.grafity;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(1==1);
        System.out.println("Enter age");
        int age = Integer.parseInt(sc.nextLine());
        boolean is = false;
        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        System.out.println("Enter gender");
        char gender = sc.nextLine().charAt(0);
        if(gender == 'M'){
            System.out.println("Hello Sir");
        }else if(gender == 'F'){
            System.out.println("Hello Madam");
        }else if(gender == 'T'){
            System.out.println("Hello Madam");
        }else{
            System.out.println("Hello Dear");
        }

        int i = 1;
        while(i<10){
            System.out.println("Jai Hindh");
            i++;
        }
        for(int j=1;j<10;j=j+1){
            System.out.println("Jai Hindh");
        }
    }
}
