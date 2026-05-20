import java.util.Objects;

public class Category implements Comparable<Category> {
    private int id;
    private String name;
    private String description;
    public Category(String name, String description) {
        generateId();
        this.name = name;
        this.description = description;
    }

    @Override
    public int compareTo(Category other) {
        return name.compareToIgnoreCase(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Category)) return false;

        return Objects.equals(name, ((Category)o));
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Category#" + id
                + "Name: " + name;
    }

    public int getId() { return this.id;}

    public String getName() { return this.name; }

    public String getDescription() { return this.description; }



    private void generateId() { this.id += 1; }
}
