package projet.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.spring.entities.Product;
import projet.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repProduct;

	@Override
	public Product addProduct(Product p) {
		repProduct.save(p);
		return p;
	}

	@Override
	public void deleteProduct(Product p) {
		repProduct.delete(p);
		
	}

	@Override
	public void deleteProduct(long id_product) {
		repProduct.deleteById(id_product);
		
	}

	@Override
	public List<Product> getAllProduct() {
		
		return (List<Product>) repProduct.findAll();
	}

}
