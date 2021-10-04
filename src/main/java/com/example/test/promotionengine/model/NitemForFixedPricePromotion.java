package com.example.test.promotionengine.model;

import java.math.BigDecimal;

public class NitemForFixedPricePromotion extends  Promotion {

    private String sku;
    private Integer numberOfItems;
    private BigDecimal fixedPrice;

    public NitemForFixedPricePromotion(String sku, Integer numberOfItems, BigDecimal fixedPrice) {
        this.sku = sku;
        this.numberOfItems = numberOfItems;
        this.fixedPrice = fixedPrice;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public BigDecimal getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(BigDecimal fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
}
