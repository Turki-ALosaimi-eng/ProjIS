import java.sql.*;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
    	String url = "jdbc:mariadb://localhost:3306/Employees";
        String user = "root";
        String password = "";
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
         connection = DriverManager.getConnection(url, user, password);
         stmt = connection.createStatement();

    	Scanner input = new Scanner(System.in);
    	System.out.println(" Choose on option");
    	System.out.println("1)"+" Insert a new employee");
    	System.out.println("2)"+" Display all the employee");
    	System.out.println("3)"+" Give yearly raises");
    	System.out.println("4)"+" Exit");
    	 int NO = input.nextInt();
    	 if (NO==1) {
    		 System.out.println("Inserting a new employees:");
    	
    		 System.out.print("EmployeeID : ");
    	       int NID = input.nextInt();
    	       String text = input.nextLine();
    	       System.out.print("Employee name : ");
    	       String name = input.nextLine();

		       System.out.print("Salary: ");
		       double salary = input.nextDouble();

		       System.out.print("Sales: ");
		       double sales = input.nextDouble();
		       input.nextLine();
		       String insertQuery = "INSERT INTO employees (EmployeeID, Name, Salary, ales) VALUES (" + NID + ", '" + name + "', " + salary + ", " + sales + ")";
		       stmt.executeQuery(insertQuery);
		       }
    	 
    	 }catch(SQLException e) {
        
    }
}}