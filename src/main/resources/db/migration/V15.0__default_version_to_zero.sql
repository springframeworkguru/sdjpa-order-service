update order_header
   set version = 0 where version is null;

update order_line
   set version = 0 where version is null;