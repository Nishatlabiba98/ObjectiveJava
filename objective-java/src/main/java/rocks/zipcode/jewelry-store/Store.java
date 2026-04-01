package rocks.zipcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {

    private static final int MAX_STOCK = 20;

    private String name;
    private String ownerName;
    private List<Necklace> products;
    private int nextItemId;

    public Store(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
        this.products = new ArrayList<>();
        this.nextItemId = 1;
        restock();
    }

    public String getName() { return name; }
    public String getOwnerName() { return ownerName; }

    public Necklace[] getProducts() {
        return products.toArray(new Necklace[0]);
    }

    public void setName(String name) { this.name = name; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public void setProducts(Necklace[] products) {
        this.products = new ArrayList<>(Arrays.asList(products));
    }

    public Necklace sell(int itemId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getItemId() == itemId) {
                return products.remove(i);
            }
        }
        return null;
    }

    public void restock() {
        int needed = MAX_STOCK - products.size();
        for (int i = 0; i < needed; i++) {
            products.add(new Necklace(nextItemId++, "Necklace #" + nextItemId, 19.99));
        }
    }

    public int getStockCount() { return products.size(); }

    @Override
    public String toString() {
        return String.format("Store{name='%s', owner='%s', stock=%d}",
                name, ownerName, products.size());
    }
}