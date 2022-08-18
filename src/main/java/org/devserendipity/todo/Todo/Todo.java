package org.devserendipity.todo.Todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder public class Todo {
    @Id @GeneratedValue @Column(updatable = false, nullable = false) Long id;
    @Column String title;
    @Column TodoStatus todoStatus;


}
