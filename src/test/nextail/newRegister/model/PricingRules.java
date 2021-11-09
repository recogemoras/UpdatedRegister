package nextail.newRegister.model;

import java.util.ArrayList;
import java.util.List;

public class PricingRules {
    private final List<PricingRuleType> pricing_rules = new ArrayList<>();

    public PricingRule(PricingRuleType ruleType) {
        this.ruleType = ruleType;
    }

    PricingRuleType getPricingRuleType() {
        return this.ruleType;
    }
}