public class Employee {
    private int id;
    private String name;
    private int department;
    private int salary;
    public Employee (String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public String getEmployeeName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public String toString() {
        return this.name + " отдел: " + this.department + " зарплата: " + this.salary;
    }

}
