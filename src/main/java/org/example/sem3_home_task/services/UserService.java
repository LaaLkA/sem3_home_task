package org.example.sem3_home_task.services;

import org.example.sem3_home_task.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис работы с пользователем.
 */
@Service
public class UserService {
    /**
     * Поле сервиса уведомлений
     */
    @Autowired
    private NotificationService notificationService;

    /**
     * Поле сервиса регистрации
     */
    private RegistrationService registrationService;

    /**
     * Конструктор сервиса пользователя с подключением зависимости (внедрение зависимостей)
     * @param notificationService  сервис уведомления
     */
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /**
     * Метод создания пользователя
     * @param name Имя
     * @param age Возраст
     * @param email Почта
     * @return Созданного пользователя
     */
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
