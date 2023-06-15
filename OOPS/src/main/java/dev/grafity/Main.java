package dev.grafity;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Kumar");
        System.out.println(emp.getId());
        emp.setName("Krishna");
        System.out.println(emp.getName());
        Employee emp2 = new Employee(1,"Kumar","Core Dev");

        Object ref = new Employee(10,"Geetha");
        System.out.println(ref);

        Employee empOne = new Employee(1,"Kumar");
        Employee empTwo = new Employee(1,"Kumar");
        System.out.println(empOne.equals(empTwo));
    }
}