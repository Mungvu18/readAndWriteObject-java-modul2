import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String codeProduct;
    private double price;

    public Product(String name, String codeProduct, double price) {
        this.name = name;
        this.codeProduct = codeProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
