import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> products;
    public ProductService(List<Product> products) {this.products = products;}
    // Filter
    public List<Product> filter(ProductFilter f) {
        return products.stream().filter(p -> f.test(p)).collect(Collectors.toList());
    }

    public Product getCheapest() {
        return products.stream().filter(p -> p.isAvailable()).min(Comparator.comparingDouble(p -> p.getPrice())).orElse(null);
    }

    public Product getMostExpensive() {
        return products.stream().filter(p -> p.isAvailable()).max(Comparator.comparingDouble(p -> p.getPrice())).orElse(null);
    }

    public int countAvailable() {
        return (int) products.stream().filter(p -> p.getStatus() == ProductStatus.AVAILABLE).count();
    }

    public List<Product> sortBy(Comparator<Product> cmp) {
        return products.stream().sorted(cmp).collect(Collectors.toList());
    }

    public double totalValue() {
        return products.stream().filter(p -> p.isAvailable()).mapToDouble(p -> p.getPrice()).sum();
    }

    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public List<Product> getAll() {return products;}
}
