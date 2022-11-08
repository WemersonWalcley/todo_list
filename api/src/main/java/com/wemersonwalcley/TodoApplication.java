package com.wemersonwalcley;

import com.wemersonwalcley.model.Todo;
import com.wemersonwalcley.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class TodoApplication {

/*	@Autowired
	private TodoRepository todoRepository;

	@Bean
	public CommandLineRunner init(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Todo todo = new Todo();
				todo.setDescription("Estudar Spring");
				todo.setCreatedDate(LocalDateTime.now());
				todoRepository.save(todo);
			}
		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
