package com.boostmytool.beststore.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {

	@NotEmpty(message="Name is required")
	private String name;
	
	@NotEmpty(message="Brand is required")
	private String brand;
	
	@NotEmpty(message="Category is required")
	private String category;
	
	@Min(0)
	private double price;
	
	@Size(min = 10, message = "The description should be at least 10 characters")
	@Size(max = 2000, message = "The description can't exceed 2000 characters")
	private String description;

	private MultipartFile imageFile;
}
