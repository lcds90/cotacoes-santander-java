create table public.tb_stock(
id numeric(9) not null,
"date" date not null,
"name" varchar(100) not null,
price numeric(8,2) not null,
variation numeric(5,2) not null,
constraint tb_stock_pk primary key(id)
);

CREATE SEQUENCE hibernate_sequence START 1