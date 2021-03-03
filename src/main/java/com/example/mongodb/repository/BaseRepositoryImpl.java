package com.example.mongodb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;



public class BaseRepositoryImpl implements BaseRepository{
    @Autowired
    MongoTemplate mongoTemplate;

    /*public long delete(Item item){
        return mongoTemplate.remove(item).getDeletedCount();
    }
    public Item save(Item item){
        return mongoTemplate.save(item);
    }


    public List<Item> getByName(String name){
        Query query = new Query(Criteria.where("name").is(name));
        return mongoTemplate.find(query, Item.class);
    }

    public List<Item> getByNameAndCategory(String name, String cat){
        Query query = new Query();
        query.addCriteria(new Criteria().andOperator(
                Criteria.where("name").is(name),
                Criteria.where("category").is(cat)
        ));
        return mongoTemplate.find(query, Item.class);
    }
    public List<Item> findAll(){
        return mongoTemplate.findAll(Item.class);
    }
    public void deleteAll(){

        mongoTemplate.findAllAndRemove(Query.query(Criteria.where("").is("")),Item.class);
    }*/
}


