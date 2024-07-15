package com.model;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
public class ProductOperation 
{
	 public static void main(String[] args)
	    {
	    	SessionFactory sessionFactory=HButil.getSesFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction tx=session.beginTransaction();
			Criteria criteria=session.createCriteria(Product.class);	
			@SuppressWarnings("unchecked")
			List<Product>proList=criteria.list();
			for(Product pro:proList)
			  {
				System.out.println("ID="+pro.getId()+" "+pro.getName()+"  "+pro.getQuantity()+"  "+pro.getPrice()+"  "+pro.getAvailability());	
			  }
			tx.commit();
			sessionFactory.close();
	    }
	}

	