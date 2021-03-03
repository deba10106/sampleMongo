package com.example.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Item {
    @Id
    private ObjectId _id; //Item id/SKU/UPC
    private Description desc;
    private String name;
    private String lname;
    private String category;
    private Brand brand;
    private Assets assets;
    private Shipping shipping;
    private List<Specification> specs;
    private List<Attribute> attrs;
    private List<Varients> varients;
    private Date lastUpdated;
    private Address address;

    public static class Brand{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long id;

        public Image img;
        public String name;
    }
    public static class Image{
        public Integer width;
        public Integer height;
        public String title;
        public String src;
    }
    public static class Dimension{
        public String unit;
        public double height;
        public double length;
        public double width;
    }
    public static class Description{
        public String Lang;
        public String value;
    }
    public static class Attribute{
        public String name;
        public String value;
        public String family;
        public String dispType;
    }
    public static class Assets{
        public List<Image> imgs;
    }
    public static class Address{
        public String city;
        public String state;
        public String pincode;

        public Address(String city, String state, String pincode) {
            this.city=city;
            this.state=state;
            this.pincode=pincode;
        }
    }
    public static class Shipping{
        public Dimension dimension;
        public Weight weight;
    }


    public static class Specification{
        public String name;
        public String value;

        public Specification(String name, String value) {
            this.name=name;
            this.value=value;
        }
    }
    public static class Varients{
        public int cnt;
        public List<Attribute> attrs;
    }
    public static class Weight{
        public String unit;
        public double value;
    }

}
