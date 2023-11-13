import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Object> listOfItems = new ArrayList<>();

    public static void chooseProduct() {

        String choice = "";
        Scanner scanner = new Scanner(System.in);

        //Förklarar visuellt vad det handlar om + Vilka val man får
        System.out.println(
                "Hej! Välkommen till Multifabriken! Välj vad du vill beställa!\n" + "--------------------------");
        System.out.print("1. Bilar \n2. Godis \n3. Rör \n4. Havremjölk\n" + "--------------------------"
                + "\nSkriv in vilken och klicka sedan enter: ");
        choice = scanner.nextLine();

        switch (choice) {
            case "1":
                Car myCar = Car.newCar();
                listOfItems.add(myCar);
                System.out.println(listOfItems.toString());
                break;

            default:
                System.out.println("bajs");
                break;
        }

    }

    public static void main(String[] args) throws Exception {

        while (true) {
            chooseProduct();

        }

    }
}
