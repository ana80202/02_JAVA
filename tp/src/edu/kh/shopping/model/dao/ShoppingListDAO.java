package edu.kh.shopping.model.dao;

import java.util.List;

import edu.kh.shopping.model.dto.Shopping;

public interface ShoppingListDAO{
	
	void saveFile() throws Exception;

	List<Shopping> ShoppingListFullView();

	Shopping ShoppingDetailView(int index);
	
	int ShoppingAdd (Shopping shopping) throws Exception;
	
	boolean wish(int index) throws Exception;
	
	Shopping ShoppingDelete(int index) throws Exception;

	Shopping productDelete(int index);

}
