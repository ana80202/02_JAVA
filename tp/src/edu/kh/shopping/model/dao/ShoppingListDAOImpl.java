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
		
		//객체 생성 시 TOdoList.dat 파일 내용 읽어오기
		//-> 읽어오기 전에 있는지 검사부터!
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) { //파일이 존재하면
			
			try {
				//객체 입력 스트림을 이용해서 입력 받기
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				// 읽어온 객체를 ArrayList<Todo> 로 강제 형변환 (다운캐스팅)
				ShoppingList = (ArrayList<Shopping>)ois.readObject();
				
			}finally {
				if(ois != null)ois.close();
			}
			
			
		}else {//파일이 존재하지 않으면
			
			//폴더, 파일 만들기
			File directory = new File("/io_test");
			if(!directory.exists())directory.mkdir(); //폴더 없으면 생성
			//file.createNewFile();
			
			//객체 출력 스트림을 이용해서 파일 생성 + 샘플 데이터 추가
			ShoppingList = new ArrayList<Shopping>();  //****
			
			ShoppingList.add(new Shopping("핸드폰", "아이폰 14 pro max",false);
			ShoppingList.add(new Shopping("가디건", "키르시",false);
			ShoppingList.add(new Shopping("가방", "나이키",false);
			
			try{
				//객체 출려 스트림 생성 -> 파일이 없다면 자동 생성
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(ShoppingList); //todoList를 파일로 출력
				
			}finally
			{
				
				if(oos != null)oos.close(); //flush() 내장되어 있어 다 밀어내고 메모리 반환(닫기)
				
			}
		
			System.out.println("*** ShoppingList.dat 파일 생성 완료 ***"); //두번쨰로 실행할떄는 이 문구가 안뜸
		}															   // 검사했더니 존재함 -> if문 검사
	}


	@Override
	public void saveFile() throws Exception {

		try {
			//FILE_PATH 경로에 있는 파일과 연결된 객체 출력 스트림 생성
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(ShoppingList); //todoList 출력
					
		}finally {
			oos.close();
		}
		
		
	}

	@Override
	public List<Shopping> ShoppingListFullView() {
		return ShoppingList;
	}

	@Override
	public Shopping ShoppingDetailView(int index) {
		if(index < 0 || index >= ShoppingList.size())return null;
		return ShoppingList.get(index);
	}

	@Override
	public int ShoppingAdd(Shopping shopping) throws Exception {
		if(ShoppingList.add(shopping)) {
			saveFile();
			return ShoppingList.size() -1;
		}
		return -1;
	}

	@Override
	public boolean wish(int index) throws Exception {
		if(index <0 || index >= ShoppingList.size())return false;
		
		boolean complete = ShoppingList.get(index).isComplete();
		ShoppingList.get(index).setComplete(!complete);
		
		saveFile();
		return true;
	}

	@Override
	public Shopping ShoppingDelete(int index) throws Exception {
		if(index < 0 || index >= ShoppingList.size())return null;
		
		Shopping shopping = ShoppingList.remove(index);
		saveFile();
		return shopping;
	}


	@Override
	public edu.kh.shopping.model.dto.Shopping productDelete(int index) {
		
		return null;
	}

	
}
