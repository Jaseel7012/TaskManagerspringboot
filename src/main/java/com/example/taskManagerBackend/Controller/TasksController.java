package com.example.taskManagerBackend.Controller;

import com.example.taskManagerBackend.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class TasksController {
    @Autowired
    private TaskRepository taskRepository;
    @CrossOrigin
    @GetMapping("/view")
    public List<Object> viewtasks(){
        return (List<Object>) taskRepository.listTaasks();
    }



}
