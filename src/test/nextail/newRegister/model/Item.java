package nextail.newRegister.model;

import java.util.Objects;

public class Item {
    private final String kind;
    private final Int price;

    public Item (String kind, Int price) {
        this.kind = kind;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public Int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(kind, item.kind) &&
                price == item.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, price);
    }
}