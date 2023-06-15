package dev.grafity;

import java.util.Arrays;
import java.util.Scanner;
class Student{
    String name;
    int[] marks = new int[6];
}
public class ArraysDemo {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Student std = new Student();
            std.name = "Kavitha";
            std.marks = new int[]{25,32,65,95,41};

        Student stdTwo = new Student();
            stdTwo.name = "Rajini";
            stdTwo.marks = new int[]{25,45,65,78,24,35};
        students[0] = std;
        students[1] = stdTwo;

        String stdOneName;
        String stdTwoName;
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter number of students");
        int stdCount = Integer.parseInt(sc.nextLine());
        for(int i=0;i<stdCount;i++){
            System.out.println("Enter name of student "+(i+1));
            names[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(names));

        int[][] marks = new int[10][6];

        for(int i=0;i<stdCount;i++){
            System.out.println("Enter marks of student "+(i+1));
            for(int j=0;j<6;j++){
                System.out.println("        subject "+(j+1));
                marks[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for(int i=0;i<stdCount;i++){
            int totalStdMarks = marks[i][0] + marks[i][1] + marks[i][2] + marks[i][3] + marks[i][4] + marks[i][5];
            System.out.println("Total Marks Of Student"+(i+1)+":"+totalStdMarks);
        }
    }
}

