package com.example.homework1.homework1;

import com.example.homework1.homework1.dao.ProductDao;
import com.example.homework1.homework1.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productDao.save(product);
    }

    @GetMapping("/expirationDate")
    public List<Product> findAllByExpirationDateIsLessThan(
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date) {
        return productDao.findAllByExpirationDateIsLessThan(date);
    }
    @GetMapping("/notExpirationDate")
    public List<Product> findAllByExpirationDateIsGreaterThanOrExpirationDateIsNull(
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date) {
        return productDao.findAllByExpirationDateIsGreaterThanOrExpirationDateIsNull(date);
    }


}
