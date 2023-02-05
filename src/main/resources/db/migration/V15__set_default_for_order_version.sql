update order_header
    set version = 0 where version = null;

update order_line
set version = 0 where version = null;
