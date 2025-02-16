package com.service.fakestore.services;

import com.service.fakestore.Projection.gettitlepriceproduct;
import com.service.fakestore.dtos.FakeStoreProductdto;
import com.service.fakestore.exceptions.Productnotfoundexception;
import com.service.fakestore.models.Category;
import com.service.fakestore.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service("Fakestoreproductservice")
public class Fakestoreservice implements Productservice {
    private RestTemplate restTemplate;

    Fakestoreservice(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    Product convertFakeStoreDtoToProduct(FakeStoreProductdto Fakestoreproduct){
        Product product = new Product();
        product.setTitle(Fakestoreproduct.getTitle());
        product.setPrice(Fakestoreproduct.getPrice());
        product.setDescription(Fakestoreproduct.getDescription());
        product.setImage(Fakestoreproduct.getImage());
        return product;
    }

    public Product getproductbyid(Long id) throws Productnotfoundexception{
        FakeStoreProductdto fakeStoreProductdto= restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreProductdto.class);
        if(fakeStoreProductdto==null){
            throw new Productnotfoundexception(id,"Product with "+id+" not found");
        }
//        Product prod = convertFakeStoreDtoToProduct(fakeStoreProductdto);
//        System.out.println(prod);

        return convertFakeStoreDtoToProduct(fakeStoreProductdto);
    }

    public List<Product> getallproducts() {
        List<Product> result = new ArrayList<>();
        FakeStoreProductdto[] fakeStoreProductdtos = restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreProductdto[].class);
        for(FakeStoreProductdto fdto:fakeStoreProductdtos){
            result.add(convertFakeStoreDtoToProduct(fdto));
        }
        return result;
    }

    @Override
    public boolean deleteproductbyid(long id)  throws Productnotfoundexception{
      //  Product prod = getproductbyid(id);
       if(getproductbyid(id)!=null){
           restTemplate.delete("https://fakestoreapi.com/products/"+id);
           return true;
       }
       return false;
    }

    @Override
    public Product updateproductbyid(long id, Product product) {
        FakeStoreProductdto fakeStoreProductdto= new FakeStoreProductdto();

        fakeStoreProductdto.setTitle(product.getTitle());
        fakeStoreProductdto.setPrice(product.getPrice());
        fakeStoreProductdto.setDescription(product.getDescription());
        fakeStoreProductdto.setImage(product.getImage());


        RequestCallback requestCallback = restTemplate.httpEntityCallback(fakeStoreProductdto, FakeStoreProductdto.class);
        HttpMessageConverterExtractor<FakeStoreProductdto> responseExtractor =
                new HttpMessageConverterExtractor<>(FakeStoreProductdto.class,
                        restTemplate.getMessageConverters());
        FakeStoreProductdto response =
                restTemplate.execute("https://fakestoreapi.com/products/" + id, HttpMethod.PUT, requestCallback, responseExtractor);

        return convertFakeStoreDtoToProduct(response);

    }

    @Override
    public Product addproduct(Product product) {
        return null;
    }

    @Override
    public List<gettitlepriceproduct> getallproductbycategory(long id) {
        return List.of();
    }


}
