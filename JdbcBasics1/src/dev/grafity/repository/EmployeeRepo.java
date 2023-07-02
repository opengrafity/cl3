package dev.grafity.repository;

import dev.grafity.model.Employee;

import javax.xml.transform.Result;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("SELECT EMP_ID ID,EMP_NAME,DOJ FROM EMPLOYEES");
        ResultSetMetaData rsMetaData = rs.getMetaData();
        System.out.println(rsMetaData.getColumnCount());
        for(int i=1;i<=rsMetaData.getColumnCount();i++){
            System.out.println(rsMetaData.getColumnName(i) +" <-->"+ rsMetaData.getColumnLabel(i) + "<--->" +rsMetaData.getColumnTypeName(i));
        }
        int empId = 0;
        String empName = "";
        Date doj = null;
        List<Employee> emps = new ArrayList<>();
        Employee emp = null;
        while(rs.next()) {
            //System.out.println(rs.getRow());

            emp = new Employee();
            empId = rs.getInt("ID");
            empName = rs.getString("EMP_NAME");
            doj = rs.getDate("DOJ");

            emp.setEmpId(empId);
            emp.setEmpName(empName);
            emp.setDoj(doj);
            emps.add(emp);
            if(empId == 4){
                rs.updateString("EMP_NAME","Ramesh");
                rs.updateRow();
            }
        }

       /* rs.moveToInsertRow();
        rs.updateInt("EMP_ID",10);
        rs.updateString("EMP_NAME","Subash");
        rs.updateDate("DOJ",new Date(new java.util.Date().getTime()));
        rs.insertRow();*/

        return emps;
    }


    public int getEmployeesCount() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Grafity123$");
        CallableStatement cs = conn.prepareCall("{? = call GET_EMP_COUNT()}");
        int total = 0;
        cs.registerOutParameter(1,Types.INTEGER);
        cs.execute();
        total = cs.getInt(1);
            return total;
    }

    public void storeEmployeeUsingPS(List<Employee> emps) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Grafity123$");
        conn.setAutoCommit(false);
        PreparedStatement empCreationStmt = conn.prepareStatement("INSERT INTO EMPLOYEES (EMP_ID,EMP_NAME,DOJ) VALUES(?,?,?)");
        int i=0;
        Savepoint sp = null;
        try {
            for (Employee emp : emps) {
                i++;
                if(i%5==0){
                    System.out.println(emp.getEmpId());
                    sp = conn.setSavepoint();
                }
                empCreationStmt.setInt(1, emp.getEmpId());
                empCreationStmt.setString(2, emp.getEmpName());
                empCreationStmt.setDate(3, new Date(emp.getDoj().getTime()));
                int rowsAffected = empCreationStmt.executeUpdate();
                empCreationStmt.clearParameters();
            }
        }catch(SQLException ex){
            conn.rollback(sp);
            throw ex;
        }finally {
            conn.commit();
        }
    }

    public void storeEmployeeUsingBatch(List<Employee> emps) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Grafity123$");
        PreparedStatement empCreationStmt = conn.prepareStatement("INSERT INTO EMPLOYEES (EMP_ID,EMP_NAME,DOJ) VALUES(?,?,?)");

        for(Employee emp:emps){
            empCreationStmt.setInt(1,emp.getEmpId());
            empCreationStmt.setString(2,emp.getEmpName());
            empCreationStmt.setDate(3,new Date(emp.getDoj().getTime()));
            empCreationStmt.addBatch();
            empCreationStmt.clearParameters();
        }
        int[] rows = empCreationStmt.executeBatch();
        System.out.println(Arrays.toString(rows));
    }
}
