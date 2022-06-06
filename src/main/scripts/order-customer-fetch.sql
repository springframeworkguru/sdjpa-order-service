select orderheade0_.id                 as id1_3_0_,
       orderheade0_.created_date       as created_2_3_0_,
       orderheade0_.last_modified_date as last_mod3_3_0_,
       orderheade0_.bill_to_address    as bill_to_4_3_0_,
       orderheade0_.bill_to_city       as bill_to_5_3_0_,
       orderheade0_.bill_to_state      as bill_to_6_3_0_,
       orderheade0_.bill_to_zip_code   as bill_to_7_3_0_,
       orderheade0_.customer_id        as custome13_3_0_,
       orderheade0_.order_status       as order_st8_3_0_,
       orderheade0_.shipping_address   as shipping9_3_0_,
       orderheade0_.shipping_city      as shippin10_3_0_,
       orderheade0_.shipping_state     as shippin11_3_0_,
       orderheade0_.shipping_zip_code  as shippin12_3_0_,
       customer1_.id                   as id1_1_1_,
       customer1_.created_date         as created_2_1_1_,
       customer1_.last_modified_date   as last_mod3_1_1_,
       customer1_.address              as address4_1_1_,
       customer1_.city                 as city5_1_1_,
       customer1_.state                as state6_1_1_,
       customer1_.zip_code             as zip_code7_1_1_,
       customer1_.customer_name        as customer8_1_1_,
       customer1_.email                as email9_1_1_,
       customer1_.phone                as phone10_1_1_,
       orderappro2_.id                 as id1_2_2_,
       orderappro2_.created_date       as created_2_2_2_,
       orderappro2_.last_modified_date as last_mod3_2_2_,
       orderappro2_.approved_by        as approved4_2_2_,
       orderappro2_.order_header_id    as order_he5_2_2_
from order_header orderheade0_
         left outer join customer customer1_ on orderheade0_.customer_id = customer1_.id
         left outer join order_approval orderappro2_ on orderheade0_.id = orderappro2_.order_header_id
where orderheade0_.id = ?;

select orderheade0_.id                 as id1_3_0_,
       orderheade0_.created_date       as created_2_3_0_,
       orderheade0_.last_modified_date as last_mod3_3_0_,
       orderheade0_.bill_to_address    as bill_to_4_3_0_,
       orderheade0_.bill_to_city       as bill_to_5_3_0_,
       orderheade0_.bill_to_state      as bill_to_6_3_0_,
       orderheade0_.bill_to_zip_code   as bill_to_7_3_0_,
       orderheade0_.customer_id        as custome13_3_0_,
       orderheade0_.order_status       as order_st8_3_0_,
       orderheade0_.shipping_address   as shipping9_3_0_,
       orderheade0_.shipping_city      as shippin10_3_0_,
       orderheade0_.shipping_state     as shippin11_3_0_,
       orderheade0_.shipping_zip_code  as shippin12_3_0_,
       orderappro1_.id                 as id1_2_1_,
       orderappro1_.created_date       as created_2_2_1_,
       orderappro1_.last_modified_date as last_mod3_2_1_,
       orderappro1_.approved_by        as approved4_2_1_,
       orderappro1_.order_header_id    as order_he5_2_1_
from order_header orderheade0_
         left outer join order_approval orderappro1_ on orderheade0_.id = orderappro1_.order_header_id
where orderheade0_.id = ?;

select customer0_.id                 as id1_1_0_,
       customer0_.created_date       as created_2_1_0_,
       customer0_.last_modified_date as last_mod3_1_0_,
       customer0_.address            as address4_1_0_,
       customer0_.city               as city5_1_0_,
       customer0_.state              as state6_1_0_,
       customer0_.zip_code           as zip_code7_1_0_,
       customer0_.customer_name      as customer8_1_0_,
       customer0_.email              as email9_1_0_,
       customer0_.phone              as phone10_1_0_
from customer customer0_
where customer0_.id = ?;

select orderlines0_.order_header_id    as order_he5_4_0_,
       orderlines0_.id                 as id1_4_0_,
       orderlines0_.id                 as id1_4_1_,
       orderlines0_.created_date       as created_2_4_1_,
       orderlines0_.last_modified_date as last_mod3_4_1_,
       orderlines0_.order_header_id    as order_he5_4_1_,
       orderlines0_.product_id         as product_6_4_1_,
       orderlines0_.quantity_ordered   as quantity4_4_1_,
       product1_.id                    as id1_5_2_,
       product1_.created_date          as created_2_5_2_,
       product1_.last_modified_date    as last_mod3_5_2_,
       product1_.description           as descript4_5_2_,
       product1_.product_status        as product_5_5_2_
from order_line orderlines0_
         left outer join product product1_ on orderlines0_.product_id = product1_.id
where orderlines0_.order_header_id = ?;


select orderheade0_.id                 as id1_3_,
       orderheade0_.created_date       as created_2_3_,
       orderheade0_.last_modified_date as last_mod3_3_,
       orderheade0_.bill_to_address    as bill_to_4_3_,
       orderheade0_.bill_to_city       as bill_to_5_3_,
       orderheade0_.bill_to_state      as bill_to_6_3_,
       orderheade0_.bill_to_zip_code   as bill_to_7_3_,
       orderheade0_.customer_id        as custome13_3_,
       orderheade0_.order_approval_id  as order_a14_3_,
       orderheade0_.order_status       as order_st8_3_,
       orderheade0_.shipping_address   as shipping9_3_,
       orderheade0_.shipping_city      as shippin10_3_,
       orderheade0_.shipping_state     as shippin11_3_,
       orderheade0_.shipping_zip_code  as shippin12_3_
from order_header orderheade0_
where orderheade0_.customer_id = ?;

select orderlines0_.order_header_id    as order_he5_4_2_,
       orderlines0_.id                 as id1_4_2_,
       orderlines0_.id                 as id1_4_1_,
       orderlines0_.created_date       as created_2_4_1_,
       orderlines0_.last_modified_date as last_mod3_4_1_,
       orderlines0_.order_header_id    as order_he5_4_1_,
       orderlines0_.product_id         as product_6_4_1_,
       orderlines0_.quantity_ordered   as quantity4_4_1_,
       product1_.id                    as id1_5_0_,
       product1_.created_date          as created_2_5_0_,
       product1_.last_modified_date    as last_mod3_5_0_,
       product1_.description           as descript4_5_0_,
       product1_.product_status        as product_5_5_0_
from order_line orderlines0_
         left outer join product product1_ on orderlines0_.product_id = product1_.id
where orderlines0_.order_header_id in
      (select orderheade0_.id from order_header orderheade0_ where orderheade0_.customer_id = ?)



