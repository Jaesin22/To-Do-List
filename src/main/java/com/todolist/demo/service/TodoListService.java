package com.todolist.demo.service;

import com.todolist.demo.domain.TodoList;
import com.todolist.demo.repository.TodoListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TodoListService {

	private final TodoListRepository todoListRepository;

	// 생성자 인젝션이 좋은 방법
	public TodoListService(TodoListRepository todoListRepository) {
		this.todoListRepository = todoListRepository;
	}

	public Map<String, String> getTest() {
		Map<String, String> res = new HashMap<>();
		res.put("key", "value");

		return res;
	}


	public List<TodoList> getList() {
		return todoListRepository.findAll();
	}
}
