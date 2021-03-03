package com.example.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
public class Varient {

    @Id
    private ObjectId _id; //the SKU id

    private String name;
    private String lname;
    private ObjectId itemId;
    private List<AltId> altIds;
    private List<Item.Attribute> attrs;
    private List<Item.Assets> assets;
    public static class AltId{
        private String name;
        private Integer value;
    }

}
