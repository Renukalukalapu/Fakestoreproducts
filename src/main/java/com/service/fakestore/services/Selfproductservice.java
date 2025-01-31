package com.service.fakestore.services;

import com.service.fakestore.exceptions.Productnotfoundexception;
import com.service.fakestore.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfproductservice")
public class Selfproductservice implements Productservice{
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
}
