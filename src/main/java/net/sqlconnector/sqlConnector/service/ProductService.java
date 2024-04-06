package net.sqlconnector.sqlConnector.service;

import net.sqlconnector.sqlConnector.model.Product;
import net.sqlconnector.sqlConnector.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products);
    }
    public List<Product> getProduct(){
        return productRepository.findAll();
    }
    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }
    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Product removed !! "+id;
    }
    public Product updateProduct(Product product){
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        //assert existingProduct != null;
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());

        return productRepository.save(existingProduct);
    }
    public Product updateProductById(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setPrice(product.getPrice());

            return productRepository.save(existingProduct);
        } else {
            // Handle the case when the product with the given ID is not found
            return null; // or throw an exception
        }
    }
}
