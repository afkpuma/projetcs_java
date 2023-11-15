public class Driver {

    public static void main(String[] args) {
        Stock comp = new Stock();
        comp.buy(36.5, 200);
        comp.sell(42.5, 1000);
        System.out.println(comp.getShares());
        System.out.println(comp.getPrice());
        System.out.println(comp.getCapital());
    }
}
