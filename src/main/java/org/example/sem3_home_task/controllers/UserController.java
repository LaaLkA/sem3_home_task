package org.example.sem3_home_task.controllers;

import org.example.sem3_home_task.domain.User;
import org.example.sem3_home_task.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Контроллер пользователей
 */
@RestController
@RequestMapping("/user")//localhost:8080/user
public class UserController {

    /**
     * Поле сервиса регистрации
     */
    @Autowired
    private RegistrationService service;

    /**
     * Метод отображения списка пользователей
     * @return список пользователей
     */
    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getUserRepository().getUsers();
    }

    /**
     * Метод добавления пользователя из тела запроса
     * @param user пользователь для добавления
     * @return строку подтверждения добавления
     */
    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user) {
        service.userRegistration(user.getName(), user.getAge(), user.getEmail());
        return "User added from body!";
    }

}
