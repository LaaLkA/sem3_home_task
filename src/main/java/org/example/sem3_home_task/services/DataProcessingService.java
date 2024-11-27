package org.example.sem3_home_task.services;

import org.example.sem3_home_task.domain.User;
import org.example.sem3_home_task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис обработки данных
 */
@Service
public class DataProcessingService {
    /**
     * Поле хранилища (БД) пользователей
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Геттер поля хранилища (БД) пользователей
     * @return Поле хранилища (БД) пользователей
     */
    public UserRepository getUserRepository() {
        return userRepository;
    }

    /**
     * Метод сортировки пользователей по возрасту
     * @param users список пользователей
     * @return отсортированный список пользователей
     */
    public List<User> sortUsersByAge(List<User> users){
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    /**
     * Метод фильтрации пользователей по возрасту(пользователи больше указанного возраста)
     * @param users список пользователей
     * @param age возраст меньше которого отфильтровываются пользователи
     * @return отфильтрованный список пользователей
     */
    public List<User> filterUsersByAge(List<User> users, int age){
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    /**
     * Метод вычисления среднего возраста пользователей
     * @param users список пользователей
     * @return средний возраст пользователей
     */
    public double calculateAverageAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    /**
     * Метод добавления пользователя в список пользователей
     * @param user пользователь для добавления
     */
    public void addUserToList(User user){
        userRepository.getUsers().add(user);
    }
}
