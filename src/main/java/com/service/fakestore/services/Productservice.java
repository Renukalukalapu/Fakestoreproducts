package com.service.fakestore.services;

import com.service.fakestore.models.Product;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface Productservice {
    Product getproductbyid(Long id);
    List<Product> getallproducts();

    boolean deleteproductbyid(long id);

    Product updateproductbyid(long id, Product product);
}
