package nextail.newRegister;

import nextail.newRegister.*;

import java.util.Locale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkout() {
    private final PricingRules pricing_rules = new ArrayList<>();

    public Checkout(PricingRules pricing_rules) {
        this.pricing_rules = pricing_rules;
    }

    void scan(String input) {
        //pending
        this.addScanedItem(String input);
    }
}