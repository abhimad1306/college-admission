package product;
import java.sql.*;
import java.util.Scanner;


public class jdbc 
{
	public static void main(String args[])
	{
		/*players ss=new players();
		try
		{
			ss.enterdata();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
		players1 ss1=new players1();
		try
		{
			ss1.enterdata1();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}



class players
{
	String Registration_Id,First_Name,Last_Name,Candidate_Address,DOB,Course_Name,Contact_No;
	Scanner sc;
	Connection con;
	public void enterdata() throws SQLException
	{
		sc=new Scanner(System.in);
	
		System.out.println("enter Registration Id");Registration_Id=sc.nextLine();
		System.out.println("enter First Name");First_Name=sc.nextLine();
		System.out.println("enter Last Name");Last_Name=sc.nextLine();
	
		System.out.println("enter Candidate Address");Candidate_Address=sc.nextLine();
		System.out.println("enter DOB");DOB=sc.nextLine();
		System.out.println("enter Course Name");Course_Name=sc.nextLine();
		System.out.println("enter Contact No");Contact_No=sc.nextLine();
		
		try 
		{
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.136.212;databaseName=db4;user=user4;password=db4");
            String qry = "insert into Registration_Forms (Registration_Id,First_Name,Last_Name,Candidate_Address,DOB,Course_Name,Contact_No) values(?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(qry);
            ps.setString(1,Registration_Id);ps.setString(2, First_Name);
            ps.setString(3,Last_Name);ps.setString(4, Candidate_Address);
            ps.setString(5,DOB);ps.setString(6,Course_Name);ps.setString(7,Contact_No);
            ps.executeUpdate();
            System.out.println("Record Added Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}
		
	}
	
}
class players1
{
	String User_Name,Passwords;
	Scanner sc1;
	Connection con;
	public void enterdata1() throws SQLException
	{
		sc1=new Scanner(System.in);
	
		System.out.println("enter user Id");User_Name=sc1.nextLine();
		System.out.println("enter password");Passwords=sc1.nextLine();
	
		
		try 
		{
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.136.212;databaseName=db4;user=user4;password=db4");
            String qry = "insert into Login(User_Name,Passwords) values(?,?)";
            PreparedStatement ps =  con.prepareStatement(qry);
            ps.setString(1,User_Name);
            ps.setString(2,Passwords);
            ps.executeUpdate();
            System.out.println("Record Added Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}
	}
}