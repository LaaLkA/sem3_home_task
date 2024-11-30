package org.example.sem3_home_task.domain;

/**
 * Класс пользователя
 */
public class User {
    /**
     * Поле имени
     */
    private String name;

    /**
     * Поле возраста
     */
    private int age;

    /**
     * Поле электронной почты
     */
    private String email;

    /**
     * Метод получения имени пользователя
     * @return имя пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод изменения имени пользователя
     * @param name новое имя пользователя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод получения возраста пользователя
     * @return возраст пользователя
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод изменения возраста пользователя
     * @param age новый возраст пользователя
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Метод получения электронной почты пользователя
     * @return электронная почта пользователя
     */
    public String getEmail() {
        return email;
    }

    /**
     * Метод изменения электронной почты пользователя
     * @param email новая электронная почта пользователя
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
