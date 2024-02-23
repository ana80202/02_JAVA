package edu.kh.todolist.run;

import edu.kh.todolist.view.ToDoListView;

public class TodolistRun {

	public static void main(String[] args) {
	
		System.out.println("=============프로그램 실행============");
		
		//프로젝트 흐름
		//Run <-> view <-> Service<->DAO <-> File
		ToDoListView view = new ToDoListView();
		view.startView();
		
	}
}
