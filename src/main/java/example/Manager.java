package example;

import java.time.LocalDate;

public class Manager extends Employee{
    public Manager(String name, LocalDate birthDate, String gender, String position, double salary) {
        super(name, birthDate, gender, position, salary);
    }

    public static void changeSalary ( Employee[] employees,  double extra){
        for (Employee employee: employees){
            if (! (employee instanceof Manager)){
                employee.setSalary(Math.round(employee.getSalary() * ( 1 + extra/100)));
            }


        }
    }
}
