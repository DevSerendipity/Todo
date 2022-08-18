package org.devserendipity.todo.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface TodoRepository extends JpaRepository<Todo, Long> {

  /*  @Query("SELECT c FROM Todo c WHERE c.email = ?1") Todo findClientByEmail( String email );

    @Query(value = "SELECT MAX(id) FROM todo", nativeQuery = true) int findClientById();*/

}
