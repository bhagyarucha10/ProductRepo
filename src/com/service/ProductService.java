
package com.service;
import java.util.*;

import com.dao.ProductDao;
import com.model.Product;
public class ProductService {
	ProductDao dao=new ProductDao();
	List<Product> list=new ArrayList();
	public void addProduct(Product p)
	{
		list.add(p);
	}
	public void show()
	{
		for(Product p:list)
		{
			System.out.println(p);
		}
	}
	
	
	public void addListToDB()
	{
		
		dao.insertToDB(list);
		
	}

}
