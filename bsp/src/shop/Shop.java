package map;

import java.util.*;

public class Shop {
    // Key = String, Value = Product
    private Map<String, Product> products = new HashMap<>();

    public void add (Product p) {
        products.put(p.getTitle(), p);
    }

    public Product get(String title) {
        Product p = products.get(title);
        if (p == null) {
            System.out.println("Produkt nicht gefunden!");
        }

        return p;
    }

    // diente zur demonstration der verschiedenen schleifen
    public boolean gibtsWasGratis() {

        // für jedes Product p aus den values der Map products
        for (Product p : products.values()) {
            if (p.getDiscount() == 100) {
                return true;
            }
        }

        // für jeden key (String) aus dem keySet der map products
        for (String key : products.keySet()) {
            Product p = products.get(key);
            if (p.getDiscount() == 100) {
                return true;
            }
        }

        // für jeden map Eintrag <String, Product> aus dem entrySet
        for (Map.Entry<String, Product> e : products.entrySet()) {
            Product p = e.getValue();
            if (p.getDiscount() == 100) {
                return true;
            }
        }
        return false;
    }

    // gibt Produkte teurer als from zurück
    public ArrayList<Product> getByPriceFrom(double from) {
        // eine arraylist soll zurückgegeben werden, die wird hier leer vorbereitet
        ArrayList<Product> result = new ArrayList<>();

        for (String key : products.keySet()) {
            Product p = products.get(key);
            if (p.getPrice() > from) {
                // befüllen der arraylist
                result.add(p);
            }
        }

        return result;
    }

    // gibt Produkte günstiger als to zurück
    public ArrayList<Product> getByPriceTo(double to) {
        ArrayList<Product> result =  new ArrayList<>();

        /*
        for (Map.Entry<String, Product> e : products.entrySet()) {
            Product p = e.getValue();
            if (p.getPrice() < to) {
                result.add(p);
            }
        }
         */

        for (Product p : products.values()) {
            if (p.getPrice() < to) {
                result.add(p);
            }
        }

        return result;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    // entfernen aller produkte, die teurer als "from" sind
    public void removeProductsFromByIterator(double from) {
        Iterator<Map.Entry<String, Product>> it = products.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<String, Product> e = it.next();
            Product p = e.getValue();
            if (p.getPrice() > from) {
                it.remove();
            }
        }
    }

    // entfernen aller produkte, die teurer als "from" sind
    public void removeProductsFromByKeySet(double from) {
        // änderungen am keyset werden sich auch auf der map äussern -> entfernen der keys entfernt die pairs aus der map
        Set<String> keys = new HashSet<>();
        for (Product p : products.values()) {
            if (p.getPrice() > from) {
                keys.add(p.getTitle());
            }
        }
        // removeAll nimmt eine collection als parameter
        products.keySet().removeAll(keys);
    }
}
