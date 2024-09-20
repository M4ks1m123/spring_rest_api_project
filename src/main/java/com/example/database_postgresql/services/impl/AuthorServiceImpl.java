package com.example.database_postgresql.services.impl;

import com.example.database_postgresql.domain.entities.AuthorEntity;
import com.example.database_postgresql.repositories.AuthorRepository;
import com.example.database_postgresql.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return  authorRepository.save(authorEntity);
    }
}
