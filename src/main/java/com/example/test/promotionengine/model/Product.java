package com.example.test.promotionengine.model;

import java.math.BigDecimal;

public class Product {

    private SKU sku;
    private Integer quantity;
    private BigDecimal totalPrice;

    public Product(SKU sku, Integer quantity) {
        this.sku = sku;
        this.quantity = quantity;
    }

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }


}
