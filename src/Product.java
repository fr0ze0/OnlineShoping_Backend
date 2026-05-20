public abstract class Product implements Payable, Comparable<Product> {
    private int id = -1;
    protected String title;
    protected double price;
    protected String description;
    private ProductStatus status;
    private boolean paid = false;

    // Constructors

    public Product() {}

    public Product(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
        generateId();
    }

    public Product(String title, String description) {
        this.title = title;
        this.description = description;
        generateId();
    }

    // --- Payable ---

    @Override
    public double getFinalePrice() {
        return price;
    }

    @Override
    public void pay(double value) {
        if (value >= this.price) {
            this.paid = true;
            System.out.printf("Product %s is paid. Cost: %.2f", title, value);
        }
        else {
            System.out.printf("Not enough money for buying %s. Needed money: %.2f", title, value);
        }
    }

    @Override
    public boolean isPaid() {
        return this.paid;
    }

    // internal functions

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this != (Product)obj) return false;

        Product other = (Product) obj;

        return other.title.equals(this.title) && other.description.equals(this.description) && other.price == this.price;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() + this.description.hashCode() + this.id;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\n"
                + "Description: " + this.description + "\n"
                + "Price: " + this.price + "\n"
                + "Is paid: " + this.paid;
    }

    @Override
    public int compareTo(Product other) {
        return this.title.compareTo(other.title);
    }

    // --- Getters / Setters ---

    private void generateId() { this.id += 1; }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return this.status == ProductStatus.AVAILABLE;
    }
}
