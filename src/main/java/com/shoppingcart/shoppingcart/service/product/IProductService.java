package com.shoppingcart.shoppingcart.service.product;

import java.util.List;

import com.shoppingcart.shoppingcart.model.Product;
import com.shoppingcart.shoppingcart.request.AddProductRequest;
import com.shoppingcart.shoppingcart.request.UpdateProductRequest;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(UpdateProductRequest request, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
