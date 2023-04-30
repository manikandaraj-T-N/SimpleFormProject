package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	private RequestDispatcher dispatcher;
	private int rs;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String fname= req.getParameter("fname");
		String lname= req.getParameter("lname");
		String pwd= req.getParameter("pwd");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root", "root");
		    
		    PreparedStatement pst = con.prepareStatement("insert into formusers(fname,lname,pwd) values(?,?,?)");
		    
		    pst.setString(1, fname);
		    pst.setString(2, lname);
		    pst.setString(3, pwd);
		  
		    try {
		    	   rs= pst.executeUpdate();
		           
				    PrintWriter pw=resp.getWriter();
				    
				    if(rs>0)
				    {
				    pw.print("Your Name is: "+fname+" "+lname+"\n");
				    pw.print("Your are connect to database.Thanks for coming");
				    System.out.println("Hi...your data are collected");
				    }
			} catch (Exception e) {
				e.printStackTrace();
			}
           
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("failed to connect");
		}
	}

}
