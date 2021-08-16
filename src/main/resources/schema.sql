create table customers
(
    id           int primary key auto_increment,
    name         varchar(40) not null,
    surname      varchar(40) not null,
    age          int         not null,
    phone_number varchar(10)
);

create table orders
(
    id           int primary key auto_increment,
    date         date        not null,
    customer_id  int         not null,
    product_name varchar(40) not null,
    amount       int check ( amount > 0 ),
    foreign key (customer_id) references customers (id)
);