package com.example.demo.app.inventory;
import org.springframework.data.repository.CrudRepository;
//Github repo recommended Jpa, but it seems it has been deprecated
public interface ItemRepository extends CrudRepository<Item, String> {

}
