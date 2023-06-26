package dev.grafity.repository;

import dev.grafity.model.Employee;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {

    public boolean storeEmployee(Employee emp) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Grafity123$");
        Statement stmt = conn.createStatement();
        String insertQuery = String.format("INSERT INTO EMPLOYEES (EMP_ID,EMP_NAME,DOJ) VALUES(%d,'%s','%s')"
                , emp.getEmpId()
                , emp.getEmpName()
                , sdf.format(emp.getDoj()));

        int rowsAffected = stmt.executeUpdate(insertQuery);
        return rowsAffected>0?true:false;
    }
    public boolean storeEmployeeUsingPS(Employee emp) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Grafity123$");
        PreparedStatement empCreationStmt = conn.prepareStatement("INSERT INTO EMPLOYEES (EMP_ID,EMP_NAME,DOJ) VALUES(?,?,?)");

        empCreationStmt.setInt(1,emp.getEmpId());
        empCreationStmt.setString(2,emp.getEmpName());
        empCreationStmt.setDate(3,new Date(emp.getDoj().getTime()));
        int rowsAffected = empCreationStmt.executeUpdate();

        return rowsAffected>0?true:false;
    }
    public List<Employee> fetchAllEmployee() throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Grafity123$");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT EMP_ID,EMP_NAME,DOJ FROM EMPLOYEES");
        int empId = 0;
        String empName = "";
        Date doj = null;
        List<Employee> emps = new ArrayList<>();
        Employee emp = null;
        while(rs.next()) {
            emp = new Employee();
            empId = rs.getInt("EMP_ID");
            empName = rs.getString("EMP_NAME");
            doj = rs.getDate("DOJ");

            emp.setEmpId(empId);
            emp.setEmpName(empName);
            emp.setDoj(doj);
            emps.add(emp);
        }
        return emps;
    }
}
