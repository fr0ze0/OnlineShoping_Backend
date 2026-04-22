public class ElectronicItem extends Category {

    public ElectronicItem(String title, String description, double price) {
        this.setTitle(title);
        this.setDescription(description);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "[ELECTRONIC]" + super.toString();
    }
}
