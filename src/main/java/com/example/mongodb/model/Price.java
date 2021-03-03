package com.example.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Price {
    private String id; //_id: the id is built in a specific way. It is the concatenation of the item information and store information. The item information is either the item id or the variant id (SKU). The store information is either the store group id or the store id.
    private double price;
    private Sale sale;
    private Date lastUpdated;
    public static class Sale{
        private double salePrice;
        private Date saleEndDate;
    }
}
