import java.util.Scanner;

public class Car {

    private String registrationNumber;
    private String color;
    private String model;

    public Car(String registrationNumber, String color, String model) {

        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
    }

    public static Car newCar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej! Fyll i Regestreringsnumret, färg och model på bilen du vill ha.");

        System.out.print("registreringsnummer: ");
        String registrationNumber = scanner.nextLine();
        System.out.print("Färg: ");
        String color = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();

        return new Car(registrationNumber, color, model);

    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
