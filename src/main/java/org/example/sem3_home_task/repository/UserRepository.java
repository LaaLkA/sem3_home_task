package org.example.sem3_home_task.repository;

import org.example.sem3_home_task.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс репозиторий хранения пользователей
 */
@Repository
public class UserRepository {

    /**
     * Поле список пользователей для хранения пользователей
     */
    private List<User> users = new ArrayList<>();

    /**
     * Геттер возвращающий список пользователей
     * @return список пользователей
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Метод изменения списка пользователей
     * @param users список пользователей
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
