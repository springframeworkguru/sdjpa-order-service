create table order_approval
(
    id                 bigint not null auto_increment primary key,
    approved_by        varchar(50),
    created_date       timestamp,
    last_modified_date timestamp
);

alter table order_header
    add column order_approval_id bigint;

alter table order_header
    add constraint order_approval_fk
        foreign key (order_approval_id) references order_approval (id);