import java.util.Scanner;

public class Pipe {

    private double diameter;
    private double length;

    public Pipe(double diameter, double length) {

        this.diameter = diameter;
        this.length = length;

    }

    public static Pipe newPipe() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej! Fyll i vilken Diameter och längd röret ska ha");

        System.out.print("Diameter: ");
        double diameter = scanner.nextDouble();
        System.out.print("Längd: ");
        double length = scanner.nextDouble();

        return new Pipe(diameter, length);

    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
