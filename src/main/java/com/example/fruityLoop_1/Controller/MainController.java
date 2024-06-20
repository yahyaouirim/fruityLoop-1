package com.example.fruityLoop_1.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.fruityLoop_1.Model.Item;



@Controller
public class MainController{
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Orange", 3.5));
		fruits.add(new Item("Apple", 4.55));
		fruits.add(new Item("Grapes", 2.44));	
		model.addAttribute("fruits", fruits);
		
		return "index.jsp";
		
	}

}
