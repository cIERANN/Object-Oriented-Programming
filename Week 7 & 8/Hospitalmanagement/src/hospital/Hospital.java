package hospital;

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("D001");
        Nurse nurse = new Nurse("N001");
        Cleaner cleaner = new Cleaner("C001");

        doctor.performDuties();
        nurse.performDuties();
        cleaner.performDuties();
    }
}
