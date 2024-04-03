package com.boostmytool.beststore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boostmytool.beststore.models.Product;
import com.boostmytool.beststore.services.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping({"","/"})
	public String showProductList (Model model) {
		List<Product> products = productRepo.findAll();
		model.addAttribute("products",products);
		return "products/index";
	}
}
