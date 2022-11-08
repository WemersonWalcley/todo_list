package com.wemersonwalcley.repository;

import com.wemersonwalcley.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
