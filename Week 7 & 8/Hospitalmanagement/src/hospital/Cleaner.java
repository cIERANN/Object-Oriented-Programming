package hospital;

public class Cleaner extends Employee {
    public Cleaner(String empNumber) {
        super(empNumber);
    }

    @Override
    public void performDuties() {
        System.out.println("Cleaner " + getEmpNumber() + " is sweeping");
    }
}

