create table audit_user
(
    id SERIAL  not null primary key,
    action varchar(255),
    body varchar (1000),
    date TIMESTAMP
);
