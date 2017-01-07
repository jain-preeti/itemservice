package com.item.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.item.model.Item;
import com.item.service.ItemService;
@Service
public class ItemServiceImpl  implements ItemService{

	@Override
	public List<Item> getItems() {
		List<Item> items=new ArrayList<>();
		Item item=new Item();
		item.setItemId(1l);
		item.setItemName("Cable");
		item.setItemPrice(500l);
		items.add(item);
		return items;
	}

}
