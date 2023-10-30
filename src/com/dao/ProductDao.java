package com.dao;
import java.util.*;
import java.sql.*;
import com.model.Product;
import com.testconnection.DBConnection;

public class ProductDao {

	
	public void insertToDB(List<Product> plist)
	{
		int result=0;
		try {
		Connection con=DBConnection.getConnection();
		String sql="insert into product values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		for(Product p:plist)
		{
			int x=p.getPid();
			String n=p.getName();
			double d=p.getPrice();
			ps.setInt(1, x);
			ps.setString(2, n);
			ps.setDouble(3, d);
			
			result=ps.executeUpdate();
		}
		if(result>0)
		{
			System.out.println("product list is inserted to DB");
		}
		
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
