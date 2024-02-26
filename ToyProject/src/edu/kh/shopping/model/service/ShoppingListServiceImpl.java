package edu.kh.shopping.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import edu.kh.shopping.model.dao.ShoppingListDAO;

public class ShoppingListServiceImpl implements ShoppingListService {
	
	private ShoppingListDAO dao = null;
	
	public ShoppingListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		dao = new ShoppingListDAOImpl();
	} 



}
