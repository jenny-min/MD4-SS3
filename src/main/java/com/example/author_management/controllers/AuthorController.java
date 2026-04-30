package com.example.author_management.controllers;

import com.example.author_management.models.Author;
import com.example.author_management.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping()
    public String Test() {
        System.out.println("Test");
        return "test";
    }

    @GetMapping("/api/author")
    public ResponseEntity<List<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @PostMapping("/api/author")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.createAuthor(author));
    }
}
