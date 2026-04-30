package com.example.author_management.repositories;

import com.example.author_management.models.Author;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    public List<Author> authors = new ArrayList<>();

    public AuthorRepository() {
        authors.add(new Author(1, "John", "john@gmail.com"));
        authors.add(new Author(2, "Mary", "mary@gmail.com"));
        authors.add(new Author(3, "Henry", "henry@gmail.com"));

    }

    public List<Author> findAll() {
        return authors;
    }

    public void save(Author author) {
         this.authors.add(author);
    }

    public Author findById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public Author updateAuthor(Author author) {
        for (Author auth : authors) {
            if (auth.getId() == author.getId()) {
                auth.setName(author.getName());
                auth.setEmail(author.getEmail());
            }
        }
        return author;
    }
}
