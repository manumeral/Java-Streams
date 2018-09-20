public class Employee {
    int empId;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }

    public void incrementSalary(int increment) {
        this.salary += increment;
    }
}
