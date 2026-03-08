package com.microservices.product_service.service;

import com.microservices.product_service.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts(){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void deleteProduct(Long id){
        products.removeIf(p -> p.getId().equals(id));
    }

    public void updateProduct(Long id, Product updatedProduct){
        for(Product product : products){
            if(product.getId().equals(id)){
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                product.setCategory(updatedProduct.getCategory());
            }
        }
    }
}