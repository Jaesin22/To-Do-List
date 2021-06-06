package com.todolist.demo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class TodoGroup {

	@Id
	@GeneratedValue
	@Column(name = "group_id")
	private Long id;

	@Column(nullable = false)
	private String name;

	// 양방향 연관관계 매핑
	@OneToMany(mappedBy = "todoGroup")
	private List<TodoList> todos = new ArrayList<>();

}
