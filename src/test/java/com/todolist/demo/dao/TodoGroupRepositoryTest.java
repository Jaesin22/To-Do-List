package com.todolist.demo.dao;

import com.todolist.demo.repository.TodoGroupRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)    // Junit에게 springboot 관련 테스트할거라고 얘기
@SpringBootTest
public class TodoGroupRepositoryTest {

	@Autowired
	TodoGroupRepository todoGroupRepository;


}
