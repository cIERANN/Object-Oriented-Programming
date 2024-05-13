package hospital;

public class Nurse extends Employee {
    public Nurse(String empNumber) {
        super(empNumber);
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse " + getEmpNumber() + " has patients");
    }
}

