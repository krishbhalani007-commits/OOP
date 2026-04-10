class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();

        double cube = vc.calculateVolume(3);
        double rectangularCube = vc.calculateVolume(4, 5, 6);
        double sphere = vc.calculateVolume(2.5f);

        System.out.println("Cube Volume: " + cube);
        System.out.println("Rectangular Cube Volume: " + rectangularCube);
        System.out.println("Sphere Volume: " + sphere);
    }
}
