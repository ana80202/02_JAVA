package edu.kh.shopping.model.service;

import java.util.Map;

public interface ShoppingListService {

	Map<String, Object> ShoppingList();

	String ShoppingDetailView(int index);

	boolean wish(int index) throws Exception;

	String productDelete(int index) throws Exception;

	boolean productEdit(int index, String title, String string) throws Exception;

	int productAdd(String title, String string) throws Exception;

	

	

}