package com.example.test.promotionengine.model;

import java.math.BigDecimal;
import java.util.List;

public class CombinedItemFixedPricePromotion extends Promotion{

    private List<String> sku;
    
    private BigDecimal fixedPrice;

    public CombinedItemFixedPricePromotion(List<String> sku, BigDecimal fixedPrice) {
        this.sku = sku;
        this.fixedPrice = fixedPrice;
    }

    public List<String> getSku() {
        return sku;
    }

    public void setSku(List<String> sku) {
        this.sku = sku;
    }

    public BigDecimal getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(BigDecimal fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
}
