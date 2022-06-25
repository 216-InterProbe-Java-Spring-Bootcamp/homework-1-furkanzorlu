package com.example.homework1.homework1;


import com.example.homework1.homework1.dao.ProductCommentDao;
import com.example.homework1.homework1.entity.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments")
public class ProductCommentController {

    private final ProductCommentDao productCommentDao;

    @PostMapping
    public ProductComment save(@RequestBody ProductComment productComment) {
        return productCommentDao.save(productComment);
    }


    @GetMapping("/productId")
    public List<ProductComment> findAllByProduct_Id(Long id) {
        return productCommentDao.findAllByProduct_Id(id);
    }


    @GetMapping("/userId")
    public List<ProductComment> findAllByUser_Id(Long id) {
        return productCommentDao.findAllByUser_Id(id);
    }

    @GetMapping("/User_Id_CommentDateBetween")
    public List<ProductComment> findAllByUser_IdAndCommentDateBetween(
            @RequestParam Long id,
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date start,
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date end) {
        return productCommentDao.findAllByUser_IdAndCommentDateBetween(id, start, end);
    }
    @GetMapping("/Product_Id_CommentDateBetween")
    public List<ProductComment> findAllByProduct_IdAndCommentDateBetween(
            @RequestParam Long id,
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date start,
            @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date end) {
        return productCommentDao.findAllByProduct_IdAndCommentDateBetween(id, start, end);
    }

}
