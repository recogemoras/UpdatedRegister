package nextail.newRegister.model;

public interface Catalog {
    void addCatalogItem(Item item);

    void addCatalogPromotions(PricingRules pricingRules);
}