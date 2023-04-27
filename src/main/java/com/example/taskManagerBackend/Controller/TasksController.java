package com.example.taskManagerBackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TasksController {
    @GetMapping("/view")
    public String viewtasks(){
        return "view page";
    }



}
