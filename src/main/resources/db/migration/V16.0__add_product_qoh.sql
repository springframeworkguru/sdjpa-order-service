alter table product
   add column quantity_on_hand integer default 0;

update product
    set product.quantity_on_hand = 10;