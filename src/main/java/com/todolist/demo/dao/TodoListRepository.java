package com.todolist.demo.dao;

import com.todolist.demo.entity.TodoList;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TodoListRepository {

    @PersistenceContext
    private EntityManager em;

    public Long saveTodoList(TodoList todoList) {
        em.persist(todoList);

        return todoList.getId();
    }
}
