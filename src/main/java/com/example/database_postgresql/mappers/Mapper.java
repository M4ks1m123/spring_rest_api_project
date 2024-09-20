package com.example.database_postgresql.mappers;

public interface Mapper<A, B> {

    B mapTo(A a);
    A mapFrom(B b);

}
