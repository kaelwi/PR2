package map;

import java.util.Objects;

public class Product {
    private String title;
    private double price;
    private double discount;
    private String description;

    public Product(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    public double getPriceWithDiscount() {
        return price - price * discount / 100;
    }

    @Override
    public String toString() {
        String result = "Product{" +
                "title='" + title + '\'' +
                ", price=" + getPriceWithDiscount();

        if (description != null && !description.isBlank()) {
            result += ", description=" + description;
        }

        result += "}";

        return result;
    }
}
