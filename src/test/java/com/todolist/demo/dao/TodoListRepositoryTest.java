package com.todolist.demo.dao;

import com.todolist.demo.repository.TodoListRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoListRepositoryTest {

    /*
        테스트
        1) todolist 추가
        2) todolist 삭제
     */


	@Autowired
	TodoListRepository todoListRepository;

	@Autowired


	@Test
	public void testTodoList() throws Exception {
		//given


		//when

		//then
	}
}
