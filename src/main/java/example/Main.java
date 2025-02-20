import example.Employee;
import example.Manager;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
    public static void main(String[] args) {
       Employee e1 = new Employee("Иванов", LocalDate.of(1990,01,02), "муж", "дворник", 10000);
       Employee e2 = new Employee("Петрова",LocalDate.of(1985,10,12),"жен", "бухгалтер", 50000);
       Manager m1 = new Manager("Сидорова",LocalDate.of(1990,11,23),"жен", "зав.складом", 150000);

       Employee[] employees = {e1, e2, m1};

        System.out.println("\nСтарая зарплата: ");
        for (Employee e: employees){
            e.printInfo();
        }

        Manager.changeSalary(employees, 14);

        System.out.println("\nСтарая зарплата + 14%: ");
        for (Employee e: employees){
            e.printInfo();
        }



        }

