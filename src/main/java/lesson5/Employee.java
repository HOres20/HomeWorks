package lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.printf("\tФИО: %s\n \tдолжность: %s\n \temail: %s\n \tномер телефона: %s\n \tзарплата: %2f\n \tВозраст: %d\n\n", fullName, position, email, phone, salary, age);
    }

    public void checkInfo() {
        if (this.age > 40) {
            displayInfo();
        }
    }
}
