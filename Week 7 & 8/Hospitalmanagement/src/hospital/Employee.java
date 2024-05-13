package hospital;

public abstract class Employee {
    private String empNumber;

    public Employee(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public abstract void performDuties();
}
