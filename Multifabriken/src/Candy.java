import java.util.Scanner;

public class Candy {

    private String taste;
    private int amount;

    public Candy(String taste, int amount) {

        this.taste = taste;
        this.amount = amount;

    }

        public static Candy newCandy() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej! Fyll i vilken smak du vill ha och hur mycket du vill köpa");

        System.out.print("Smak: ");
        String taste = scanner.nextLine();
        System.out.print("Hur många kg: ");
        int amount = scanner.nextInt();

        return new Candy(taste, amount);

    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
