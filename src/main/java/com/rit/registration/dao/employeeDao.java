package com.rit.registration.dao;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rit.registration.model.employee;

	public class employeeDao {

	    public int registerEmployee(employee emp) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO ritikmodi_111915105_detail" +
	            "  (emp_id, firstname, lastname, DOB, contact) VALUES " +
	            " (?, ?, ?, ?, ?,?);";

	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "Ritik2712");

	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setInt(1, 1);
	            preparedStatement.setString(2, emp.getEmp_id());
	            preparedStatement.setString(4, emp.getFirstname());
	            preparedStatement.setString(5, emp.getLastname());
	            preparedStatement.setString(6, emp.getDOB());
	            preparedStatement.setString(7, emp.getContact());

	            System.out.println(preparedStatement);
	           
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            
	            printSQLException(e);
	        }
	        return result;
	    }

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}
	

