public class stock {
    // Class members
    private float price;
    private String name;
    private String symbol;

    // Constructor
    public stock(float price, String name, String symbol) {
        this.price = price;
        this.name = name;
        this.symbol = symbol;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]"))
            this.name = name;
        else
            System.out.println("Please insert letters only");
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Please insert positive number");
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        if (name.matches("[a-zA-Z]"))
            this.name = symbol;
        else
            System.out.println("Please insert letters only");
    }
}
