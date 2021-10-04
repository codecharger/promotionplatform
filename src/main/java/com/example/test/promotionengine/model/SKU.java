package com.example.test.promotionengine.model;

import java.math.BigDecimal;

public class SKU {

    private String identifier;
    private BigDecimal pricePerUnit;
    private String description;

    public SKU(String identifier) {
        this.identifier = identifier;
    }

    public SKU(String identifier, BigDecimal pricePerUnit) {
        this.identifier = identifier;
        this.pricePerUnit = pricePerUnit;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
