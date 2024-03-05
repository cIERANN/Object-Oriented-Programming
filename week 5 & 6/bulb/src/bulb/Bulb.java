package bulb;

public class Bulb {
    private boolean isOn; 

    public Bulb() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Bulb turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bulb turned off.");
    }
}

