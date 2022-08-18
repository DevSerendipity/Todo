package org.devserendipity.todo.Todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service public class TodoServiceImpl implements TodoService {
    TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override public List<Todo> getTodos() {
        return new ArrayList<>(todoRepository.findAll());
    }

    @Override public Todo getTodoById(Long id) {
        if ( todoRepository.findById(id).isEmpty() ) {
            throw new IllegalArgumentException("Could not find an user with the id of " + id);
        }
        return todoRepository.findById(id).get();
    }

    @Override public Todo insert(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override public void updateTodo(Long id, Todo todo) {
        if ( todoRepository.findById(id).isEmpty() ) {
            return;
        }
        Todo todoFromDb = todoRepository.findById(id).get();
        todoFromDb.setTodoStatus(todo.getTodoStatus());
        todoFromDb.setTitle(todo.getTitle());
        todoRepository.save(todoFromDb);
    }

    @Override public void deleteTodo(Long todoId) {
        todoRepository.deleteById(todoId);
    }
}
