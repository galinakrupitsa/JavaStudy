package org.example.tasks.Controller;

import org.example.tasks.Model.Task;
import org.example.tasks.Repository.TaskRepository;
import org.example.tasks.Service.TaskService;
import org.example.tasks.Model.Task;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TaskController {
    private final TaskService taskService;
        public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskService.create(task);
    }
    @GetMapping("/all")
    public List<Task> getAllTasks() {
            return taskService.findAll();
    }
    @GetMapping("/id/{id}")
    public Task getTaskById(@PathVariable Long id){
            return taskService.getTaskById(id);
    }

}
