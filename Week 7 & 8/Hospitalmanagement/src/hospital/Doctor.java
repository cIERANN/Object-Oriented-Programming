package hospital;

public class Doctor extends Employee {
    public Doctor(String empNumber) {
        super(empNumber);
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor " + getEmpNumber() + " is examining patients");
    }
}
