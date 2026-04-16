import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Category implements Payable, Financable {
    private int count = 0;
    private int id = -1;
    protected String title;
    private double price;
    private String description;
    public HashMap<String, List<Category>> category = new HashMap<String, List<Category>>();
    public List <Category> logs = new ArrayList<Category>();

    protected List<Category> products;

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
