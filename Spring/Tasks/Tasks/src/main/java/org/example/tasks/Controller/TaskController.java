package org.example.tasks.Controller;

import org.example.tasks.Model.Task;
import org.example.tasks.Repository.TaskRepository;
import org.example.tasks.Service.TaskService;
import org.example.tasks.Model.Task;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TaskController {
    private final TaskService taskService;
        public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping("/tasks")
    Task createTask(@RequestBody Task task) {
        return taskService.create(task);
    }
}
