public class Oatmilk {

    private int fatContent;
    private int LiterQuantity;

    public Oatmilk(int fatContent, int LiterQuantity) {

        this.fatContent = fatContent;
        this.LiterQuantity = LiterQuantity;

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
