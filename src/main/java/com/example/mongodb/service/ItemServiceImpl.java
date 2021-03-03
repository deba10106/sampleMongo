package com.example.mongodb.service;

import com.example.mongodb.model.Item;
import com.example.mongodb.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemServiceImpl implements ItemService {



    @Autowired
    private ItemRepository itemRepository;






    @Override
    public List<Item> getItemByName(String name){
       // Query query = new Query()
       //         .addCriteria(Criteria.where("name").is(name))
                //.with(Sort.by(Sort.Order.asc("name")))
       //         .limit(3);
       // System.out.println("xxxxxxjhyjhy");
        //mongoTemplate.find(query, Item.class).forEach(System.out::println);
        return itemRepository.findByName(name);

       // return itemRepository.findByName(name);
    }


    @Override
    public ObjectId createNewItem(Item item){
        ObjectId id = new ObjectId();
        item.set_id(id.get());
        //itemRepository.save(item);
        return id;
    }

   // @Override
   // public void deleteItembyId(ObjectId _id){
     //   itemRepository.delete(itemRepository.findBy_id(_id));
    //}
}
