package dev.grafity.view;

import dev.grafity.model.Employee;
import dev.grafity.service.EmployeeService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    public void getToTalEmployeesCount() throws SQLException {
        System.out.println("Total Employees:"+empService.getEmployeesCount());
    }
    public void bulkLoad() throws IOException, ParseException, SQLException {
        try(FileReader reader = new FileReader("C:/Vamsi/temp/emps2.csv");
            BufferedReader buffReader = new BufferedReader(reader)){
            String empLine = null;
            String[] empsParts = null;
            List<Employee> emps = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyyyy");
            while((empLine = buffReader.readLine())!=null){
                empsParts = empLine.split(",");
                emps.add(new Employee(Integer.parseInt(empsParts[0]),empsParts[1],sdf.parse(empsParts[2])));
            }
            empService.bulkStoreEmployees(emps);
        }
    }
}
