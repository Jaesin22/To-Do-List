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

    public Long saveTodoList(TodoList todoList) {
        em.persist(todoList);

        return todoList.getId();
    }

    public List<TodoList> findTodoListAll() {
        return em.createQuery("select m from TodoList m", TodoList.class)
                .getResultList();
    }
}
