import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Por","root","root");
			 Scanner sc=new Scanner(System.in);
			  System.out.println("1.Add\n2.Update\n3.Delete\n4.Select\n5.Exit");
			  System.out.println("Enter your choice :");
			  int ch=sc.nextInt();
			 
			  switch(ch)
			  {
			  case 1:
				  System.out.println("Entername :");
				  String name=sc.next();
				 // String query=String.format("insert into bd values(%s)",name);
				  String sql = "insert into bd values(?)";
							 
				  
				  String query2="select * from bd";
				  PreparedStatement pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			      pstmt.setString(1, name);    
			      int rowAffected = pstmt.executeUpdate();
			      Statement stmt=con.createStatement();
				  ResultSet rs=stmt.executeQuery(query2);
				  while(rs.next()) {
						System.out.println(rs.getString(1));//you can give col nm instead of 1
						
						}
						con.close();
						
				break;
			  case 2:
				  System.out.println("Enter new name :");
				  String name2=sc.next();
				 // String query=String.format("insert into bd values(%s)",name);
				  String sql2 = "update bd set NAME=? where NAME='yy'";
							 
				  
				  String query3="select * from bd";
				  PreparedStatement pstmt2 = con.prepareStatement(sql2,Statement.RETURN_GENERATED_KEYS);
			      pstmt2.setString(1, name2);    
			      int rowAffected2 = pstmt2.executeUpdate();
			      Statement stmt2=con.createStatement();
				  ResultSet rs2=stmt2.executeQuery(query3);
				  while(rs2.next()) {
						System.out.println(rs2.getString(1));//you can give col nm instead of 1
						
						}
						con.close();
						
				break;
			  
			 
			  case 3:
				  System.out.println("Entername :");
				  String name4=sc.next();
				 // String query=String.format("insert into bd values(%s)",name);
				  String sql4 = "delete from bd where NAME=?";
							 
				  
				  String query4="select * from bd";
				  PreparedStatement pstmt1 = con.prepareStatement(sql4,Statement.RETURN_GENERATED_KEYS);
			      pstmt1.setString(1, name4);    
			      int rowAffected7 = pstmt1.executeUpdate();
			      Statement stmt7=con.createStatement();
				  ResultSet rs6=stmt7.executeQuery(sql4);
				  while(rs6.next()) {
						System.out.println(rs6.getString(1));//you can give col nm instead of 1
						
						}
						con.close();
						
						break;
			  
			  
			  
			  
			  }
		}
			  
			  
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
