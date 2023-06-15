package dev.grafity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name");
        String clsName = sc.nextLine();
        Object obj = Class.forName(clsName).newInstance();
        Class empCls = Employee.class;
        Method[] methods = empCls.getDeclaredMethods();
        Field[] fields = empCls.getDeclaredFields();

        for(Method meth:methods){
            System.out.println(meth.getName());
        }

        for(Field field:fields){
            System.out.println(field.getName() + "<--->" + field.getType());
        }
    }
}