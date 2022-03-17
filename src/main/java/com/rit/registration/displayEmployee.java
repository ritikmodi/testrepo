package com.rit.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayEmployee")
public class displayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
		
        response.setContentType("text/html");  
        out.println("<html><body>");  
        try 
        {  
        	Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","Ritik2712");
			PreparedStatement ps = con.prepareStatement("select * from ritikmodi_111915105_salary ");

			ResultSet rs = ps.executeQuery();
          
            out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>emp_id</th><th>job_role</th><th>monthly_salary</th><th>yearly_bonus</th><tr>");  
            while (rs.next()) 
            {    
            	
             String em = rs.getString("emp_id");  
             String jr = rs.getString("job_role");  
             String ms = rs.getString("monthly_salary");
             String yb = rs.getString("yearly_bonus");

             out.println("<tr><td>" + em + "</td><td>" + jr + "</td><td>" + ms + "</td><td>" + yb + "</td></tr>");   
            
            }  
            out.println("</table>");  
            out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("error");  
        }  
	}

}
