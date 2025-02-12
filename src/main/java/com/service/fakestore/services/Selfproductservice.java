package com.service.fakestore.services;

import com.service.fakestore.Projection.gettitlepriceproduct;
import com.service.fakestore.exceptions.Productnotfoundexception;
import com.service.fakestore.models.Category;
import com.service.fakestore.models.Product;
import com.service.fakestore.repositories.CategoryRepository;
import com.service.fakestore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfproductservice")
public class Selfproductservice implements Productservice{
    ProductRepository productRepository;
    CategoryRepository categoryRepository;
    Selfproductservice(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }
    @Override
    public Product getproductbyid(Long id) throws Productnotfoundexception {
        return null;
    }

    @Override
    public List<Product> getallproducts() {
        return List.of();
    }

    @Override
    public boolean deleteproductbyid(long id) throws Productnotfoundexception {
        return false;
    }

    @Override
    public Product updateproductbyid(long id, Product product) {
        return null;
    }

    @Override
    public Product addproduct(Product product) {
  //      Category category =product.getCategory();

 //       Optional<Category> fetched_category=categoryRepository.findById(category.getId());
//        if(!fetched_category.isPresent()){
//            categoryRepository.save(category);
//        }
        Product savedproduct=productRepository.save(product);
        return savedproduct;
    }

    @Override
    public List<gettitlepriceproduct> getallproductbycategory(long id) {
        List<gettitlepriceproduct> ls = productRepository.gettitlepriceproduct(id);
        return ls;
    }


}
