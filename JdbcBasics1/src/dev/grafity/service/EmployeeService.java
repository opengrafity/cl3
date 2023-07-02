package dev.grafity.service;

import dev.grafity.model.Employee;
import dev.grafity.repository.EmployeeRepo;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EmployeeService {
    private EmployeeRepo empRepo = new EmployeeRepo();
    public boolean storeEmployee(int id, String name, String doj) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date dojDate = sdf.parse(doj);
        Employee emp = new Employee(id,name,dojDate);
        return empRepo.storeEmployeeUsingPS(emp);
    }
    public List<Employee> fetchAllEmployee() throws SQLException {
        return empRepo.fetchAllEmployee();
    }

    public int getEmployeesCount() throws SQLException {
        return empRepo.getEmployeesCount();
    }
    public void bulkStoreEmployees(List<Employee> emps) throws SQLException {
        empRepo.storeEmployeeUsingPS(emps);
    }
}
