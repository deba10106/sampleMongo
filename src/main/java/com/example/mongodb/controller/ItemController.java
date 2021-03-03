package com.example.mongodb.controller;

import com.example.mongodb.model.Item;
import com.example.mongodb.repository.ItemRepository;
import com.example.mongodb.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;
@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
  public class ItemController {
   @Autowired
   private ItemService itemService;
    @Autowired
    private ItemRepository repository;

   /* @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Item> getAllItems() {

        return itemService.getAllItems();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Item getItemById(@PathVariable("id") ObjectId _id) {
        return itemService.getItemById(_id);
    }

    @RequestMapping(value = "/city/{city}", method = RequestMethod.GET)
    public List<Item> getItemByCity(@PathVariable String city) {
        return itemService.getItemByCity(city);
    }*/

    @GetMapping("/name/")
    public List<Item> getItemByName(@PathParam("name") @RequestParam String name) {
        System.out.println(333);
        return itemService.getItemByName(name);
    }
  /*  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyItemById(@PathVariable("id") ObjectId id, @Valid @RequestBody Item item) {
        item.set_id(id);
        repository.save(item);
    }*/


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ObjectId createNewItem(@Valid @RequestBody Item item) {
        return itemService.createNewItem(item);
    }

   /* @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItembyId(@PathVariable ObjectId id) {
        itemService.deleteItembyId(id);
    }*/




  }
