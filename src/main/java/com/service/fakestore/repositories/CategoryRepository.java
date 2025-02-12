package com.service.fakestore.repositories;

import com.service.fakestore.models.Category;
import com.service.fakestore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    List<Product> findAllById(Long id);
}
