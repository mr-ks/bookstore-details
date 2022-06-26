package com.example.details.controller;

import com.example.details.model.BookDetails;
import com.example.details.service.BookDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
    BookDetailsService bookDetailsService;

    @Autowired
    DetailsController(BookDetailsService bs) {
        bookDetailsService = bs;
    }

    @CrossOrigin
    @GetMapping("/details/{productId}")
    public ResponseEntity<BookDetails> bookDetailById(@PathVariable("productId") int productId) {
        return ResponseEntity.of(bookDetailsService.fetchDetails(productId));
    }
}
