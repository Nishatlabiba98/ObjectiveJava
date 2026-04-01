package rocks.zipcode;

import java.time.LocalDate;

public class Necklace {

    private double price;
    private String name;
    private int itemId;
    private LocalDate dateCreated;

    public Necklace(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.dateCreated = LocalDate.now();
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    public int getItemId() { return itemId; }
    public LocalDate getDateCreated() { return dateCreated; }

    public void setPrice(double price) { this.price = price; }
    public void setName(String name) { this.name = name; }
    public void setItemId(int itemId) { this.itemId = itemId; }
    public void setDateCreated(LocalDate dateCreated) { this.dateCreated = dateCreated; }

    @Override
    public String toString() {
        return String.format("Necklace{id=%d, name='%s', price=%.2f, created=%s}",
                itemId, name, price, dateCreated);
    }
}