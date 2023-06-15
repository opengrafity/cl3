package dev.grafity;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String projectName;
    private static int maxAge;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Employee(int id, String name,String projectName){
        this(id,name);
        this.projectName = projectName;
    }
    static {
        maxAge = 60;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

   public boolean equals(Object that){
        Employee thatEmp = (Employee)that;
        return (this.id == thatEmp.id) && (this.name.equals(thatEmp.name));
   }
}
