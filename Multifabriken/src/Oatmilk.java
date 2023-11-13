import java.util.Scanner;

public class Oatmilk {

    private int fatContent;
    private int LiterQuantity;

    public Oatmilk(int fatContent, int LiterQuantity) {

        this.fatContent = fatContent;
        this.LiterQuantity = LiterQuantity;

    }

    public static Oatmilk newOatmilk() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej! Fyll i vilken fetthalt samt hur många liter du vill köpa.");

        System.out.print("Fethalt i %: ");
        int fatContent = scanner.nextInt();
        System.out.print("Hur många liter: ");
        int LiterQuantity = scanner.nextInt();

        return new Oatmilk(fatContent, LiterQuantity);

    }

    @Override
    public String toString() {
        return "Havremjölk: { " + fatContent + " %" + "  " + LiterQuantity + " }";
    }

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public int getLiterQuantity() {
        return LiterQuantity;
    }

    public void setLiterQuantity(int literQuantity) {
        LiterQuantity = literQuantity;
    }

}
