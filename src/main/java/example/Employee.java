package example;

import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate birthDate;
    private String gender;
    private String position;
    private double salary;

    public Employee(String name, LocalDate birthDate, String gender, String position, double salary){
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println(name + " (" + position + ") - з/п: " + salary);
    }
}
