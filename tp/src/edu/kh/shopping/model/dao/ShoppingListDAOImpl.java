package edu.kh.shopping.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.kh.shopping.model.dto.Shopping;

public class ShoppingListDAOImpl implements ShoppingListDAO {
	
	private final String FILE_PATH = "/io_test/ShoppingList.dat";
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private List <Shopping> ShoppingList = null;
	
	public ShoppingListDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			
			try {
			
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				
				ShoppingList = (ArrayList<Shopping>)ois.readObject();
				
			}finally {
				if(ois != null)ois.close();
			}
			
			
		}else {
			
			File directory = new File("/io_test");
			if(!directory.exists())directory.mkdir(); 
		
			ShoppingList = new ArrayList<Shopping>();  //****
			
			ShoppingList.add(new Shopping("가디건", "키르시",false));
			ShoppingList.add(new Shopping("핸드폰케이스", "어프어프",false));
			ShoppingList.add(new Shopping("가방", "나이키",false));
			
			try{
				
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(ShoppingList);
			}finally
			{
				
				if(oos != null)oos.close(); 
				
			}
		
			System.out.println("*** ShoppingList.dat 파일 생성 완료 ***"); 
		}														
	}


	@Override
	public void saveFile() throws Exception {

		try {
	
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(ShoppingList);
					
		}finally {
			oos.close();
		}
		
		
	}

	@Override
	public List<Shopping> ShoppingList() {
		return ShoppingList;
	}

	@Override
	public Shopping ShoppingDetailView(int index) {
		if(index < 0 || index >= ShoppingList.size())return null;
		return ShoppingList.get(index);
	}

	@Override
	public int productAdd(Shopping shopping) throws Exception {
		if(ShoppingList.add(shopping)) {
			saveFile();
			return ShoppingList.size() -1;
		}
		return -1;
	}

	@Override
	public boolean wish(int index) throws Exception {
		if(index <0 || index >= ShoppingList.size())return false;
		
		boolean wish = ShoppingList.get(index).isWish();
		ShoppingList.get(index).setWish(!wish);
		
		saveFile();
		return true;
	}

	

	@Override
	public Shopping productDelete(int index) throws Exception {
if(index < 0 || index >= ShoppingList.size())return null;
		
		Shopping shopping = ShoppingList.remove(index);
		saveFile();
		return shopping;
	
	}


	@Override
	public boolean productEdit(int index, String title, String content) throws Exception {
		Shopping shopping = new Shopping(title,content,ShoppingList.get(index).isWish());
		if(ShoppingList.set(index, shopping) != null) {
			
			saveFile();
			return true;
		}
		return false;
	}


	
	
}
