public abstract class Category {
    private int id = -1;
    protected String title;
    private double price;
    private String description;

    public Category() {}

    public Category(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
        generateId(this.id);
    }

    private void generateId(int id_start) {
        this.id = ++id_start;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
