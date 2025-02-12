package com.service.fakestore.services;

import com.service.fakestore.Projection.gettitlepriceproduct;
import com.service.fakestore.exceptions.Productnotfoundexception;
//import com.service.fakestore.models.Product;
import com.service.fakestore.models.Product;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface Productservice  {
    Product getproductbyid(Long id) throws Productnotfoundexception;
    List<Product> getallproducts();

    boolean deleteproductbyid(long id) throws Productnotfoundexception;

    Product updateproductbyid(long id, Product product);
    Product addproduct(Product product);

    List<gettitlepriceproduct> getallproductbycategory(long id);
}
