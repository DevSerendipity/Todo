package org.devserendipity.todo.Todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component public class TodoLoader implements CommandLineRunner {
    public final TodoRepository todoRepository;

    public TodoLoader(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override public void run(String... args) {
        loadTodos();
    }

    private void loadTodos() {
        if ( noTodos() ) {
            buildSampleTodos();
        }
    }

    private void buildSampleTodos() {
        todoRepository.save(Todo.builder().title("Buy eggs from market").todoStatus(TodoStatus.NOT_COMPLETED).build());
        todoRepository.save(Todo.builder().title("Complete assignments").todoStatus(TodoStatus.COMPLETED).build());
        System.out.println("Sample Todos Loaded");
    }

    private boolean noTodos() {
        return todoRepository.count() == 0;
    }
}
