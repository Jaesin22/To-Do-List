package com.todolist.demo.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
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






}
