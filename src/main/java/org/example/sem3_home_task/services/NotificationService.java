package org.example.sem3_home_task.services;

import org.example.sem3_home_task.domain.User;
import org.springframework.stereotype.Service;

/**
 * Сервис уведомлений пользователей
 */
@Service
public class NotificationService {
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
}
