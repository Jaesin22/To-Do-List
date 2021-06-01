package com.todolist.demo.service;

import com.todolist.demo.entity.TodoGroup;
import com.todolist.demo.entity.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TodoService {

    @Autowired TodoList todoList;

    @Autowired TodoGroup todoGroup;

    public Map<String, String> getTest() {
        Map<String, String> res = new HashMap<>();
        res.put("key", "value");

        return res;
    }


    public List<TodoList> getList() {
        return todoList.getAllLists();
    }
}
