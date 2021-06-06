package com.todolist.demo.repository;

import com.todolist.demo.domain.TodoList;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TodoListRepository {

	@PersistenceContext
	private EntityManager em;

	public void save(TodoList todoList) {
		// ID가 없다는 것은 완전히 새로운걸 저장한다는 의미
		if (todoList.getId() == null) {
			em.persist(todoList);
		} else {
			//dirty checking (update)
			em.merge(todoList);
		}
	}

	public void remove(TodoList todoList) {
		em.remove(todoList);
	}

	// 리스트 전체 조회
	public List<TodoList> findAll() {
		return em.createQuery("select m from TodoList m", TodoList.class)
			.getResultList();
	}

}
