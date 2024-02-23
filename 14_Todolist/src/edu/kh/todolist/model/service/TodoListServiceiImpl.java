package edu.kh.todolist.model.service;

import edu.kh.todolist.model.dao.TodoListDAO;
import edu.kh.todolist.model.dto.Todo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todolist.model.dao.TOdoListDAOImpl;

public  class TodoListServiceiImpl implements TodoListService {

	//필드
	private TodoListDAO dao = null;

	public TodoListServiceiImpl() throws  FileNotFoundException, IOException, ClassNotFoundException {
		
		//TodoListServiceiImpl 객체가 생성될 때
		dao = new TOdoListDAOImpl();//TodoListDAOiImpl 객체 생성
		//부모타입참조변수 = 자식객체 (다형성 업캐스팅)
	}
	
	//----------------------------------------
	
	/*odoListFullView*/
	@Override
	public Map<String, Object> todoListFullView(){
		
		//1. 할 일 목록 DAO에서 얻어오기
		List<Todo> todoList = dao.todoListFullView();
		
		//2. 할 일 목록에서 완료인 요소가 몇 개인지 카운트(Complete 필드 값이 true)인 요소가 몇 개인지 카운트
		int completeCount = 0;
		
		for(Todo todo : todoList) {
			
			// isComplete() == getComplete()
			if(todo.isComplete()) { //true 인 경우
				completeCount++;
			}
		}
		
		//3. todoList, completeCount를 저장할 Map 생성
		//-> 메서드는 반환을 하나 밖에 못해서
		//   여러개를 반환해야 하는 경우 Map 같은 컬렉션에 묶어서 반환
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);
		
		//4. map 반환
		return map;
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		//yyyy-mm-dd HH:mm:ss 형태 날짜 반환
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		//regDate에 저장되어있는 날짜 데이터를
		// formatter에 지정된 형식으로 변경
		 String fomattedDateTime = regDate.format(formatter);
		
		
		return fomattedDateTime;
	}

	@Override
	public Map<String, Object> todoDetailView() {
		
		
		return null;
	}

}
