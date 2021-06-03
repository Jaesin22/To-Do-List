package com.todolist.demo.domain;

import com.todolist.demo.domain.TodoGroup;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Repository
public class TodoList {

    @Id @GeneratedValue
    @Column(name = "LIST_ID")
    private Long id;

    @Column(nullable = false)
    private String content;

    private LocalDateTime created_at;

    @Column(nullable = false)
    private boolean star;       // 중요도 여부

    @Column(nullable = false)
    private boolean complete;   // 완료 여부

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    private TodoGroup todoGroup;

    public TodoList(Long id, String content, LocalDateTime created_at) {
        this.id = id;
        this.content = content;
        this.created_at = created_at;
    }

    public void getAllLists() {

    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public boolean isStar() {
        return star;
    }

    public boolean isComplete() {
        return complete;
    }
}
