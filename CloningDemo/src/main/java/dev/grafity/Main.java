package dev.grafity;

import java.util.Date;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("Kumar");
        emp.setDoj(new Date());
        Address addr = new Address("12/A","Subhash Chandrabose Street","Chennai","60096");
        emp.setAddr(addr);

        System.out.println(emp);
        Employee copyEmp = (Employee)emp.clone();
        System.out.println(copyEmp);

        copyEmp.getAddr().setPincode("600121");

        System.out.println(emp);
        System.out.println(copyEmp);
    }
}