select b.product_name, a.name
from customers a
         inner join orders b on a.id = b.customer_id
where a.name = :name;