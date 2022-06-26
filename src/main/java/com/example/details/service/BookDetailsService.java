package com.example.details.service;

import com.example.details.model.BookDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookDetailsService {
    public Optional<BookDetails> fetchDetails(int productId) {
        var details = new BookDetails();
        details.setType("hardcover");
        details.setPublisher("Independently published");
        details.setLanguage("english");
        details.setIsbn13("979-8758826720");
        details.setType("hardcover");
        details.setPages(114);
        return Optional.of(details);
    }
}
