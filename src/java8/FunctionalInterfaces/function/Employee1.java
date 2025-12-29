package java8.FunctionalInterfaces.function;


public class Employee1 {
    int empNo;
    String name;
    double dailyWages;

    public Employee1(int empNo, String name, double dailyWages) {
        this.empNo = empNo;
        this.name = name;
        this.dailyWages = dailyWages;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", dailyWages=" + dailyWages +
                '}';
    }
}
