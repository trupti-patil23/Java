package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	static final String DB_URL = "jdbc:mysql://localhost:3306/java_training";
	static final String USER = "root";
	static final String PASSWORD = "rootroot";

	public static void main(String[] args) {
		try {

			Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Connected to database");

			Statement stmt = con.createStatement();

			// Drop Table
			String dropTableSql = "DROP TABLE STUDENT";
			stmt.executeUpdate(dropTableSql);

			// -------------------------------------CREATE------------------------------------------------------
			// Create Table
			String tableCretaionSql = "CREATE TABLE STUDENT" + "(id INTEGER not NULL, " + " firstName VARCHAR(255), "
					+ " lastName VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
			stmt.executeUpdate(tableCretaionSql);
			System.out.println("Created table..");

			// -------------------------------------INSERT------------------------------------------------------

			// Insert using Statement Interface
			String insertSql1 = "INSERT INTO STUDENT VALUES (1, 'Sam', 'Gupta', 20)";
			stmt.executeUpdate(insertSql1);

			String insertSql2 = "INSERT INTO STUDENT VALUES (2, 'Ram', 'Patil', 21)";
			stmt.executeUpdate(insertSql2);
			System.out.println("Added rows in given table...using Statement");

			// Insert using PreparedStatement Interface
			PreparedStatement preparedStmt = con.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?)");
			preparedStmt.setInt(1, 3);
			preparedStmt.setString(2, "Rama");
			preparedStmt.setString(3, "Apte");
			preparedStmt.setInt(4, 22);
			preparedStmt.executeUpdate();
			System.out.println("Added row in given table...using PreparedStatement");

			// -------------------------------------UPDATE------------------------------------------------------

			// Update Table using Statement Interface
			String updateSql1 = "UPDATE STUDENT SET age= 23 WHERE ID = 1";
			stmt.executeUpdate(updateSql1);
			System.out.println("UPDATED using Statement..");

			// Update Table using PreparedStatement Interface
			PreparedStatement updatePreparedStmt = con.prepareStatement("UPDATE STUDENT SET age = ? WHERE ID = ?");
			updatePreparedStmt.setInt(1, 24);
			updatePreparedStmt.setInt(2, 2);
			updatePreparedStmt.executeUpdate();
			System.out.println("UPDATED using PreparedStatement..");

			// ----------------------------------------SELECT---------------------------------------------------

			String selectQuery = "SELECT * FROM STUDENT";
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				System.out.println("ID : " + rs.getInt(1));
				System.out.println("FirstName : " + rs.getString(2));
				System.out.println("LastName : " + rs.getString(3));
				System.out.println("Age : " + rs.getInt(4));
				System.out.println();
			}

			rs.close();
			
			// ----------------------------------------CallableStament---------------------------------------------------
			/**
			 * Save and compile procedure(EmployeeProc) on MYSQL database serever
			 */
			CallableStatement callableStmt = con.prepareCall( "{call EmployeeProc}");
			callableStmt.execute();
			System.out.println("Proc ran successfully and Employee table got created.");

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
