public class ElectronicItem extends Product {

    public ElectronicItem(String title, String description, double price) {
        super(title, description, price);
    }

    @Override
    public String toString() {
        return "[ELECTRONIC]" + super.toString();
    }
}
