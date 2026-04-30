package com.example.author_management.services;

import com.example.author_management.models.Author;
import com.example.author_management.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return  authorRepository.findAll();
    }

    public Author createAuthor(Author author){
        authorRepository.save(author);
        return author;
    }

    public Author getAuthorById(int id){
        return authorRepository.findById(id);
    }

    public Author updateAuthor(int id, Author request) {
        if (getAuthorById(id) != null) {
            return   authorRepository.updateAuthor(request);
        } else {
            return null;
        }
    }
}
