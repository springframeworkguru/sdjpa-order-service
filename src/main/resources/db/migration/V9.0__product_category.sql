create table category (
      id bigint not null auto_increment primary key,
      description varchar(50),
      created_date timestamp,
      last_modified_date timestamp
);

create table product_category (
      product_id bigint not null,
      category_id bigint not null,
      primary key (product_id, category_id),
      constraint pc_product_id_fk FOREIGN KEY (product_id) references product(id),
      constraint pc_category_id_fk FOREIGN KEY (category_id) references category(id)
);

insert into product (description, product_status, created_date, last_modified_date)
values ('PRODUCT1', 'NEW', now(), now());

insert into product (description, product_status, created_date, last_modified_date)
values ('PRODUCT2', 'NEW', now(), now());

insert into product (description, product_status, created_date, last_modified_date)
values ('PRODUCT3', 'NEW', now(), now());

insert into product (description, product_status, created_date, last_modified_date)
values ('PRODUCT4', 'NEW', now(), now());

insert into category (description, created_date, last_modified_date) VALUES
 ('CAT1', now(), now());

insert into category (description, created_date, last_modified_date) VALUES
    ('CAT2', now(), now());

insert into category (description, created_date, last_modified_date) VALUES
    ('CAT3', now(), now());

insert into product_category (product_id, category_id)
  SELECT p.id, c.id FROM product p, category c
        where p.description = 'PRODUCT1' and c.description = 'CAT1';

insert into product_category (product_id, category_id)
SELECT p.id, c.id FROM product p, category c
where p.description = 'PRODUCT2' and c.description = 'CAT1';

insert into product_category (product_id, category_id)
SELECT p.id, c.id FROM product p, category c
where p.description = 'PRODUCT1' and c.description = 'CAT3';

insert into product_category (product_id, category_id)
SELECT p.id, c.id FROM product p, category c
where p.description = 'PRODUCT4' and c.description = 'CAT3';