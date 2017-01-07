package com.item.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.item.model.Item;
import com.item.service.ItemService;

@RestController
@RequestMapping("")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Item>> getItemList() {
		List<Item> items = itemService.getItems();
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}

}
