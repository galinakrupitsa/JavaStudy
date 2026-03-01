package org.example.tasks.Controller;

import org.example.tasks.Repository.TaskRepository;
import org.example.tasks.Service.TaskService;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TaskController {
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskService.create(task);
    }
}
