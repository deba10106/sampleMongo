package com.example.mongodb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class ItemDTO {
    @Id
    private ObjectId _id; //Item id/SKU/UPC
    private com.example.mongodb.model.Item.Description desc;
    private String name;
    private String lname;
    private String category;
    private com.example.mongodb.model.Item.Brand brand;
    private com.example.mongodb.model.Item.Assets assets;
    private com.example.mongodb.model.Item.Shipping shipping;
    private List<com.example.mongodb.model.Item.Specification> specs;
    private List<com.example.mongodb.model.Item.Attribute> attrs;
    private List<com.example.mongodb.model.Item.Varients> varients;
    private Date lastUpdated;
    public static class Brand{
        @Id
        private ObjectId _id;

        private com.example.mongodb.model.Item.Image img;
        private String name;
    }
    public static class Image{
        private Integer width;
        private Integer height;
        private String title;
        private String src;
    }
    public static class Dimension{
        private String unit;
        private double height;
        private double length;
        private double width;
    }
    public static class Description{
        private String Lang;
        private String value;
    }
    public static class Attribute{
        private String name;
        private String value;
        private String family;
        private String dispType;
    }
    public static class Assets{
        private List<com.example.mongodb.model.Item.Image> imgs;
    }
    public static class Address{
        private String city;
        private String state;
        private String pincode;
    }
    public static class Shipping{
        private com.example.mongodb.model.Item.Dimension dimension;
        private com.example.mongodb.model.Item.Weight weight;
    }


    public static class Specification{
        private String name;
        private String value;
    }
    public static class Varients{
        private int cnt;
        private List<com.example.mongodb.model.Item.Attribute> attrs;
    }
    public static class Weight{
        private String unit;
        private double value;
    }

}

