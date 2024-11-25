package org.example.sem3_home_task.controllers;

import org.example.sem3_home_task.domain.User;
import org.example.sem3_home_task.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("calc");
        tasks.add("filter");
        tasks.add("sort");
        return tasks;
    }

    @GetMapping("/sort")//localhost:8080/tasks/sort
    public List<User> sortUsersByAge(){
        return service.sortUsersByAge(service.getUserRepository().getUsers());
    }


    //Methods:
    //filterUsersByAge
    //calculateAverageAge
}
