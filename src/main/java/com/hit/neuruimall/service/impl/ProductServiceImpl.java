package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.ProductMapper;
import com.hit.neuruimall.model.ProductModel;
import com.hit.neuruimall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductModel> getByAll() {
        return productMapper.selectByAll();
    }

    @Override
    public List<ProductModel> getByAllDynamic(String DynamicProName, Integer minPrice, Integer maxPrice, String DynamicProducer, String DynamicProAddress) {
        if(DynamicProName!=null && DynamicProName.trim().length()>0) {
            DynamicProName="%"+DynamicProName+"%";
        }
        if(DynamicProducer!=null && DynamicProducer.trim().length()>0) {
            DynamicProducer="%"+DynamicProducer+"%";
        }
        if(DynamicProAddress!=null && DynamicProAddress.trim().length()>0) {
            DynamicProAddress="%"+DynamicProAddress+"%";
        }
        return productMapper.selectByAllDynamic(DynamicProName, minPrice, maxPrice, DynamicProducer, DynamicProAddress);
    }

    @Override
    public List<ProductModel> getByALlWithStocks() {
        return productMapper.selectByAllWithStocks();
    }

    @Override
    public void insert(ProductModel productModel) {
        productMapper.insert(productModel);
    }

    @Override
    public void update(ProductModel productModel) {
        productMapper.update(productModel);
    }

    @Override
    public void deleteById(Integer proId) {
        productMapper.deleteById(proId);
    }

    @Override
    public List<Integer> getAllId() {
        return productMapper.selectAllId();
    }

    @Override
    public ProductModel getById(Integer proId) {
        return productMapper.selectById(proId);
    }
}
