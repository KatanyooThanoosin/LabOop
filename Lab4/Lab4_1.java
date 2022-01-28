class Stock {
    // Attributes
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    // Constructors
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    // Methods
    public double getChangePercent() {
        return (this.currentPrice - this.previousClosingPrice) * 100 / this.previousClosingPrice;
    }
}

public class Lab4_1 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println("Symbol: " + stock.symbol);
        System.out.println("Name: " + stock.name);
        System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.printf("Price Change: %.15f%%", stock.getChangePercent());
    }
}