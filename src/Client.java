import java.util.ArrayList;
import java.util.List;

public class Client implements Financable {
    private String name;
    double wallet = 0;

    private List<Category> products = new ArrayList<>();

    public Client(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    // --- Financable

    @Override
    public double checkBalance() {
        return wallet;
    }

    @Override
    public boolean hasEnoughMoney(double value) {
        return value <= wallet;
    }

    @Override
    public String getFinanceStatus() {
        return "Client name: " + this.name + "\n"
                + "Wallet: " + this.wallet + "\n"
                + "Purchases: " + products.size();
    }

    // --- Internal Functions ---

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this != (Client)obj) return false;

        Client other = (Client) obj;

        return other.name.equals(this.name) && other.wallet == this.wallet && other.products.equals(this.products);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + (int)this.wallet;
    }

    // --- Getters

    public String getName() {
        return this.name;
    }

    public List<Category> getProducts() {
        return this.products;
    }
}
