package ru.gb.vagranovich.homework5;

public class Employee {
    private final String fio;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;



    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;


    }

    public void showEmployee() {
        System.out.println("ФИО " + this.fio);
        System.out.println("Должность " + this.position);
        System.out.println("email " + this.email);
        System.out.println("телефон " + this.phone);
        System.out.println("Зарплата " + this.salary);
        System.out.println("Возраст " + this.age);
    }

}