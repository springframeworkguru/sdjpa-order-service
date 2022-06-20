alter table order_header
    add column version integer;

alter table order_line
    add column version integer;