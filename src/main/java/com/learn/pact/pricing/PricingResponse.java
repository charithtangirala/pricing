package com.learn.pact.pricing;

import java.util.List;

public class PricingResponse {
    private List<Item> items;

    public PricingResponse(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
