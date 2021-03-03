package com.example.mongodb.repository;

import com.example.mongodb.model.Item;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>, BaseRepository, PagingAndSortingRepository<Item, String> {

    //List<Item> findAll();
    Item findBy_id(ObjectId _id);
    @Query(value="{ 'name' : ?0 }")
    List<Item> findByName(String name);
    @Query(value="{'Address.city':?0}")
    List<Item> findByCity(String city);

    // additional finder methods go here

}






