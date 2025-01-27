package com.service.fakestore.controllers;

import com.service.fakestore.exceptions.Productnotfoundexception;
import com.service.fakestore.models.Product;
import com.service.fakestore.services.Fakestoreservice;
import com.service.fakestore.services.Productservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private Fakestoreservice fakestoreservice;

    public ProductController(Fakestoreservice fakestoreservice) {
        this.fakestoreservice = fakestoreservice;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getproductbyid(@PathVariable("id") long id) throws Productnotfoundexception {
        return new ResponseEntity<>(fakestoreservice.getproductbyid(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Product>>  getallproducts(){
        
        return new ResponseEntity<>(fakestoreservice.getallproducts(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteproductbyid(@PathVariable("id") long id) throws Productnotfoundexception{
        if(fakestoreservice.deleteproductbyid(id)){
            return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
        }return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateproductbyid(@PathVariable("id") long id, @RequestBody Product product){
        return new ResponseEntity<>(fakestoreservice.updateproductbyid(id, product), HttpStatus.OK);
    }
}
