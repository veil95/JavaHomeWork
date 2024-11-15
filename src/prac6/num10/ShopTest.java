package prac6.num10;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer();
        shop.addComputer();
        shop.displayComputers();
        shop.removeComputer();
        shop.displayComputers();
        shop.searchComputer();
    }
}
