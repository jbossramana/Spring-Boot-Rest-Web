package demo.boot.service;

import org.springframework.http.ResponseEntity;

import demo.boot.model.Task;

public interface TaskService {

    ResponseEntity<List<Task>> getAllTasks();

    ResponseEntity<Task> getTaskById(Long id);

    ResponseEntity<Task> createTask(Task task);

    ResponseEntity<Task> updateTask(Long id, Task task);

    ResponseEntity<Void> deleteTask(Long id);
}
