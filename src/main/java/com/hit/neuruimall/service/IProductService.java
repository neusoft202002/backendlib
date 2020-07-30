package com.hit.neuruimall.service;

import com.hit.neuruimall.model.ProductModel;

import java.util.List;

public interface IProductService {

    public List<ProductModel> getByAll();

    public List<ProductModel> getByAllDynamic(String DynamicProName, Integer minPrice, Integer maxPrice,
                                                 String DynamicProducer, String DynamicProAddress);

    public List<ProductModel> getByALlWithStocks();

    public void insert(ProductModel productModel);

    public void update(ProductModel productModel);

    public void deleteById(Integer proId);

    public List<Integer> getAllId();

    public ProductModel getById(Integer proId);
}
