package nextail.newRegister.model;

import java.util.Objects;

public class Item {
    private final String code;
    private final String name;
    private final int price;

    public Item (String code, String name, Int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }

    public Int getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(code, item.code) &&
                name = item.name && price == item.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, price);
    }
}