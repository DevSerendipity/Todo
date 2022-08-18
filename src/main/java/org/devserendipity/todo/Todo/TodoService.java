package org.devserendipity.todo.Todo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
