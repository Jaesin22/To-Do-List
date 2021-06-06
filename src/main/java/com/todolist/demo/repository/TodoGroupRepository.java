package com.todolist.demo.repository;

import com.todolist.demo.domain.TodoGroup;
import com.todolist.demo.domain.TodoList;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TodoGroupRepository {

	@PersistenceContext
	private EntityManager em;

	// 그룹 폴더 저장
	public void save(TodoGroup todoGroup) {
		if (todoGroup.getId() == null) {
			em.persist(todoGroup);
		} else {
			em.merge(todoGroup);
		}
	}

	// 그룹 폴더 삭제
	public void remove(TodoGroup todoGroup) {
		em.remove(todoGroup);
	}

	// 특정 그룹 폴더 조회
	public List<TodoList> findOne(TodoGroup groupId) {
		return em.createQuery("select t from TodoList t where groupId = :groupId", TodoList.class)
			.setParameter("groupId", groupId)
			.getResultList();
	}

	// 그룹 전체 조회 (전체 이름)
	public List<TodoGroup> findGroups() {
		return em.createQuery("select t from TodoGroup", TodoGroup.class)
			.getResultList();
	}

	// 이름으로 그룹 조회
	public List<TodoGroup> findGroupByName(String name) {
		return em.createQuery("select g from TodoGroup g where g.name = :name", TodoGroup.class)
			.setParameter("name", name)
			.getResultList();
	}

}
