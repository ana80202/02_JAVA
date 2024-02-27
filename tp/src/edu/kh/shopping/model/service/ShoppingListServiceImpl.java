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
	public Map<String, Object> ShoppingListFullView(){
		
		List<Shopping> ShoppingList = dao.ShoppingListFullView();
		
		int completeCount = 0;
		
		for(Shopping list : ShoppingList) {
			
			if(Shopping.iscomplete()) {
				completeCount++;
			}
			
		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("ShoppingList", ShoppingList);
		map.put("completeCount", completeCount);
		
		return map;
			
	}

	@Override
	public String ShoppingDetailView(int index) {
		
		if(shopping == null) return null;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("---------------------------------------------------------\n");
		sb.append(String.format("상품명 : %s\n", shopping.getTitle()));
		sb.append(String.format("찜 : %s\n", shopping.isComplete() ? "0" : "X"));
		sb.append("\n [세부 내용]\n");
		sb.append("---------------------------------------------------------\n");
		sb.append(String.format("%s\n", shopping.getDetail()));
		
		//4. 가공한 문자열을 반환
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
		return shopping.getTitle();
	}

	@Override
	public Map<String, Object> ShoppingList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ShoppingAdd(String title, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ShoppingComplete(int index) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
