create table usuarios(
    id serial primary key,
    login varchar(100) not null unique,
    senha varchar(255) not null
);