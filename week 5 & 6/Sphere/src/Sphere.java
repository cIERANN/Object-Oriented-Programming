public class Sphere {
    private double diameter;

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow((diameter / 2.0), 3);
    }

    public double calculateSurfaceArea() {
        return 4.0 * Math.PI * Math.pow((diameter / 2.0), 2);
    }

    @Override
    public String toString() {
        return "Sphere with diameter " + diameter;
    }
}

