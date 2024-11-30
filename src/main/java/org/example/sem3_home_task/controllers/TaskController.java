package org.example.sem3_home_task.controllers;

import org.example.sem3_home_task.domain.User;
import org.example.sem3_home_task.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Контроллер задач
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
    /**
     * Поле подключения сервиса работы с данными
     */
    @Autowired
    private DataProcessingService service;

    /**
     * Метод получения всех задач
     * @return лист с задачами
     */
    @GetMapping
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("calc");
        tasks.add("filter");
        tasks.add("sort");
        return tasks;
    }

    /**
     * Метод сортировки пользователей по возрасту
     * @return отсортированный список пользователей
     */
    @GetMapping("/sort")//localhost:8080/tasks/sort
    public List<User> sortUsersByAge(){
        return service.sortUsersByAge(service.getUserRepository().getUsers());
    }

    /**
     * Метод фильтрации пользователей по возрасту
     * @param age точка фильтрации
     * @return возвращает отфильтрованный список пользователей
     */
    @GetMapping("/filter/{age}")
    public List<User> filterUsersByAge(@PathVariable int age){
        return service.filterUsersByAge(service.getUserRepository().getUsers(), age);
    }

    /**
     * Метод нахождения среднего возроста пользователей
     * @return средний возраст пользователей
     */
    @GetMapping("/calcAvg")
    public double calcAvg(){
        return service.calculateAverageAge(service.getUserRepository().getUsers());
    }
}
