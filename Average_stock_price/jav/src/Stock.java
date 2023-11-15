public class Stock {

    private int shares;
    private double price;
    private double capital;

    public void buy(double p, int s) {
        shares += s;
        price = p;
        capital += s * p;
    }

    public void sell(double p, int s) {
        shares += s;
        price = p;
        capital += s * p;
    }

    public int getShares() {
        return this.shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCapital() {
        return this.capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

}
