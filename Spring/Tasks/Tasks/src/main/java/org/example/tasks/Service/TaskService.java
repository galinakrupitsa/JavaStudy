package org.example.tasks.Service;

import org.example.tasks.Model.Task;
import org.example.tasks.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TaskService {
    private TaskRepository taskRepo;
    @Autowired
    public TaskService(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }
    public Task create(@RequestBody Task task) {
        return taskRepo.save(task);
    }
}
