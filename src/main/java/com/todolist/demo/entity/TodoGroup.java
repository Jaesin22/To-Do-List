package com.todolist.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TodoGroup {

    @Id @GeneratedValue
    @Column(name = "GROUP_ID")
    private Long id;

    @Column(nullable = false)
    private String name;

    // 양방향 연관관계 매핑
    @OneToMany(mappedBy = "todoGroup")
    private List<TodoList> lists = new ArrayList<>();

    public TodoGroup(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
