public class GardenItem extends Product {

    public GardenItem(String title, String description, double price) {
        super(title, description, price);
    }

    @Override
    public String toString() {
        return "[GARDEN]" + super.toString();
    }


}
