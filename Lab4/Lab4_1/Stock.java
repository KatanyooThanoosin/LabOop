public class Stock {
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