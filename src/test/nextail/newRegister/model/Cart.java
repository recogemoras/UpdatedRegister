package nextail.newRegister.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    Map<Item, int> cartItems = new HashMap<>();

    void addItem(Item item) {
        this.addCartItem(item);
    }

    Map<Item, int> cartItems() {
        return cartItems;
    }

    public void addCartItem(Item item) {
        if (cartItems.containsKey(item) {
            cartItems.replace(item, cartItems.get(item) + 1);
        }
        else {
            //need check for null item
            cartItems.put(item, 1);
        }
    }
}