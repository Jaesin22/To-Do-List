package com.todolist.demo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequiredArgsConstructor
public class TodoController {

    @GetMapping("/")
    public void home() {
        System.out.println("true = " + true);
    }


}
