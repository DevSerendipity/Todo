package org.devserendipity.todo.web;

import org.devserendipity.todo.Todo.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller public class WebsiteController {

    private final TodoService todoService;

    public WebsiteController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/") public String filePicker() {
        return "/home.html";
    }
}
