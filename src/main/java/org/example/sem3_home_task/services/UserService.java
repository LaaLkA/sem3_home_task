package org.example.sem3_home_task.services;

import org.example.sem3_home_task.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private NotificationService notificationService;

    //внедрение зависимостей через конструктор
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public User createUser(String name, int age, String email){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }
}
