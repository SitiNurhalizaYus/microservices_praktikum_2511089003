package com.microservices.product_service.controller;

import com.microservices.product_service.model.Product;
import com.microservices.product_service.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service = new ProductService();

    @GetMapping
    public List<Product> getProducts(){
        return service.getAllProducts();
    }

    @PostMapping
    public String addProduct(@RequestBody Product product){
        service.addProduct(product);
        return "Product added";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id,@RequestBody Product product){
        service.updateProduct(id,product);
        return "Product updated";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
        return "Product deleted";
    }
}

