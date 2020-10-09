 /* 1. Concatenating Details */

select concat(address,',',city) as 'Address' from student order by Address desc;

/*  2. Hotels that took order based on month */

select distinct hd.hotel_id,hd.hotel_name, hd.rating from 
hotel_details hd join orders o on hd.hotel_id=o.hotel_id where
month(order_date)=07 order by hd.hotel_id;


 /*  3. Rental details based on date */

 select rental_id,car_id,customer_id,
km_driven from rentals
where month(pickup_date) = 8
AND YEAR(pickup_date) = 2019
order by rental_id;

/*  4. Customer contact details */

SELECT customer_id, customer_name, COALESCE(address, email_id, 'NA')
AS contact_details
FROM customers;

/* 5. No of time rented by each car */

 select car_id,count(rental_id) NO_OF_TRIPS from rentals group by car_id order by car_id;

/*  6. Review of delivery partner based on rating */

 select partner_id,partner_name,
CASE
    WHEN rating >= 4 THEN 'GOOD'
    WHEN rating >= 2 and rating < 4 THEN 'AVERAGE'
    ELSE 'WORST'
END AS review
from delivery_partners
order by partner_id;


/*  7. Total sale daywise */

 select order_date,sum(order_amount) as 'TOTAL_SALE' from orders  group by order_date;

/*  8. Hotels not taken orders in a specific month */
/* this might give error give me PR for this query */

select h.hotel_id,hotel_name,hotel_type
from hotel_details h join orders o 
on h.hotel_id <> o.hotel_id
where month(o.order_date)!=5 and 
year(o.order_date)!=2019
order by h.hotel_id;

/*  9. Hotels that took order more than five times */

select h.hotel_id,hotel_name,
count(o.order_id) as NO_OF_ORDERS
from hotel_details h join orders o 
on h.hotel_id=o.hotel_id
group by h.hotel_id
having count(o.order_id) > 5 
order by h.hotel_id;

/*  10.  Credential details */

select concat(owner_name,owner_id) USERNAME ,
concat(substring(owner_name,1,3),owner_id) PASSWORD from owners order by USERNAME;

/*  11. Maruthi car owner details */

select distinct o.owner_id,owner_name,
address,phone_no from owners o join
cars c on o.owner_id=c.owner_id where car_name like 'Maruthi%'
order by o.owner_id  ;

/*  12.  Cars not taken for rent */
/* change the sequence as per question this might not pass the test case */

select distinct c.car_id,c.car_name,c.car_type from
cars c join rentals r
on c.car_id != r.car_id
where c.car_id in ('V008','V009')
order by c.car_id ;

/*  13.  Hotel_info */

select concat(hotel_name,' is a ',hotel_type,' hotel') as 'Hotel_info' from hotel_details order by Hotel_info desc;

/*  14.  Customer mail details */

select concat(customer_id,' mail id is ',email_id) from customers;

/*   15.  Order details */

select distinct o.order_id,customer_name,
hotel_name,order_amount from 
orders o join hotel_details h on
o.hotel_id=h.hotel_id
join customers c on o.customer_id=c.customer_id
order by
o.order_id;


