package edu.kh.shopping.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.shopping.model.dao.ShoppingListDAO;
import edu.kh.shopping.model.dao.ShoppingListDAOImpl;
import edu.kh.shopping.model.dto.Shopping;

public class ShoppingListServiceImpl implements ShoppingListService {
	
	private ShoppingListDAO dao = null;
	
	public ShoppingListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		dao = new ShoppingListDAOImpl();
	} 

	@Override
	public Map<String, Object> ShoppingList(){
		
		List<Shopping> ShoppingList = dao.ShoppingList();
		
		int wishCount = 0;
		
		for(Shopping list : ShoppingList) {
			
			if(list.isWish()) {
				wishCount++;
			}
			
		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("ShoppingList", ShoppingList);
		map.put("wishCount", wishCount);
		
		return map;
			
	}

	@Override
	public String ShoppingDetailView(int index) {
		
		Shopping shopping = dao.ShoppingDetailView(index);
		
		if(shopping == null) return null;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("---------------------------------------------------------\n");
		sb.append(String.format("상품명 : %s\n", shopping.getProduct()));
		sb.append(String.format("찜 : %s\n", shopping.isWish() ? "♥" : "♡"));
		sb.append("\n[브랜드]\n");
		sb.append("---------------------------------------------------------\n");
		sb.append(String.format("%s\n", shopping.getDetail()));
		
		
		return sb.toString();
		
		
	}
	
	@Override
	public boolean wish(int index) throws Exception{
		return dao.wish(index);
	}
	
	@Override
	public String productDelete(int index) throws Exception{
		Shopping shopping = dao.productDelete(index);
		if(shopping ==null) return null;
		return shopping.getProduct();
	}


	@Override
	public boolean productEdit(int index, String title, String content) throws Exception {
		
		return dao.productEdit(index,title,content);
		
		
	}

	@Override
	public int productAdd(String title, String content) throws Exception {
		Shopping shopping = new Shopping(title,content, false);
		int index = dao.productAdd(shopping);
		return index;
	}


}
