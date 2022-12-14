import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new Employee("Екатерина Андревна Иванова", 1, 89000),
            new Employee("Иван Петрович Смирнов", 2, 87800),
            new Employee("Петр Ильич Иванов", 4, 76000),
            new Employee("Валерий Врадимирович Карпов", 5, 117000),
            new Employee("Мария Ивановна Смирнова", 1, 45900),
            new Employee("Артур Григорьевич Григорьев", 1, 91100),
            new Employee("Иван Васильевич Васильев", 4, 66000),
            new Employee("Елена Анатольевна Карпова", 2, 65700),
            new Employee("Лариса Андреевна Григорьева", 1, 100000),
            new Employee("Мария Владимировна Васильева", 5, 93500),
        };
        EmployeeService.printAllEmployees(employees);
        EmployeeService.printEmployeeMinSalary (employees);
        EmployeeService.printEmployeeMaxSalary (employees);
        EmployeeService.printSum (employees);







    }
}