package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.ProductModel;
import com.hit.neuruimall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/getAllProduct")
    public List<ProductModel> getByAll() {
        return productService.getByAll();
    }

    @PostMapping("/getByAllProductDynamic")
    public List<ProductModel> getByAllDynamic(String DynamicProName, Integer minPrice, Integer maxPrice, String DynamicProducer, String DynamicProAddress) {
        return productService.getByAllDynamic(DynamicProName, minPrice, maxPrice, DynamicProducer, DynamicProAddress);
    }

    @PostMapping("/insertProduct")
    public ProductModel insert(ProductModel productModel) {
        productService.insert(productModel);
        return productModel;
    }

    @GetMapping("/getAllProductWithStocks")
    public List<ProductModel> getByAllWithStocks() {
        return productService.getByALlWithStocks();
    }

    @GetMapping("deleteProduct/{id}")
    public List<ProductModel> deleteById(@PathVariable("id") Integer id) {
        System.out.println("将要删除" + id);
        productService.deleteById(id);
        return productService.getByAll();
    }

    @GetMapping("/getProIds")
    public List<Integer> getAllId() {
        return productService.getAllId();
    }

    @GetMapping("/getProById")
    public ProductModel getById(Integer proId) {
        return productService.getById(proId);
    }

    @PostMapping("/updateProduct")
    public boolean update(ProductModel productModel) {
        productService.update(productModel);
        return true;
    }
}
