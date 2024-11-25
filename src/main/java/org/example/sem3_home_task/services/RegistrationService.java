package org.example.sem3_home_task.services;

public class RegistrationService {
    private DataProcessingService dataProcessingService;
    private NotificationService notificationService;
    private UserService userService;

    // Method processRegistration

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
}
