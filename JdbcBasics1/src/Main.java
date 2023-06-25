import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        List<Employee> emps = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -2);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DAY_OF_MONTH, 10);

        emps.add(new Employee(2,"Kumar",cal.getTime()));

        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 5);

        emps.add(new Employee(3,"Raja",cal.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Grafity123$");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT EMP_ID,EMP_NAME FROM EMPLOYEES");
        int empId = 0;
        String empName = "";

        while(rs.next()) {
            empId = rs.getInt("EMP_ID");
            empName = rs.getString("EMP_NAME");
            System.out.println(empId + "<--->" + empName);
        }

     /*   for(Employee emp:emps) {
            String insertQuery = String.format("INSERT INTO EMPLOYEES (EMP_ID,EMP_NAME,DOJ) VALUES(%d,'%s','%s')"
                    , emp.getEmpId()
                    , emp.getEmpName()
                    , sdf.format(emp.getDoj()));

            stmt.executeUpdate(insertQuery);
        }*/
    }
}