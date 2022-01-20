create table audit_user
(
    id SERIAL   not null primary key,
    action varchar(255),
    response varchar (1000)
);
