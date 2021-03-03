package com.example.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
public class Summary {
   @Id
   private ObjectId _id;
   private String name;
   private String lname;
   private String dept;
   private String cat;
   private Item.Description desc;

   private List<String> attrs;
   private List<String> sattrs;
   private List<SummaryVarient> vars;
   public static class SummaryVarient{
       private Long id;
       private Item.Image img;
       private String attrs;

   }
}
