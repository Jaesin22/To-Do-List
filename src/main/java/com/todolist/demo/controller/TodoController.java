package com.todolist.demo.controller;

import com.todolist.demo.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // Controller + ResponseBody
//@RequiredArgsConstructor
public class TodoController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping("/test")
    public Map<String, String> test() {

        return this.todoListService.getTest();
    }

    @PostMapping("/items/{item_id}")
    public void addTodoList() {

    }

    @PutMapping("items/{item_id}")
    public void modifyTodoList() {

    }

    @DeleteMapping("/items/{item_id}")
    public void deleteTodoList() {

    }

    // 중요도 표시
    @PostMapping("/items/{item_id}/star")
    public void checkStar() {
        // star 값을 불러와서 처리
    }

    // 완료 체크박스
    @PostMapping("/items/{item_id}/done")
    public void checkDone() {
        // bit NOT 연산으로 중요도 표시
    }

    // 그룹 폴더 조회
    @GetMapping("/groups")
    public void getGroup() {

    }

    // 특정 그룹 폴더 삭제
    @DeleteMapping("/groups/{group_id}")
    public void deleteGroup() {

    }

    // 그룹 폴더명 수정
    @PutMapping("/groups/{group_id}")
    public void modifyGroup() {

    }

    // 그룹 폴더 추가
    @PostMapping("/groups/{group_id}")
    public void addGroup() {

    }

}
