package projet.spring.services;

import java.util.List;

import projet.spring.entities.Product;

public interface ProductService {
	
	Product addProduct(Product p);
	void deleteProduct(Product p);
	void deleteProduct(long id_product);
	List<Product> getAllProduct();

}
