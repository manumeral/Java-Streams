public class Employee {
    private int empId;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }

    public void incrementSalary(int increment) {
        this.salary += increment;
    }

    public String getName() {
        return this.name;
    }
}
