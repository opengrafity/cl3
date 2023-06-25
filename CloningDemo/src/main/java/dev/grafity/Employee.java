package dev.grafity;

import java.util.Date;

public class Employee implements Cloneable{
    private int empId;
    private String empName;
    private Date doj;

    private Address addr;
    public Employee() {
    }

    public Employee(int empId, String empName, Date doj) {
        this.empId = empId;
        this.empName = empName;
        this.doj = doj;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", doj=" + doj +
                ", addr=" + addr +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
         Employee emp = (Employee)super.clone();
         Address copyAddr = new Address();
         Address originalAddr = emp.getAddr();
         copyAddr.setStreetName(originalAddr.getStreetName());
         copyAddr.setDoorNo((originalAddr.getDoorNo()));
         copyAddr.setCityName(originalAddr.getCityName());
         copyAddr.setPincode(originalAddr.getPincode());
         emp.setAddr(copyAddr);
         return emp;
    }
}
