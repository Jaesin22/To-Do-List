package com.todolist.demo.repository;

import com.todolist.demo.domain.TodoGroup;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TodoGroupRepository {

    @PersistenceContext // 해당 어노테이션만 있으면 알아서 엔티티 매니저 생성
    private EntityManager em;

    public Long saveTodoGroup(TodoGroup todoGroup) {
        em.persist(todoGroup);

        return todoGroup.getId();
    }




}
