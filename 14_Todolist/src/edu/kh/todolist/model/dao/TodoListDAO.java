package edu.kh.todolist.model.dao;

import java.util.List;
import edu.kh.todolist.model.dto.Todo;

//DAO (Data Access Object) : 
//데이터가 저장된 파일/DB/ 외부 장치에 접근하는 역할
public interface TodoListDAO {

	
	List<Todo> todoListFullView();
	
	List<Todo>  todoDetailView();
	
}
