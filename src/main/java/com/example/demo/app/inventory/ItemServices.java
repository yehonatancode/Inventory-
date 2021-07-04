package com.example.demo.app.inventory;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//inspired from https://www.youtube.com/watch?v=YLCeNwJSkk0&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x&index=19, adjusted syntax.
//implementing CRUD operations. 
@Service
public class ItemServices {

	@Autowired
	private ItemRepository ir;
	
	public ArrayList<Item> getAllItems(){
		ArrayList<Item> items = new ArrayList<Item>();
		ir.findAll().forEach(items::add);
		return items;
	}	

	public Item getItem(String no) {
		Item item = ir.findById(no).orElse(null); 
		return item;
	}

	public Item addItem(Item item) {
		ir.save(item);
		return item;
	}

	public Item updateItem(String no, Item item) {
		ir.save(item);
		return item;
	}

	public Item deleteItem(String no) {
		Item item = ir.findById(no).orElse(null); 
		ir.deleteById(no);
		return item;
	}
 	
}
