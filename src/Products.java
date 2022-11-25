import java.util.Objects;
import java.util.Set;

public class Products {
    private String productName;
    private int cost;
    private int weight;

    private Set<Products> products;



    public Products(String productName, int cost, int weight) {
        if (productName != null && !productName.isEmpty()) {
            this.productName = productName;
        } else {
            this.productName = "Заполните краточку товара полностью";
        }
        this.cost = cost;
        this.weight = weight;
    }



    public String getProductName() {
        return productName;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public void removeProduct(Object o) {
        if (this == o) {
            Products products = (Products) o;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        throw new RuntimeException("Попытка добавить имеющийся продукт");
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, cost);
    }

    @Override
    public String toString() {
        return "Наименование продукта: " + productName +
                ", стоимость: " + cost +
                ", вес: " + weight;
    }
}
