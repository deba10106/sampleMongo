package com.example.mongodb.service;
import com.example.mongodb.model.Item;
import org.bson.types.ObjectId;

import java.util.List;

public interface ItemService {
   // public List<Item> getAllItems();
   // public Item getItemById(ObjectId _id);
    public ObjectId createNewItem(Item item);
   // public void deleteItembyId(ObjectId _id);
   // public List<Item> getItemByCity(String city);
    public List<Item> getItemByName(String name);
}
