package com.learn.pact.pricing;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class PricingController {
    public PricingResponse getPricingForInventory() {
        PricingResponse pricingResponse = new PricingResponse(Arrays.asList(
                new Item("ITEM_ID_1", "ITEM_NAME_1", 699),
                new Item("ITEM_ID_2", "ITEM_NAME_2", 9999),
                new Item("ITEM_ID_3", "ITEM_NAME_3", 199)
        ));

        return pricingResponse;
    }
}
