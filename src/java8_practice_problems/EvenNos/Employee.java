package java8_practice_problems.EvenNos;

public class Employee {
    int employeeId;
    String employeeName;
    String employeeDepartment;

    public Employee() {
    }
    public Employee(int employeeId, String employeeName, String employeeDepartment) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    @Override
    public String toString() {
        return employeeName+"("+employeeDepartment+")";
    }
}
