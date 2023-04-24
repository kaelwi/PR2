package map;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Product p1 = new Product("Produkt 1", 100);
        p1.setDiscount(20);
        System.out.println(p1.getPriceWithDiscount());
        System.out.println(p1);

        Product p2 = new Product("Produkt 2", 100);
        p2.setDiscount(10);

        System.out.println(p1.equals(p2));


        Shop shop = new Shop();
        shop.add(p1);
        shop.add(p2);
        shop.gibtsWasGratis();

        System.out.println(shop.getProducts().keySet());
        System.out.println(shop.getProducts());
        shop.add(new Product("Produkt 3", 1000));
        shop.add(new Product("Produkt 4", 10000));
        shop.add(new Product("Produkt 5", 100000));

        System.out.println(shop.getProducts());
        ArrayList<Product> products = shop.getByPriceFrom(900);
        System.out.println(products);
        System.out.println();
        ArrayList<Product> products1 = shop.getByPriceTo(901);
        System.out.println(products1);

        System.out.println();
        System.out.println();

        System.out.println(shop.getProducts());
        System.out.println(shop.getProducts().size());
        System.out.println(products.size());
        shop.removeProductsFromByKeySet(900);
        System.out.println(shop.getProducts());
        System.out.println(shop.getProducts().size());
    }
}
