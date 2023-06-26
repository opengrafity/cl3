package dev.grafity.view;

import dev.grafity.model.Employee;
import dev.grafity.service.EmployeeService;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private EmployeeService empService = new EmployeeService();
    public void createNewEmployee() throws SQLException, ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id:");
        int empId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter employee name:");
        String empName = sc.nextLine();
        System.out.println("Enter employee doj:");
        String empDoj = sc.nextLine();
        empService.storeEmployee(empId,empName,empDoj);
    }

    public void fetchAllEmployee() throws SQLException {
        List<Employee> emps = empService.fetchAllEmployee();
        for(Employee emp:emps){
            System.out.println(emp);
        }
    }
}
