package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.ProductModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    public List<ProductModel> selectByAll();

    public List<ProductModel> selectByAllWithStocks();

    public void insert(ProductModel productModel);

    public void update(ProductModel productModel);

    public void deleteById(Integer proId);

    public List<Integer> selectAllId();

    public ProductModel selectById(Integer proId);

}
