public class Car {

    private String registrationNumber;
    private String color;
    private String model;

    public Car(String registrationNumber, String color, String model) {

        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
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
