/*  Car & owner details based on car type */

select car_id, car_name, owner_id from cars where car_type in ('Hatchback','SUV') order by car_id;

/*  Customers having gmail id */

select customer_id,customer_name,address,phone_no from customers where email_id like '%@gmail.com' order by customer_id;

/*  Car details based on type and name */

select car_id, car_name, car_type from cars where car_type='Sedan' and car_name like 'Maruthi%' order by car_id;

/*  Delivery Partner details based on rating */

select partner_id,partner_name,phone_no from delivery_partners where rating between 3 and 5 order by partner_id;