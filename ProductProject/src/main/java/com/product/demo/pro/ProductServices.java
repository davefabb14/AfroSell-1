package com.product.demo.pro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
	@Autowired
	private  ProductRepository prorepos ;
	public List<Product> getAllProducts(){
		return  (List<Product>) prorepos.findAll();
	}
	public Optional<Product> getProduct(int id) {
		return  prorepos.findById(id);
	}
	public void addProduct(Product pro) {
		prorepos.save(pro);
		
		}
	public void updateProduct(Product pro, int id) {
		prorepos.save(pro);
		
	}
	public String deleteProduct(int id) {
		
		return null;
	}

}
