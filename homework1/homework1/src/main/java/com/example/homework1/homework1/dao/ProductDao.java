package com.example.homework1.homework1.dao;

import com.example.homework1.homework1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {
    List<Product> findAllByExpirationDateIsGreaterThanOrExpirationDateIsNull(Date date);
    List<Product> findAllByExpirationDateIsLessThan(Date date);

}
