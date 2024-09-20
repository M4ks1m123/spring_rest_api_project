package com.example.database_postgresql.services;

import com.example.database_postgresql.domain.entities.AuthorEntity;

public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity authorEntity);
}
