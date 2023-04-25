package com.uom.saas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MainController {
	
	@GetMapping("/search")
	public List<String> hello() {
		List<String> list = new ArrayList<String>();
		list.add("Dulmini");
		list.add("Uddepa");
		list.add("Thashimika");
		list.add("Nithila");
		return list;
	}

}
