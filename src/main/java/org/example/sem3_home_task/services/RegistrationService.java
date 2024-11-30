package org.example.sem3_home_task.services;

import org.example.sem3_home_task.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис регистрации пользователя.
 */
@Service
public class RegistrationService {
    /**
     * Поле сервиса работы с БД
     */
    @Autowired
    private DataProcessingService dataProcessingService;
    /**
     * Поле сервиса уведомлений
     */
    @Autowired
    private NotificationService notificationService;
    /**
     * Поле сервиса работы с пользователями
     */
    @Autowired
    private UserService userService;

    // Method processRegistration

    /**
     * Метод получения поля сервиса работы с БД
     * @return сервис работы с БД
     */
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public void userRegistration(String username,int age, String email) {
        dataProcessingService.addUserToList(userService.createUser(username, age, email));
    }
}
