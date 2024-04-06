package net.sqlconnector.sqlConnector.controller;

import net.sqlconnector.sqlConnector.model.Product;
import net.sqlconnector.sqlConnector.repository.ProductRepository;
import net.sqlconnector.sqlConnector.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product){
        return productService.saveProducts(product);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return productService.getProduct();
    }
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @PutMapping("/updateById/{id}")
    public Product updateProductById(@RequestBody Product product, @PathVariable int id){
        // Set the ID of the product
        product.setId(id);
        return productService.updateProductById(product);
    }
}
