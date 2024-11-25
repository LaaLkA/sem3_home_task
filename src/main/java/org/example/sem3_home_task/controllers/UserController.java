package org.example.sem3_home_task.controllers;

import org.example.sem3_home_task.domain.User;
import org.example.sem3_home_task.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")//localhost:8080/user
public class UserController {

    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getUserRepository().getUsers();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user) {
        service.getDataProcessingService().getUserRepository().getUsers().add(user);
        return "User added from body!";
    }
}
