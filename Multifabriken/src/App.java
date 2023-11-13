import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static ArrayList<Object> listOfItems = new ArrayList<>();

    public static void chooseProduct() {

        //
        String choice = "";
        Scanner scanner = new Scanner(System.in);

        // Förklarar visuellt vad det handlar om + Vilka val man får
        System.out.println(
                "Hej! Välkommen till Multifabriken! Välj vad du vill beställa!\n" + "--------------------------");
        System.out.print("1. Bilar \n2. Godis \n3. Rör \n4. Havremjölk\n" + "--------------------------"
                + "\nSkriv in vilken och klicka sedan enter: ");
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
                // Skapar ett objekt från klassen
                Pipe newPipe = Pipe.newPipe();
                // Lägger till nya bilen i inköpslistan
                listOfItems.add(newPipe);
                break;

            case "4":
                // Skapar ett objekt från klassen
                Oatmilk newOatmilk = Oatmilk.newOatmilk();
                // Lägger till nya bilen i inköpslistan
                listOfItems.add(newOatmilk);
                break;
            default:
                System.out.println("Ogiltigt svar, försök igen.");
                break;
        }

    }

    public static void main(String[] args) throws Exception {

        while (true) {
            chooseProduct();

        }

    }
}
