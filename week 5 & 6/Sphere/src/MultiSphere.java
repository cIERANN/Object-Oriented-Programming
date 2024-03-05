public class MultiSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(5.0);
        Sphere sphere2 = new Sphere(7.0);

        System.out.println("Sphere 1:");
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());
        System.out.println(sphere1);

        System.out.println("\nSphere 2:");
        System.out.println("Volume: " + sphere2.calculateVolume());
        System.out.println("Surface Area: " + sphere2.calculateSurfaceArea());
        System.out.println(sphere2);

        sphere1.setDiameter(10.0);
        System.out.println("\nUpdated Sphere 1:");
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());
        System.out.println(sphere1);
    }
}
