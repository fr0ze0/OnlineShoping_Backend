public abstract class Product {
    private int id;
    private String title;
    private double price;
    private String description;

    public Product() {}

    public Product(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
        generateId();
    }

    private void generateId() {
        String id_s = "";
        this.title.chars().forEach(c -> id_s.join(String.valueOf(c)));
        this.id = Integer.parseInt(id_s);
    }

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
}
