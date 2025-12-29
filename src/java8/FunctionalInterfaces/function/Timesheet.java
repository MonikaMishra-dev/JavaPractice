package java8.FunctionalInterfaces.function;

public class Timesheet {
    int empNo;
    int days;

    public Timesheet(int empNo, int days) {
        this.empNo = empNo;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "empNo=" + empNo +
                ", days=" + days +
                '}';
    }
}
