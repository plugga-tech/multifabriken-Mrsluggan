import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static ArrayList<Object> listOfItems = new ArrayList<>();
    public static boolean running = true;

    public static void main(String[] args) throws Exception {
        while (running ==true) {
            chooseProduct();

        }

    }

    public static void printList() {
        System.out.println("\nDet du har i varukorgen är:");
        for (Object item : listOfItems) {
            System.out.println(item);
        }
        System.out.println("\n--------------------------\n");

    }

    public static void chooseProduct() {

        String choice = "";
        Scanner scanner = new Scanner(System.in);

        // Förklarar visuellt vad det handlar om + Vilka val man får
        System.out.println(
                "Hej! Välkommen till Multifabriken! Välj vad du vill beställa!\n" + "--------------------------");
        System.out.print("1. Bilar \n2. Godis \n3. Rör \n4. Havremjölk\n5. Kolla varukorgen\n6. Avsluta \n"
                + "--------------------------" + "\nSkriv in vilken och klicka sedan enter: ");
        choice = scanner.nextLine();

        // Switch statment, så man kan välja vilken man vill köpa
        switch (choice) {
            case "1":
                // Skapar ett objekt från klassen
                Car newCar = Car.newCar();
                // Lägger till nya bilen i inköpslistan
                listOfItems.add(newCar);
                break;
            case "2":
                Candy newCandy = Candy.newCandy();
                listOfItems.add(newCandy);
                break;
            case "3":
                Pipe newPipe = Pipe.newPipe();
                listOfItems.add(newPipe);
                break;

            case "4":
                Oatmilk newOatmilk = Oatmilk.newOatmilk();
                listOfItems.add(newOatmilk);
                break;

            case "5":
                // Kör funktionen printlist, som skriver ut varje objekt ur listan
                printList();
                break;

            case "6":
                // Kör funktionen printlist, som skriver ut varje objekt ur listan
                running = false;
                break;
            default:
                System.out.println("Ogiltigt svar, försök igen.");
                break;
        }

    }

}
