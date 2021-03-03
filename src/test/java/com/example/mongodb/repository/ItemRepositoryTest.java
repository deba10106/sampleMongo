package com.example.mongodb.repository;

import com.example.mongodb.model.Item;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRepositoryTest {


    @Autowired
    ItemRepository itemRepository;

    @Test
    public void createRows(){
        itemRepository.deleteAll();
        ObjectId id = new ObjectId();
        Item.Specification spec = new Item.Specification("width","1 cm");
        ArrayList<Item.Specification> specs = new ArrayList<Item.Specification>();
        specs.add(spec);
        itemRepository.save(new Item(id.get(), null,"Shoe","shoe","123/12/23",null,null,null, specs,null,null,null, new Item.Address("Kolkata",null,null)));
        itemRepository.save(new Item(id.get(), null,"Shoe","shoe","123/12/22",null,null,null,null,null,null,null, new Item.Address("Delhi",null,null)));
        itemRepository.save(new Item(id.get(), null,"LaptopA","laptop","123/11/21",null,null,null,null,null,null,null, new Item.Address("Delhi",null,null)));
        itemRepository.save(new Item(id.get(), null,"LaptopB","laptop","123/11/20",null,null,null,null,null,null,null, new Item.Address("Kolkata",null,null)));
        //itemRepository.findAll().forEach(System.out::println);
        //itemRepository.findByName("Laptop").forEach(System.out::println);
        itemRepository.findByCity("Delhi").forEach(System.out::println);
        //itemRepository.getByNameAndCategory("Shoe", "123/12/23").forEach(System.out::println);

    }

}