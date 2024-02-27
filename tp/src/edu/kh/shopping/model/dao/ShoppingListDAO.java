package edu.kh.shopping.model.dao;

import java.util.List;

import edu.kh.shopping.model.dto.Shopping;

public interface ShoppingListDAO{
	
	void saveFile() throws Exception;
	
	List<Shopping> ShoppingList();
	
	int productAdd(Shopping shopping) throws Exception;

	Shopping ShoppingDetailView(int index);
	
	boolean wish(int index) throws Exception;
	
	boolean productEdit(int index, String title, String content) throws Exception;
	
	Shopping productDelete(int index) throws Exception;




}
