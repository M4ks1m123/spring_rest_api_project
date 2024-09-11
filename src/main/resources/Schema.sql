drop table if exists "books";
drop table if exists "authors";

create table "authors" (
    "id" bigint default nextval('authors_id_seq') not null,
    "name" text,
    "age" integer,
    constraint "authors_pkey" primary key ("id")
);

create table "books"(
    "isbn" text not null,
    "title" text,
    "author_id" bigint,
    constraint "books_pkey" primary key ("isbn"),
    constraint "fk_author" foreign key (author_id) references authors(id)
)