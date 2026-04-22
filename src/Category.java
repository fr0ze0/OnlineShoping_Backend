import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Category implements Payable {
    private int id = -1;
    protected String title;
    private double price;
    private String description;
    private boolean paid = false;

    // Constructors

    public Category() {}

    public Category(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
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
        if (this != (Category)obj) return false;

        Category other = (Category) obj;

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
}
