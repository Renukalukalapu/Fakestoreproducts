package com.service.fakestore.repositories;

import com.service.fakestore.Projection.gettitlepriceproduct;
import com.service.fakestore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByCategory_Id(Long id);

//    @Query("select p.title as title,p.price as price from Product p where p.id=:id")
//    List<gettitlepriceproduct>  gettitlepriceproduct(@Param("id") long id);

    @Query(value = "select title , price, description  from product  where id=:id", nativeQuery = true) //
    List<gettitlepriceproduct>  gettitlepriceproduct(@Param("id") long id);


}
