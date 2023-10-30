package com.source;
import java.util.*;

import com.model.Product;
import com.service.ProductService;
public class Source {

	public static void main(String[] args) {
		
		ProductService ps=new ProductService();
		for(int i=0;i<4;i++)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter product id,name and price");
			int id=s.nextInt();
			String s1=s.next();
			double d=s.nextDouble();
			Product p1=new Product(id,s1,d);
			ps.addProduct(p1);
			
		}
		ps.addListToDB();

	}

}
