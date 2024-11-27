package org.example.sem3_home_task.services;

/**
 * Сервис регистрации пользователя.
 */
public class RegistrationService {
    /**
     * Поле сервиса работы с БД
     */
    private DataProcessingService dataProcessingService;
    /**
     * Поле сервиса уведомлений
     */
    private NotificationService notificationService;
    /**
     * Поле сервиса работы с пользователями
     */
    private UserService userService;

    // Method processRegistration

    /**
     * Геттер поля сервиса работы с БД
     * @return сервис работы с БД
     */
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
}
