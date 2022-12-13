public class EmployeeService {
    //Получить список всех сотрудников.

    public static void printAllEmployees (Employee [] employees) {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    //Найти сотрудника с минимальной зарплатой.
    public static int minSalary (Employee[] employees) {
        int count = 0;
        int index = count;
        while (count < employees.length) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        double min = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            if (min > employees[count].getSalary()) {
                min = employees[count].getSalary();
                index = count;
            }
        }
        return index;
    }
    public static void printEmployeeMinSalary(Employee[] employees) {
    System.out.println("Минимальная оплата труда у сотрудника - " + employees [minSalary(employees)].getEmployeeName());
    }
    //Найти сотрудника с максимальной зарплатой

    public static int maxSalary (Employee[] employees) {
        int count = 0;
        int index = count;
        for (; count < employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        double max = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            if (max < employees[count].getSalary()) {
                max = employees[count].getSalary();
                index = count;
            }
        }
        return index;
    }
    public static void printEmployeeMaxSalary(Employee[] employees) {
        System.out.println("Максимальная оплата труда у сотрудника - " + employees [maxSalary(employees)].getEmployeeName());
    }

    //Посчитать сумму затрат на зарплаты. + Подсчитать среднее значение зарплат.
    public static void printSum (Employee [] employees) {
        int count = 0;
        int index = count;
        double sum = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            sum = sum + employees[count].getSalary();
            index = count;

        } double average = sum / employees.length;
        System.out.println("Сумма зарплат: " + sum);
        System.out.println("Средняя зп: " + average);
    }
}


