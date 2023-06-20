package dev.grafity.charstreams;

import java.io.Serializable;

public class Employee {
    private int empNo;
    private String empName;
    private Double empSalary;

    public Employee() {
    }

    public Employee(int empNo, String empName, Double empSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
