import dev.grafity.model.Employee;
import dev.grafity.view.EmployeeView;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class MainLayered {
    public static void main(String[] args) throws SQLException, ParseException {
        Scanner sc = new Scanner(System.in);
        EmployeeView empView = new EmployeeView();
        int choice = 0;
        while(choice!=3){
            System.out.println("Enter your choice \n 1)Create an employee \n 2)Show all employees \n 3)Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    empView.createNewEmployee();
                    break;
                case 2:
                    empView.fetchAllEmployee();
                    break;
                default:
                    break;
            }
        }
    }
}