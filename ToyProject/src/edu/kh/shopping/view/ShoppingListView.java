package edu.kh.shopping.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import edu.kh.shopping.model.service.ShoppingListService;

public class ShoppingListView {

	private BufferedReader br = null;
	private ShoppingListService service = null;
	
	public ShoppingListView() {
		
		try {
			
			service = new ShoppingListServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
