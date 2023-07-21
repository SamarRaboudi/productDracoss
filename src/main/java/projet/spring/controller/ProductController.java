package projet.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projet.spring.entities.Product;
import projet.spring.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired 
	ProductService productService;
	
	@GetMapping("/products")
	@ResponseBody
	public List<Product> getAllProduct(){
		List<Product> list = productService.getAllProduct();
		return list;
		
	}
	
	@PostMapping("/addProduct")
	@ResponseBody
	public Product addProduct(@RequestBody Product p) {
		return productService.addProduct(p);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	@ResponseBody
	public void deleteProduct(@PathVariable("id") long id_product) {
		productService.deleteProduct(id_product);
	}
	

}
