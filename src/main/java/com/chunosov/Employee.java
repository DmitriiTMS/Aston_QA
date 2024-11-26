package com.chunosov;

public class Employee {

    private String firstName;
    private String lastName;
    private String surname;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;


    public Employee(String firstName, String lastName,
                    String surname, String jobTitle, String email,
                    String phoneNumber, double salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surname='" + surname + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getEmployeeInformation() {
        return "ФИО сотрудника: " + firstName + lastName + surname + '\'' +
                "Должность сотрудника: '" + jobTitle + '\n' +
                "Email сотрудника:  " + email + '\n' +
                "Номер телефона сотрудника: " + phoneNumber + '\n' +
                "Зарплата сотрудника: " + salary + '\n' +
                "Возраст сотрудника: " + age;
    }
}
