package edu.kh.shopping.model.service;

import java.util.Map;

public interface ShoppingListService {

	Map<String, Object> ShoppingListFullView();

	String ShoppingDetailView(int index);

	Map<String, Object> ShoppingList();

	boolean wish(int index) throws Exception;

	String productDelete(int index) throws Exception;

	int ShoppingAdd(String title, String string);

	boolean ShoppingComplete(int index);

	String productDelete(int index);

	String ShoppingDetailView(int index);

	Map<String, Object> ShoppingList();
	
	

}