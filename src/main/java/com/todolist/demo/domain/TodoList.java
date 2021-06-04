package com.todolist.demo.domain;

import com.todolist.demo.domain.TodoGroup;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Repository
@Getter
public class TodoList {

    @Id @GeneratedValue
    @Column(name = "list_id")
    private Long id;

    @Column(nullable = false)
    private String content;

    private LocalDateTime created_at;

    @Column(nullable = false)
    private boolean star;       // 중요도 여부

    @Column(nullable = false)
    private boolean complete;   // 완료 여부

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private TodoGroup todoGroup;

    public void setGroup(TodoGroup todoGroup) {
        this.todoGroup = todoGroup;
    }

    public boolean isStar() {
        return star;
    }

    public boolean isComplete() {
        return complete;
    }
}
